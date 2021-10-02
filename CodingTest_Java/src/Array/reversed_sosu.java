package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class reversed_sosu {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();

	int[] arr = new int[n];
	
	for(int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	
	ArrayList<Integer> answer = new ArrayList<>();
	
	for(int i = 0; i<n; i++) {
		int tmp = arr[i]; // tmp에 넣는다
		int res = 0;
		while(tmp>0) {
			int t = tmp%10;
			res=res*10+t;
			tmp /= 10;
		}
		System.out.println(res);
	}
	
	
//	for(int i = 0; i < n; i++) {
//	}
	
	
	
}
}
