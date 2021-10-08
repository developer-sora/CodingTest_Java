package Hash_Tree;

import java.util.*;

public class all_anagram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] a = sc.next().toCharArray();
		
		char[] b = sc.next().toCharArray();

		Map<Character,Integer> am = new HashMap<>();
		
		Map<Character,Integer> bm = new HashMap<>();
		
		for(char x : b)	bm.put(x, bm.getOrDefault(x, 0)+1);

		for(int i = 0; i < b.length; i++) {
			am.put(a[i], am.getOrDefault(a[i], 0)+1);
		}

		int cnt = 0;

		if(am.equals(bm)) cnt++; 
		
		/****** map을 하나 만들어서 equals로 비교하는거 중요!! ****/
		
		int lt = 0;
		
		
		for(int rt = b.length; rt < a.length; rt++) {
			am.put(a[rt], am.getOrDefault(a[rt], 0)+1);
			am.put(a[lt], am.get(a[lt])-1);
			if(am.get(a[lt])==0) am.remove(a[lt]);
			if(am.equals(bm)) cnt++;
			lt++;
		}
	System.out.println(cnt);	
	}
}
