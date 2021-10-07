package TwoPoint;

import java.util.ArrayList;
import java.util.Scanner;

public class two_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int m = sc.nextInt();

		int[] b = new int[m];

		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		ArrayList<Integer> answer = new ArrayList<>();

		int p1 = 0, p2 = 0;
		while (p1 < n && p2 < m) {
			if (a[p1] < b[p2])
				answer.add(a[p1++]); // add 된 후 1증가함
			else
				answer.add(b[p2++]);
		}
		while (p1 < n)
			answer.add(a[p1++]); // a가 남아있다면
		while (p2 < m)
			answer.add(b[p2++]); // b가 남아있다면

		for (int x : answer) {
			System.out.println(x);
		}

	}
}
