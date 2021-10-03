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
		
		/* 풀이 */
		
		int[][] arr = new int[n][n];
		
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[] dx = {-1,0,1,0}; // 상 우 하 좌 시계방항
		int[] dy = {0,1,0,-1};
		
		int nx,ny = 0;
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				boolean flag = true; // 플래그 초기화
				for(int k = 0; k < 4; k++) {
					nx = i + dx[k];
					ny = j + dy[k];
					if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) { // 인덱스 범위 제한
						flag = false;
						break; // 하나만 작아도 봉우리가 아니니까
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
