import java.util.*;
import java.io.*;

public class Main {
	static int r;
	static int c;
	static int count=0;
	static int n;
	static long b;
	static int inputs[][];
	 public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //입력
	      String imsis[] = br.readLine().split(" ");
	      n = Integer.parseInt(imsis[0]);
	      r = Integer.parseInt(imsis[1]);
	      c = Integer.parseInt(imsis[2]);
	      
	      System.out.println(B_1074(0, 0, n));
	      
	 }
	 
	 static int min(int a, int b)
	 {
		 if(a<b)
			 return a;
		 else
			 return b;
	 }
	 
	 static int B_1074(int sero, int garo, int stage){
		 
		 
		 System.out.println(sero+","+garo+" count : "+count);
		 if(sero == r && garo == c ) //찾으려는 장소
		 {
			 System.out.println("in");
			 return count;
		 }
		 if(count >= Math.pow(2, n) * Math.pow(2, n))
			 return -1;
		 
		 
		 else 
		 {
			 if(stage ==0)
			 {
				 int imsicount =count;
				 count++;
				 if(imsicount %4==0 || imsicount %4==2)
				 {
					 B_1074(sero,garo+(int)Math.pow(2,stage),stage);
				 }
				 else if(imsicount %4==1)
				 {
					 B_1074(sero+(int)Math.pow(2,stage),garo-(int)Math.pow(2,stage),stage); 
				 }
			 }
			 else
			 {
				 int su = B_1074(sero,garo,stage-1);
				 su = B_1074(sero,garo+(int)Math.pow(2,stage),stage-1);
				  = B_1074(sero+(int)Math.pow(2,stage),garo-(int)Math.pow(2,stage-1)+1,stage-1);
			 }
		 }
		return stage;
	 }
}

