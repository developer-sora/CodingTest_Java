import java.util.Scanner;

public class password {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	String s = sc.next();
	String answer = "";
	
	s = s.replaceAll("*", "0").replaceAll("#", "1");
	
	
	for(int i = 0; i < n; i++) {
		    answer+=(char) Integer.parseInt(s.substring(i*7,7*(i+1)),2);
	}
	
	// 혹은
	
	for(int i = 0; i < n; i++) {
		String tmp = s.substring(0,7).replaceAll("*", "0").replaceAll("#", "1");
		s = s.substring(7); // 앞에 7개 자름 즉 7번째 부터 시작!!
	}
	
	System.out.print(answer);
	
}
}
