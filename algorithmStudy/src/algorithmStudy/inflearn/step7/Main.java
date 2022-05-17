package algorithmStudy.inflearn.step7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main t = new Main();
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(t.solution(input));

	}
	
	public String solution(String input) {
		input = input.toUpperCase();
		char[] cr = input.toCharArray();
		int lt =0;
		int rt =input.length()-1;
		while(lt<rt) {
			if(cr[lt] != cr[rt]) {
				return "NO";
			}else {
				lt++;
				rt--;
			}
		}
		return "YES";
	}
	
	public String solution2(String input) {
		for(int i=0; i<input.length()/2; i++) {
			if(input.charAt(i) != input.charAt(input.length()-i-1)) return "NO";
		}
		return "YES";
	}
	
	public String solution3(String input) {
		input = input.toUpperCase();
		String reverse = new StringBuilder(input).reverse().toString();
		if(input.equals(reverse)) return "YES";
		return "NO";
	}
}
