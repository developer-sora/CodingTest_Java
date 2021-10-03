package CodingTest_Array;

import java.util.Scanner;

public class rank {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int [] arr = new int[n];
	
	int[] answer = new int[n];
	
	int cnt = 1;
	
	for(int i = 0; i < n; i++) {
		arr[i]=sc.nextInt();
	}

	/* 이중 포문 !!!!!!!!!!!!!!!*/
	
	for(int i = 0; i < n; i++) {
		cnt=1;
		for(int j = 0; j < n; j++) {
			if(arr[i]<arr[j]) cnt++;
		}
		answer[i]=cnt;
	}
	
	for(int x : answer) {
		System.out.println(x);
	}
	
	
}
}
