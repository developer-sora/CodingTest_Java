package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class crane {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] board = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++)
			board[i][j] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		
		int[] moves = new int[m];
		
		for(int i = 0; i <m; i++) {
			moves[i]=sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		
		int cnt = 0;
		
		// 중요 ** peek ? stack의 가장 상단 값을 return 받음
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(board[j][moves[i]-1]!=0) {
					if(stack.isEmpty()) {
					 stack.push(board[j][moves[i]-1]);
					}
					else {
						if(stack.peek()==board[j][moves[i]-1]) {
							stack.pop();
							cnt++;
							cnt++;
						}
						else stack.push(board[j][moves[i]-1]);
					}
					board[j][moves[i]-1]=0;
					break;
				}
			}
		}
		
		/***** 풀이 *****/
		for(int pos : moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][pos-1]!=0) {
					int tmp = board[i][pos-1]; 
					board[i][pos-1]=0;
					if(!stack.isEmpty() && stack.peek()==tmp) { // 같은 인형이면 뺌
						cnt+=2;
						stack.pop();
					}
					else stack.push(tmp); // 다른 인형 or 비었으니까 넣어야함
					break; // 한번만 뽑고 멈춰야함
				}
			}
		}
		/**** 풀이 끝 *****/
		
		
		System.out.println(cnt);
		
				
	}
}
