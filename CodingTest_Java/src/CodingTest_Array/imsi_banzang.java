package CodingTest_Array;

import java.util.Scanner;

public class imsi_banzang {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int[][] arr = new int[n+1][6];
	
	for(int i = 1; i <= n; i++) {      // 1번 학생부터 n번 학생까지
		for(int j = 1; j <= 5; j++) {  // 1학년부터 5학년까지
			arr[i][j] = sc.nextInt();
		}
	}
	
	int answer = 0;
	int max = Integer.MIN_VALUE;

	for(int i = 1; i <= n; i++) {      // 학생 번호
		int cnt = 0; // 학생 번호가 바뀌니까 학생 수 리셋
		for(int j = 1; j <= n; j++) {    
			for(int k = 1; k <= 5; k++) {       // 학년
				if(arr[i][k]==arr[j][k]) {
					System.out.println(arr[i][k]+":"+i+" "+arr[j][k]+":"+j);
					cnt++;
					break;
				}
			}
		}
		if(cnt>max) {
			max=cnt;
			answer=i;
		}
		
	}
	
	System.out.println(answer);
	
}
}
