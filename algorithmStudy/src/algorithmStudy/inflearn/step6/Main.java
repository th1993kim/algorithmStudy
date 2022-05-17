package algorithmStudy.inflearn.step6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main t = new Main();
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(t.solution(s));
	}
	
	public String solution(String str) {
		String answer ="";
		int count = 0;
		char[] ch = str.toCharArray();
		List<Character> cList = new ArrayList<Character>();
		for(int i = 0 ; i<ch.length; i++) {
			if(cList.size()>0) {
				count = 0;
				for(Character t : cList) {
					if(ch[i] == t) count ++;
					
				}
				if(count == 0) cList.add(ch[i]);
			}else {
				cList.add(ch[i]);
			}
		}
		for(Character answerC : cList) {
			answer += answerC;
		}
		return answer;
	}
	
	public String solution2(String str) {
		String answer ="";
		for(int i=0; i<str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);	
		}
		return answer;
	}
}
