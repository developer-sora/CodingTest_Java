package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class x_princess {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		Queue<Integer> Q = new LinkedList<Integer>(); // Queue �����
		
		for(int i = 1; i <= n; i++) {
			Q.offer(i);   // �ϴ� ���� ���� ����
		}

		while(Q.size()>1) {
			for(int i = 1; i < m; i++) Q.offer(Q.poll()); // �տ� ���� �� �ڿ� �����鼭 ����
				Q.poll();  // m��°�̸� �׳� ���ֱ�
		}
		
		System.out.println(Q.peek());
		
	}
}
