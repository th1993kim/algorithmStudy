package algorithmStudy.inflearn.step20;

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
		for(int x : t.solution2(count, num)) {
			System.out.print(x + " ");
		}
	}
	
	public int[] solution(int count,int[] num) {
		int max = 0;
		int dup = 0;
		int beforeMax = 10000;
		int[] grade = new int[count];
		for (int i=1; i<=count; i+=dup){
			dup =0;
			for(int j=0; j<count; j++)
				if(num[j]<beforeMax && max<num[j]  ) {
					max = num[j];
				}
			beforeMax = max;
			for(int j=0; j<count; j++)
				if(max == num[j]) {
					grade[j] = i;
					dup ++;
				}
			max=0;
		}
		return grade;
	}
	
	public int[] solution2(int n, int[] num) {
		int[] answer = new int[n];
		for(int i=0; i<n; i++) {
			int count =1;
			for(int j=0; j<n; j++) {
				if(num[i]<num[j]) count++;
			}
			answer[i] = count;
		}
		return answer;
	}
	
}
