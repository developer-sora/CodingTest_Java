package CodingTest_Array;

import java.util.Scanner;

public class score_cal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int[] arr = new int[n];
	
	int score = 0;
	
	int sum = 0;
	
	for(int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	
//	if(arr[0]==1) {arr[0]=1; sum+=1;}
//	else arr[0]=0;
	
//	for(int i = 1; i < n; i++) {
//		if(arr[i]==0&&arr[i-1]==1) {
//			arr[i]=0;
//		}else if(arr[i]==0) {
//			arr[i]=0;
//		}else if(arr[i]==1&&arr[i-1]==score) {
//			score++;
//			arr[i]=score;
//			sum+=arr[i];
//		}else if(arr[i]==1&&arr[i-1]==0) {
//			score=1;
//			arr[i]=score;
//			sum+=arr[i];
//		}
//	}
	
//	System.out.println(sum);
	
	/* 다른 풀이 배열 구하는게 아니라 합계만 구하는거니까!!*/
	
	for(int i = 0; i < n; i++) {
		if(arr[i]==1) {
			score++;
			sum+=score;
		}else score=0;
		}
	System.out.println(sum);
}
}
