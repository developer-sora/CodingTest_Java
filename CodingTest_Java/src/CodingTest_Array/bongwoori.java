package CodingTest_Array;

import java.util.Scanner;

public class bongwoori {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
/*		
		int[][] arr = new int[n+2][n+2];
		
		int cnt = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(arr[i][j]>arr[i-1][j]&&arr[i][j]>arr[i][j-1]&&arr[i][j]>arr[i][j+1]&&arr[i][j]>arr[i+1][j]) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
*/
		
		/* Ǯ�� */
		
		int[][] arr = new int[n][n];
		
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[] dx = {-1,0,1,0}; // �� �� �� �� �ð����
		int[] dy = {0,1,0,-1};
		
		int nx,ny = 0;
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				boolean flag = true; // �÷��� �ʱ�ȭ
				for(int k = 0; k < 4; k++) {
					nx = i + dx[k];
					ny = j + dy[k];
					if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) { // �ε��� ���� ����
						flag = false;
						break; // �ϳ��� �۾Ƶ� ���츮�� �ƴϴϱ�
					}
				}
				if(flag) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
		
}
}
