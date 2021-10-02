package Array;

import java.util.Scanner;

public class bigger_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		String answer = "";
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		answer += arr[0]+" ";
		
		for(int i = 1; i <n; i++) {
			if(arr[i]>arr[i-1]) {
				answer += arr[i]+" ";
			}
		}
		
		System.out.println(answer);
		
		// 혹은 ArrayList에 추가하기!
		
		
	}

}
