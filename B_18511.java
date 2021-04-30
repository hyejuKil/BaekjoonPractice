import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_18511 {
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //입력
	     String imsis[] = br.readLine().split(" ");
	     String n = imsis[0];
	     int k = Integer.parseInt(imsis[1]);
	     char ks[] = new char[k];
	     
	     imsis = br.readLine().split(" ");
	     for(int i=0;i<k;i++)
	     {
	    	 ks[i] = imsis[i].charAt(0);
	     }
	     
	     for(int i=Integer.parseInt(n);i>0;i--) //n
	     {
		     boolean isdifferent = false;
		     String imsisu = Integer.toString(i);
	    	 for(int j=0;j<imsisu.length();j++) //n의 각 자리
	    	 {
	    		 for(int l=0;l<ks.length;l++) //k 배쳘 내 수와 비교
	    		 {
	    			 if(imsisu.charAt(j) == ks[l]) //같을 경우
	    			 {
	    				 isdifferent = false;
	    				 break;
	    			 }
	    			 else //다를 경우
	    			 {
	    				 isdifferent = true;
	    			 }
	    		 }
		    	 if(isdifferent == true)// 다름
	    		 {
	    			 break;
	    		 }
	    	 }
	    	 if(isdifferent == false)//끝, 찾음
  		 {
  			 bw.write(i+"\n");
  			 bw.flush();
  			 return;
  		 }
	     }
	}
}
