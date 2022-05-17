package algorithmStudy.inflearn.step11;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println(t.solution(str));
	}
	
	public String solution(String str) {
		String result ="";
		char A=' ';
		int count =1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==A) {
				count++;
			}else{
				if(i != 0) result += String.valueOf(A);
				if(count != 1) result += count;
				
				A = str.charAt(i);
				count =1;
			}
			
			if(i==str.length()-1) {
				result += String.valueOf(A);
				if(count != 1) result += count;
			}
		}	
		return result;	
	}
	
	public String solution2(String str) {
		String answer = "";
		str += " ";
		int cnt = 1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt ++;
			else {
				answer += String.valueOf(str.charAt(i));
				if(cnt>1) answer += String.valueOf(cnt);
				cnt =1;
			}
		}
		return answer;
	}
}
