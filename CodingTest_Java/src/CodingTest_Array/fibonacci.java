package CodingTest_Array;

import java.util.Scanner;

public class fibonacci {
public static void main(String[] args) {
	/* Áß¿ä !!!!!!!!!!!! */
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int[] answer = new int [n];

	answer[0] = 1;
	answer[1] = 1;
	
	for(int i = 2; i < n; i++) {
		answer[i] += answer[i-2]+answer[i-1];
	}
	
	for(int x : answer) {
		System.out.println(x);
	}
	
	}
	

}
	
