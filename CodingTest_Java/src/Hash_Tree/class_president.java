package Hash_Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class class_president {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = sc.next();

		char[] arr = s.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		int max = Integer.MIN_VALUE;

		String answer = "";

		for (int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		/****** Ǯ�� ********/
		for (char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1); // x�� ������ 0 ������, ������ x�� ������
		}

		for (char key : map.keySet()) { // key ���
			if (map.get(key) > max) {
				max = map.get(key);
				answer = key + "";
			}
		}

		/*******************/

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				answer = entry.getKey().toString();
			}
		}
		System.out.println(answer);

	}
}
