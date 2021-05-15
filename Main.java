import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	 public static void main(String[] args) throws IOException {

	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     StringBuilder gibon = new StringBuilder("IOI");
	     int n =Integer.parseInt(br.readLine()); //n
	     
	     for(int i=1;i<n;i++)
	     {
	    	 gibon.append("OI");
	     }
	     
	     //s의 길이 m
	     int m =Integer.parseInt(br.readLine()); //m
	     String s = br.readLine();
	     int count=0;
	     
	     //s 반복문 돌면서 gibon과 같을 시 count++;
	     
	     for(int i=0;i<s.length();i++)
	     {
	    	 if(s.charAt(i) == 'O') //시작점이 I이므로 고려하지 않아도 될듯
	    		 continue;
	    	 else //I로 시작
	    	 {
	    		 if(i+gibon.length() > s.length()) //더이상 없음
	    			 break;
	    		 String imsi = s.substring(i, i+gibon.length()); //임시 문자열
	    		 if(imsi.equals(gibon.toString()))
	    		 {
	    			 count++; 
	    		 }
	    		 
	    	 }
	     }
	     
	     bw.write(count+"\n");
	     bw.flush();
	 }
	 
	 //알게된 점 : String과 StringBuilder를 equals 연산할 시 toString으로 바꿔줘야 인식함
	 //시간초과
	 //수정 -> kmp 알고리즘 사용하기
}


