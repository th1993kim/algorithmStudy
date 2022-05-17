package algorithmStudy.inflearn.step9;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Main t = new Main();
		
		System.out.println(t.solution(str));
	}
	
	public String solution(String str) {
		str = str.replaceAll("[^0-9]", "");
		return ""+Integer.parseInt(str);
	}
	
	public int solution2(String str) {
		int answer = 0;
		for(char x : str.toCharArray()) {
			if(x>=48 && x<=57) answer = answer *10+(x-48);
		}
		return answer;
	}
	
	public int solution3(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		return Integer.parseInt(answer);
	}
}
