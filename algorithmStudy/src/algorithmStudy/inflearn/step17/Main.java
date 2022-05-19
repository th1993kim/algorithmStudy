package algorithmStudy.inflearn.step17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main t = new Main();
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int sum = 0;
		sum = t.solution(count);
		System.out.println(sum);
	}
	
	public int solution(int count) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		for(int i=3; i<count; i++) {
			for(int j=0; j<list.size(); j++) {
				if(i%list.get(j) == 0) break;
				if(j==list.size()-1 && i%list.get(j)>0) {
					list.add(i);
				}
			}
		}
		return list.size();
	}
	
	public int solution2(int n) {
		int answer =0;
		int [] ch = new int[n+1];
		for(int i=2; i<=n; i++)
			if(ch[i]==0) {
				answer ++;
				for(int j=i; j<n; j= j+i)
					ch[j] =1;
			}
		return answer;
	}
	
}
