package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class postfix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		
		Stack<Integer> stack = new Stack<>();
		
		for(char x : c) {
			if(!Character.isDigit(x)) {
				int rt = stack.pop();
				int lt = stack.pop(); // 변수 선언 먼저 하기!!
				if(x=='+') {
					stack.push(lt+rt);
				}else if(x=='-') {
					stack.push(lt-rt);
				}else if(x=='*') {
					stack.push(lt*rt);
				}else if(x=='/') {
					stack.push(lt/rt);
				}
			}else stack.push(x-'0'); // char을 int로 !!!!!!
		}
		System.out.println(stack.firstElement());
		
	}
}
