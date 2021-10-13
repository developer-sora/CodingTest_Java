package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class x_laser_iron_stick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		int answer = 0;
		
		// 내 풀이(강의에서 힌트 얻고 품)
		// 잘린 막대기들을 누적하는 것이 포인트!!!
		
		stack.push(c[0]); //for문이 1부터 시작하니까 0번째 처음에 넣어줌
		
		for(int i = 1; i < c.length; i++) { 
			if(c[i-1]=='(' && c[i]==')') { // 바로 전게 '('이고 지금 넣는게 ')'이면 레이저다
				stack.pop();               // ( 넣은걸 없애버리고
				answer+=stack.size();      // 누적한다 ( 잘린 막대기)
			}else if(c[i-1]==')' && c[i]==')') { // 만약 바로 전게 ')' 이고 지금게 ')'이다 == 그럼 막대기의 끝이다
				stack.pop(); // 들어있는 (를 없앤다 == 막대기를 없앤다
				answer++;  // 잘린 막대기 추가  
			}
			else stack.push(c[i]); // 그 외 넣기
		}
		
		/******* 풀이 *********/
		for(int i = 0; i < c.length; i++) {
			if(c[i]=='(') stack.push('(');
			else {                             // '('일때 빼는거니까 '('가 핵심....
				stack.pop();
				if(c[i-1]=='(') answer+=stack.size();
				else answer++;
			}
		}
		
		
		System.out.println(answer);
	
	}
}
