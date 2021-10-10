package Hash_Tree;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class kth_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int answer = -1;
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j<n; j++) {
				for(int l = j+1; l<n; l++) {
					ts.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		
		int cnt = 0;
		
		for(int x : ts) {
			cnt++;
			if(cnt==k) System.out.println(answer);    // k번째로 큰 수 구하기
		}
		
	}
}
