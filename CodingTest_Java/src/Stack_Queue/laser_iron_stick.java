package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class laser_iron_stick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		int laser = 0;
		
		for(char x : c) {
			if(stack.peek()=='(' && x==')') { 
				stack.pop();
			}else stack.push(x);
		}
		
	
	}
}
