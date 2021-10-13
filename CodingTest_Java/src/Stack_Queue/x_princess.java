package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class x_princess {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		Queue<Integer> Q = new LinkedList<Integer>(); // Queue 선언법
		
		for(int i = 1; i <= n; i++) {
			Q.offer(i);   // 일단 숫자 전부 넣음
		}

		while(Q.size()>1) {
			for(int i = 1; i < m; i++) Q.offer(Q.poll()); // 앞에 넣은 걸 뒤에 넣으면서 없앰
				Q.poll();  // m번째이면 그냥 없애기
		}
		
		System.out.println(Q.peek());
		
	}
}
