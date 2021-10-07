package TwoPoint;

import java.util.Scanner;

public class max_maechul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int answer=0, sum=0;
		
		for(int i = 0; i < m; i++) sum += a[i];
		answer = sum;
		for(int i = m; i < n ; i++) {
			sum+=(a[i]-a[i-m]); // m+1개 더하고 제일 앞에꺼 빼면 m개 더하는거 됨
			if(answer<sum) {
				answer=sum;
			}
		}
		System.out.println(answer);
		
	}	
	
}
