package Array;

import java.util.Scanner;

public class mieru_student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 1; // �� �ջ���� ������ ���̴ϱ�!
		
		int max = arr[0]; // �� �ջ������ �ʱ�ȭ
		
		for(int i = 0; i < n ; i++) {
			if(max<arr[i]) {
				cnt++;
				max = arr[i];
			}
		}
		System.out.println(cnt);
		
}
}
