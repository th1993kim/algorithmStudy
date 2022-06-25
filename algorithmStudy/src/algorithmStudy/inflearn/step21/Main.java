package algorithmStudy.inflearn.step21;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main t = new Main();
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[][] num = new int[count][count];
		for(int i=0; i<count; i++) {
			for(int j=0; j<count; j++)
				num[i][j] = scan.nextInt();
		}
		System.out.println(t.solution(count,num));
//		for(int x : t.solution(count, num)) {
//			System.out.print(x + " ");
//		}
	}
	
	public int solution(int count,int[][] num) {
		ArrayList<Integer> sumList = new ArrayList<Integer>();
		int result = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		for(int i=0; i<count; i++) {
			sum1 =0;
			sum2 =0;
			for(int j=0; j<count; j++) {
				sum1 += num[i][j];
				sum2 += num[j][i];
				if(i == j)
					sum3 += num[i][j];
				if(count-i == j)
					sum4 += num[i][j];
			}
			sumList.add(sum1);
			sumList.add(sum2);			
		}
		sumList.add(sum3);
		sumList.add(sum4);
		for(int a : sumList)
			if(result < a)
				result = a;
		return result;
	}
	
}
