package algorithmStudy.inflearn.step5;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Main t =  new Main();
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		t.solution(str);
	}
	
	public void swap(char[] charArr , int lt , int rt) {
		char tmp = charArr[lt];
		charArr[lt] = charArr[rt];
		charArr[rt] = tmp;
	}

	private void solution(String str) {
		char[] chaArr = str.toCharArray();
		int length = str.length();
		int lt = 0;
		int rt = length-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(chaArr[lt])) {
				lt ++;
			}else if(!Character.isAlphabetic(chaArr[rt])) {
				rt --;
			}else {
				swap(chaArr,lt,rt);
				lt ++;
				rt --;
			}
		}
		String answer = String.valueOf(chaArr);
		System.out.println(answer);
	}
}
