package algorithmStudy.inflearn.step14;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] array = new int[count];
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println(t.solution(count,array));
	}
	
	public int solution(int count , int[] arr) {
		int cnt = 0;
		int max=0;
		for(int i=0; i<count; i++) {
			if(arr[i]>max) {
				cnt++;
				max = arr[i];
			}
		}
		return cnt;
	}
	
	public int solution2(int n, int[] arr) {
		int answer =1, max=arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]>max) {
				answer ++;
				max=arr[i];
			}
		}
		return answer;
	}
	
}
