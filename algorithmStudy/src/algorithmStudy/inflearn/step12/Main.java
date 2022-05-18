package algorithmStudy.inflearn.step12;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		String str = scan.next();
		System.out.println(t.solution(count,str));
	}
	
	public String solution2(int n , String str) {
		String answer ="";
		for(int i=0; i<n; i++) {
			String tmp = str.substring(0,7).replace('#','1').replace('*','0');
			int num = Integer.parseInt(tmp,2);
			answer += (char)num;
			str = str.substring(7);
		}
		
		return answer;
	}
	
	public String solution(int count , String str) {
		String result = "";
		int number;
		for(int i=0; i<count; i++) {
			String tmp = str.substring(i*7,i*7+7);
			tmp = tmp.replace('#', '1');
			tmp = tmp.replace('*', '0');
			number =Integer.parseInt(tmp,2);
			result += (char)number;
		}
		return result;
	}
	
}
