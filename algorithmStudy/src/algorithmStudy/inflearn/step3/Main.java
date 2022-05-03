package algorithmStudy.inflearn.step3;

import java.util.Scanner;

public class Main {
  public String solution(String str){
    String answer="";
    int max = 0;
    String[] asSp= str.split(" ");
    for(String s : asSp) {
      int len = s.length();
      if(len > max){
      	max = len;
        answer = s;
      }
    }
    return answer;
  }
  
  public String solution2(String str){
	    String answer="";
	    int max = 0 , pos;
	    while((pos = str.indexOf(" ")) != -1 ) {
	    	String tmp = str.substring(0,pos);
	    	int len = tmp.length();
	    	if(len>max) {
	    		max = len;
	    		answer = tmp;
	    	}
	    	str = str.substring(pos+1);
	    }
	    if(str.length()>max) answer = str;
	    return answer;
	  }
  public static void main(String[] args){
    Main t = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    System.out.println(t.solution(str));
  }
}