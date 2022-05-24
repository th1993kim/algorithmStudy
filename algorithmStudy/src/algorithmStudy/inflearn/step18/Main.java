package algorithmStudy.inflearn.step18;

import java.util.ArrayList;
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
		for (int x : t.solution2(count, num)) {
			System.out.print(x + " ");
		}
	}
	
	public String solution(int count,int[] num) {
		String result = "";
		for (int i=0; i<count; i++) {
			num[i] = reverse(num[i]);
			if(isPrime(num[i])) 
				result += num[i] + " ";
		}
		return result;
		
	}
	
	public int reverse(int num) {
		int result = 0;
		int length = (int)(Math.log10(num)+1);
		for(int i=0; i<length; i++) {
			result += num%10 * Math.pow(10,length-1-i);
			num = num/10;
		}
		return result;
	}
	
	public boolean isPrime(int num) {
		if(num == 1 ) return false;
		for(int i=2; i<num; i++) 
			if(num%i == 0) return false;
		return true;				
	}
	
	public ArrayList<Integer> solution2(int n , int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int tmp =arr[i];
			int res = 0;
			while(tmp>0) {
				int t = tmp%10;
				res = res * 10 +t;
				tmp = tmp/10;
			
			}
			if(isPrime(res)) 
				answer.add(res);
		}
		return answer;
	}
}
