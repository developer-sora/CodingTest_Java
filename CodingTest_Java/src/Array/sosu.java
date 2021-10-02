package Array;

import java.util.Scanner;

public class sosu {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int cnt = 0;

	int[] arr = new int[n+1];
	
	for(int i = 2; i <= n; i++) {
		if(arr[i]==0) {
			cnt++;
			
			for(int j=i; j<=n; j=j+i) arr[j]=1; // 중요!!!! 그 수의 배수 없애기
			}
		}
	
	System.out.println(cnt);
		
	}
	
}
