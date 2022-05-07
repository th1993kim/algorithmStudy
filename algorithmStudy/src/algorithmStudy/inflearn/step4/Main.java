package algorithmStudy.inflearn.step4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public ArrayList<String> solution(int n , String[] strArr) {
		ArrayList<String> answer = new ArrayList<String>();
		
		for(String str : strArr) {
			String tmp = new StringBuilder(str).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	
	public ArrayList<String> solution2(int n , String[] strArr){
		ArrayList<String> answer = new ArrayList<>();
		for(String x: strArr) {
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = s.length-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main t =  new Main();
		
		Scanner in = new Scanner(System.in);
		System.out.print("입력할 갯수를 정하세요 :" );
		int n = 0;
		n = in.nextInt();
		String[] strArr = new String[n];
		for(int i=0; i<n; i++) {
			strArr[i] = in.next();
		}
		
		for(String x : t.solution(n,strArr) ) {
			System.out.println(x);
		}
		
	}

}
