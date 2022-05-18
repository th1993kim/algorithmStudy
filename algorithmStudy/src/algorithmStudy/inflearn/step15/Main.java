package algorithmStudy.inflearn.step15;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] saram1 = new int[count];
		int[] saram2 = new int[count];
		for(int i=0; i<saram1.length; i++) {
			saram1[i] = scan.nextInt();
		}
		for(int i=0; i<saram2.length; i++) {
			saram2[i] = scan.nextInt();
		}
		t.solution(count,saram1,saram2);
	}
	
	public void solution(int count , int[] arr, int[] arr2) {
		int max=0;
		for(int i=0; i<count; i++) {
			if(arr[i] == arr2[i]) System.out.println("D");
			else if(arr[i] == 1 && arr2[i]==3) System.out.println("A");
			else if(arr[i] == 2 && arr2[i]==1) System.out.println("A");
			else if(arr[i] == 3 && arr2[i]==2) System.out.println("A");
			else System.out.println("B");
		}
	}
	
}
