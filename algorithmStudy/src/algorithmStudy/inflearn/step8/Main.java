package algorithmStudy.inflearn.step8;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(t.solution(str));
	}
	
	public String solution(String input) {
		char[] ch = input.toCharArray();
		int lt = 0;
		int rt = ch.length-1;
		while(lt<rt) {
			if(Character.isAlphabetic(ch[lt]) && Character.isAlphabetic(ch[rt])) {
				if(Character.toUpperCase(ch[lt]) != Character.toUpperCase(ch[rt])) return "NO";
				else {lt++; rt--;}
			}
			else if(!Character.isAlphabetic(ch[lt])) lt++;
			else if(!Character.isAlphabetic(ch[rt])) rt--;
		}
		return "YES";
	}
	
	public String solution2(String input) {
		String answer = "NO";
		input = input.toUpperCase().replaceAll("[^A-Z]", "");
		String reverse = new StringBuilder(input).reverse().toString();
		if(input.equals(reverse)) answer = "YES";
		return answer;
	}
	
}
