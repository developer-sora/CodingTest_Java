package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class right_gwalho {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] arr = sc.next().toCharArray();
		
		Stack<Character> stack = new Stack<>();
			
		String answer = "NO";
		
		for(int i = 0; i <arr.length; i++) {
			if(stack.isEmpty()) {
				stack.push(arr[i]);
			}else if(stack.lastElement()=='('&&arr[i]==')') {
				stack.pop();
			}else stack.push(arr[i]);
		}
		
		/****** 다른 풀이 *********/
		for(char x : arr) {
			if(x=='(') stack.push(x);
			else {
				if(stack.isEmpty()) return;
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			answer="YES";
		}
		
		/***********************/
		
		if(stack.isEmpty()) {
			answer="YES";
			System.out.println(answer);
		}
		else System.out.println(answer);
		
		
		
		
	}
}
