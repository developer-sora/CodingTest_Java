package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class remove_gwalho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = sc.next().toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
//		for(char x : arr) {
//			if(x=='(') stack.push(x); // '(' 일 때 넣고
//			else {
//				if(x==')') stack.pop(); // '('가 넣어져있고 ')'가 들어오면 '(' 삭제
//				else if(stack.isEmpty()||!stack.contains('(')) stack.push(x);
//				// stack이 비어있거나(괄호 모두 삭제) stack에 알파벳이 들어있으면 알파벳 넣기
//			}
//		}
		
		/******* 다른 풀이 *********/
		for(char x : arr) {
			if(x==')') {
				while(stack.pop()!='(');   // 여기서 멈춤!!!!
			}
			else stack.push(x);
		}
			
			for(char x : stack) {
			System.out.print(x);
		}
		
	}
}
