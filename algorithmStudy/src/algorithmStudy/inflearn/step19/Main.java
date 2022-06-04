package algorithmStudy.inflearn.step19;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main t = new Main();
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] num = new int[count];
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}
		//System.out.println(t.solution(count,num));
		System.out.print(t.solution(count, num));
	}
	
	public Integer solution(int count,int[] num) {
		int[] result = new int[count]; 
		int stack = 0;
		int sum = 0;
		for(int i =0; i<count; i++) {
			if(num[i] == 0) 
				stack = 0;
			else 
				stack++;
			result[i] = stack;
		}
		
		for(int n : result)
			sum += n;
		return sum;
		
	}
	
}
