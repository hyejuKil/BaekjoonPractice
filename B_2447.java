import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2447 {
	static char b[][];
	static int garowhere =0;
	static int serowhere =0;
	static int input =0;
	 public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //입력
	      input = Integer.parseInt(br.readLine());
	      b = new char[input][input];
	      draw(0,0,input,false);
	      
	      for(int i=0;i<input;i++)
	      {
	    	  for(int j=0;j<input;j++)
	    		  bw.write(b[i][j]+"");
	    	  bw.write("\n");
	      }
	      bw.flush();
	 }
	 
	 static void draw(int sero, int garo,int n, boolean isblank)
	 {
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
					 if(n==3) //직접 찍기
					 {
						 if(isblank == true || (i == 1 && j == 1)) //다 공백으로 찍어야 하는 경우, 또는 중간좌표
						 {
							 b[sero+i][garo+j] = ' ';
						 }
						 else 
						 {
							 b[sero+i][garo+j] = '*';
						 }
					 }
					 else //더 작게 분할
					 {
						 serowhere = n/3*i;
						 garowhere = n/3*j;
						
						if(isblank == true || (i == 1 && j == 1)) //다 공백으로 찍어야 하는 경우, 또는 중간좌표
						{
							 draw(sero + serowhere, garo + garowhere,n/3,true);
						}
						else 
						{
							 draw(sero+serowhere, garo+garowhere,n/3,false);
						}	
				 }
			 }
		 }
	 }
}
