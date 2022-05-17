package algorithmStudy.inflearn.step10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char t = in.next().charAt(0);
		System.out.println(m.solution(str,t));
	}
	
	public String solution(String str, char t) {
		String calcuate = str;
		String result ="";
		int stack = 0;
		List<Integer> tIndexList = new ArrayList<>();
		while(calcuate.indexOf(t)>-1) {
			int j = calcuate.indexOf(t);
			
			stack += j;
			System.out.println("stack : " + stack);
			tIndexList.add(stack);
			calcuate = calcuate.substring(j);
			System.out.println("calcuate  : " +calcuate);
		}
		char[] charr = str.toCharArray();
		for(int i=0; i<charr.length; i++) {
			int min = 100;
			System.out.println("min :" + min);
			int tmp = 0;
			for(int x : tIndexList) {
				tmp = Math.abs(x-i);
				if(tmp<min) {
					min = tmp;
				}
			}
			result += min + " ";
		}
		return result;
	}
	
	public int[] solution2(String s , char t) {
		int[] answer = new int[s.length()];
		int p =1000;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == t) {
				p = 0;
			}else {
				p++;
			}
			answer[i] = p;
		}
		
		p= 1000;
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)==t) {
				p=0;
			}else {
				p++;
				answer[i]= Math.min(answer[i], p);
			}
		}
		
		return answer;
	}

}
