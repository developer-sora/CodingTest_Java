import java.util.Scanner;

public class munza_apchuk {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		String str = sc.next();
		
		str= str+" "; // 빈 문자열 추가!!!!!!!! ****
		
		int cnt = 1;
		
		String answer="";
		
		for(int i = 0; i < str.length()-1; i++) { // 빈 문자열 전까지!!
			if(str.charAt(i)==str.charAt(i+1)) cnt++;  // 같을 때 카운트
			else {
				answer += str.charAt(i);   // 다르면 문자열 추가
				if(cnt>1) answer += cnt+"";  // cnt가 1보다 크고 뒤에 다른게 나오면 cnt 추가
				cnt=1;  // cnt 1로 초기화
			}
		}
			
		System.out.println(answer);
		
}
}
