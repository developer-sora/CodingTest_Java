package TwoPoint;

import java.util.Scanner;

public class max_yeonsok {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		int lt = 0;
		
		int max = 0;
		
		for(int rt = 0; rt < n; rt++) {
			sum+=arr[rt];
			if(rt-sum == k) {
				sum-=arr[lt];
				lt++;
				System.out.println(rt);
			}
		}
		
		
		
	}
}
