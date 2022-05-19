package algorithmStudy.inflearn.step16;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int arr[] = new int[count];	
		arr = t.solution(count,arr);
		
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
		t.solution2(count);
	}
	
	public int[] solution(int count , int[] arr) {
		int max=0;
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2; i<count; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		return arr;
	}
	
	public void solution2(int n) {
		int a = 1, b =1, c;
		System.out.print(a + " " + b+ " ");
		for(int i=2 ; i<n; i++) {
			c=a+b;
			System.out.print(c+ " ");
			a=b;
			b=c;
		}
	}
	
}
