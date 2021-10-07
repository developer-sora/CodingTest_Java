package TwoPoint;

import java.util.Scanner;

public class bubun_suyeol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		
		int lt = 0;
		
		int sum = 0;
		
//		while(rt<n) {
//		if(sum < m) {
//			sum+=arr[rt];
//			rt++;
//		}else if(sum > m) {
//			sum-=arr[lt];
//			lt++;
//		}else {
//			cnt++;
//			sum-=arr[lt];
//			lt++;
//		}
//		}
		
		for(int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			if(sum == m) cnt++;
			while(sum >= m) {
				sum-=arr[lt++];
				if(sum==m) cnt++;
			}
		}
		
		System.out.println(cnt);
		

	}
}
