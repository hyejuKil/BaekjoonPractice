import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2355 {
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //입력
	      String imsis[] = br.readLine().split(" ");
	      long a = Long.parseLong(imsis[0]);
	      long b = Long.parseLong(imsis[1]);
	      
	      if(a>b)
	      {
	    	long temp = a;
	    	a = b;
	    	b = temp;
	      }
	      
	      long count=0;
	      
	      count = Math.abs(b-a)+1; //갯수
	      
	      long answer = 0;
	      
	      //짝수개일 경우
	      if(count %2 ==0)
	      {
	    	  //(첫값 + 끝값) * 전체갯수/2 
	    	  answer = (a+b) * (count/2);
	      }
	      
	      //홀수개의 경우
	      if(count %2 ==1)
	      {
	    	  //중간값 + (첫값 + 끝값) * 전체갯수/2 
	    	  answer = (a+b)/2 +  (a+b) * (count/2);
	      }
	      
	      bw.write(answer+"\n");
	      bw.flush();
	 }
}
