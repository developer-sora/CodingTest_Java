package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class x_laser_iron_stick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		int answer = 0;
		
		// �� Ǯ��(���ǿ��� ��Ʈ ��� ǰ)
		// �߸� �������� �����ϴ� ���� ����Ʈ!!!
		
		stack.push(c[0]); //for���� 1���� �����ϴϱ� 0��° ó���� �־���
		
		for(int i = 1; i < c.length; i++) { 
			if(c[i-1]=='(' && c[i]==')') { // �ٷ� ���� '('�̰� ���� �ִ°� ')'�̸� ��������
				stack.pop();               // ( ������ ���ֹ�����
				answer+=stack.size();      // �����Ѵ� ( �߸� �����)
			}else if(c[i-1]==')' && c[i]==')') { // ���� �ٷ� ���� ')' �̰� ���ݰ� ')'�̴� == �׷� ������� ���̴�
				stack.pop(); // ����ִ� (�� ���ش� == ����⸦ ���ش�
				answer++;  // �߸� ����� �߰�  
			}
			else stack.push(c[i]); // �� �� �ֱ�
		}
		
		/******* Ǯ�� *********/
		for(int i = 0; i < c.length; i++) {
			if(c[i]=='(') stack.push('(');
			else {                             // '('�϶� ���°Ŵϱ� '('�� �ٽ�....
				stack.pop();
				if(c[i-1]=='(') answer+=stack.size();
				else answer++;
			}
		}
		
		
		System.out.println(answer);
	
	}
}
