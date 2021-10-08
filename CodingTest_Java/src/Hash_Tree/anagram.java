package Hash_Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class anagram {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();

		String b = sc.next();

		String answer = "YES";

		Map<Character, Integer> map = new HashMap<>();

		for (char x : a.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		for (char x : b.toCharArray()) {
			if (!map.containsKey(x) || map.get(x) == 0)
				answer = "NO"; // �ƿ� ���� �� ���� �ȵ� �� ó��
			map.put(x, map.get(x) - 1);
		}

//		for(char key : map.keySet()) {
//			if(map.get(key)!=0) answer="NO";
//		}

		System.out.println(answer);

	}
}
