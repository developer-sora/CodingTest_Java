import java.util.Scanner;

public class munza_apchuk {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		String str = sc.next();
		
		str= str+" "; // �� ���ڿ� �߰�!!!!!!!! ****
		
		int cnt = 1;
		
		String answer="";
		
		for(int i = 0; i < str.length()-1; i++) { // �� ���ڿ� ������!!
			if(str.charAt(i)==str.charAt(i+1)) cnt++;  // ���� �� ī��Ʈ
			else {
				answer += str.charAt(i);   // �ٸ��� ���ڿ� �߰�
				if(cnt>1) answer += cnt+"";  // cnt�� 1���� ũ�� �ڿ� �ٸ��� ������ cnt �߰�
				cnt=1;  // cnt 1�� �ʱ�ȭ
			}
		}
			
		System.out.println(answer);
		
}
}
