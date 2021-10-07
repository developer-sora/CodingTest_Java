package TwoPoint;

import java.util.Scanner;

public class yeonsok_jayeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		int answer = 0;
		
		int lt = 1;
		
		for(int rt = 1; rt <= n/2+1; rt++) { // 8+9 부터는 15보다 크니까
			sum += rt;
			if(sum == n) answer++;
			while(sum >= n) {
				sum -= lt++;
				if(sum==n) answer++;
			}
		}
		System.out.println(answer);
		
	}
}
