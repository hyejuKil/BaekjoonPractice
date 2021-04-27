import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2355 {
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //�Է�
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
	      
	      count = Math.abs(b-a)+1; //����
	      
	      long answer = 0;
	      
	      //¦������ ���
	      if(count %2 ==0)
	      {
	    	  //(ù�� + ����) * ��ü����/2 
	    	  answer = (a+b) * (count/2);
	      }
	      
	      //Ȧ������ ���
	      if(count %2 ==1)
	      {
	    	  //�߰��� + (ù�� + ����) * ��ü����/2 
	    	  answer = (a+b)/2 +  (a+b) * (count/2);
	      }
	      
	      bw.write(answer+"\n");
	      bw.flush();
	 }
}
