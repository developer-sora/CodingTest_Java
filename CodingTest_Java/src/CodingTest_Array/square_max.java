package CodingTest_Array;

import java.util.Scanner;

public class square_max {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int sum = 0;
	
	int max = 0;
	
	int[][] arr = new int[n][n];
	
	for(int i = 0; i < n; i++) {
		for(int j = 0; j < n; j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	
	 // ��
	for(int i = 0; i < n; i++) {
			sum = 0;
		for(int j = 0; j < n; j++) {
			sum += arr[i][j];
			if(max<sum) {
				max=sum;
			}
		}
	}
	
	// ��
	for(int i = 0; i < n; i++) {
		sum = 0;
		for(int j = 0; j < n; j++) {
			sum += arr[j][i];
			if(max<sum) {
				max=sum;
			}
		}
	}
	
	/* ���̶� �� ���� ����ϱ� !!!!*/
	
	int answer = Integer.MIN_VALUE;
	int sum1, sum2;
	for(int i = 0; i < n; i++) {
		sum1=sum2=0;
		for(int j = 0; j < n; j++) {
			sum1+=arr[i][j];
			sum2+=arr[j][i];
		}
		answer=Math.max(answer, sum1); // ���� �ִ�
		answer=Math.max(answer, sum2); // ���� �ִ�
	}
	
	
	/* �밢�� ���� */
	
	sum1=sum2=0;
	
	for(int i = 0; i < n; i++) {
		sum1+=arr[i][i];
		sum2+=arr[i][n-i-1];
	}
	answer=Math.max(answer, sum1); // �밢��1�� �ִ�
	answer=Math.max(answer, sum2); // �밢��2�� �ִ�

	
	// �밢��
	sum=0;
	for(int i = 0; i < n; i++) {
		sum += arr[i][i];
		if(max<sum) {
			max=sum;
		}
	}
	
	sum=0;
	for(int i = 0; i < n; i++) {
		sum += arr[i][(n-1)-i];
		if(max<sum) {
			max=sum;
		}
	}
	
	System.out.println(max);
	
}
}
