package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class remove_gwalho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = sc.next().toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
//		for(char x : arr) {
//			if(x=='(') stack.push(x); // '(' �� �� �ְ�
//			else {
//				if(x==')') stack.pop(); // '('�� �־����ְ� ')'�� ������ '(' ����
//				else if(stack.isEmpty()||!stack.contains('(')) stack.push(x);
//				// stack�� ����ְų�(��ȣ ��� ����) stack�� ���ĺ��� ��������� ���ĺ� �ֱ�
//			}
//		}
		
		/******* �ٸ� Ǯ�� *********/
		for(char x : arr) {
			if(x==')') {
				while(stack.pop()!='(');   // ���⼭ ����!!!!
			}
			else stack.push(x);
		}
			
			for(char x : stack) {
			System.out.print(x);
		}
		
	}
}
