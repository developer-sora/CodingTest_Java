package CodingTest_Array;

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
	
	for(int i = 0; i<n; i++) {     // 숫자 뒤집기!!!
		int tmp = arr[i]; // tmp에 넣는다
		int res = 0;
		while(tmp>0) {
			int t = tmp%10;
			res=res*10+t;
			tmp /= 10;
		}
		if(isPrime(res)) answer.add(res);
	}
	
	for(int x : answer) {
	System.out.print(x+" ");
	}
}

 public static boolean isPrime(int num) {
	 if(num==1) return false;
	 for(int i = 2; i < num; i++) {
		 if(num%i==0) return false;
	 }
	return true;
 }

}
