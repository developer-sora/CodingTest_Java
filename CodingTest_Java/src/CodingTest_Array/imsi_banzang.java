package CodingTest_Array;

import java.util.Scanner;

public class imsi_banzang {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int[][] arr = new int[n+1][6];
	
	for(int i = 1; i <= n; i++) {      // 1�� �л����� n�� �л�����
		for(int j = 1; j <= 5; j++) {  // 1�г���� 5�г����
			arr[i][j] = sc.nextInt();
		}
	}
	
	int answer = 0;
	int max = Integer.MIN_VALUE;

	for(int i = 1; i <= n; i++) {      // �л� ��ȣ
		int cnt = 0; // �л� ��ȣ�� �ٲ�ϱ� �л� �� ����
		for(int j = 1; j <= n; j++) {    
			for(int k = 1; k <= 5; k++) {       // �г�
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
