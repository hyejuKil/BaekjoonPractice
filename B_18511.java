import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_18511 {
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //�Է�
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
	    	 for(int j=0;j<imsisu.length();j++) //n�� �� �ڸ�
	    	 {
	    		 for(int l=0;l<ks.length;l++) //k ��x �� ���� ��
	    		 {
	    			 if(imsisu.charAt(j) == ks[l]) //���� ���
	    			 {
	    				 isdifferent = false;
	    				 break;
	    			 }
	    			 else //�ٸ� ���
	    			 {
	    				 isdifferent = true;
	    			 }
	    		 }
		    	 if(isdifferent == true)// �ٸ�
	    		 {
	    			 break;
	    		 }
	    	 }
	    	 if(isdifferent == false)//��, ã��
  		 {
  			 bw.write(i+"\n");
  			 bw.flush();
  			 return;
  		 }
	     }
	}
}
