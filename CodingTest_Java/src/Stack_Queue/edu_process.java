package Stack_Queue;

import java.util.*;

public class edu_process {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		String b = sc.next();
		
		Queue<Character> Q = new LinkedList<>();
		Queue<Character> Q2 = new LinkedList<>();
	
		for(int i = 0; i < a.length(); i++) {
			Q.offer(a.charAt(i));
		}
		
		for(int i = 0; i < b.length(); i++) {
			Q2.offer(b.charAt(i));
		}
		
		int cnt=0;

		while(Q2.size()!=0) {
		if(Q.contains(Q2.peek())) {
			Q2.poll();
			cnt++;
		}else
			Q2.poll();
		}

		if(Q.size()==cnt) {
			System.out.println("YES");
		}else System.out.println("NO");
		
		/******** Ǯ�� *******/
		// Queue �ΰ� ���� �ʿ� ����!!
		
		for(char x : a.toCharArray()) Q.offer(x); //�ʼ� ���� �־���
		for(char x : b.toCharArray()) {
			if(Q.contains(x)) {    // ���� �ʼ� ���� ������ § ������ ����ִٸ�
				if(x!=Q.poll()) System.out.println("NO"); 
				// �ʼ� ���� ���� �տ��ִ� �Ͱ� ������ ��ġ���� ������ ������� §�� �ƴ�
			}
		}
		if(!Q.isEmpty()) System.out.println("NO"); // �ʼ� ������ ��� �̼����� �ʾ���(���Ծ���)
	}
}
