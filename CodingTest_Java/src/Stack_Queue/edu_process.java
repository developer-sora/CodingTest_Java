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
		
		/******** 풀이 *******/
		// Queue 두개 만들 필요 없다!!
		
		for(char x : a.toCharArray()) Q.offer(x); //필수 과목 넣어줌
		for(char x : b.toCharArray()) {
			if(Q.contains(x)) {    // 만약 필수 과목에 현수가 짠 과목이 들어있다면
				if(x!=Q.poll()) System.out.println("NO"); 
				// 필수 과목 가장 앞에있는 것과 과목이 일치하지 않으면 순서대로 짠게 아님
			}
		}
		if(!Q.isEmpty()) System.out.println("NO"); // 필수 과목을 모두 이수하지 않았음(빼먹었음)
	}
}
