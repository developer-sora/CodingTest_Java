package Hash_Tree;

import java.util.*;

public class maechul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		Map<Integer,Integer> map = new HashMap<>();
		
		int lt = 0;
		
		for(int i = 0; i < m; i++) {
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		
		answer.add(map.size());
		
		for(int rt = m; rt < n; rt++) {
			map.put(arr[rt],map.getOrDefault(arr[rt], 0)+1); 
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) map.remove(arr[lt]);
			answer.add(map.size());
			lt++;
		}

		for(int x : answer) {
			System.out.print(x+" ");
		}

	}
}
