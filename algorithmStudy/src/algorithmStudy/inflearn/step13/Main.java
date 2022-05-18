package algorithmStudy.inflearn.step13;

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
	
	public String solution(int count , int[] arr) {
		String result = "";
		int max=0;
		for(int i=0; i<count; i++) {
			if(arr[i]>max) {
				result += arr[i] + " ";
			}
			max = arr[i];
		}
		return result;
	}
	
	public ArrayList<Integer> solution2(int n , int [] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i=1; i<n; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		return answer;
	}
}
