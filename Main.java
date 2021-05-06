import java.util.*;
import java.io.*;

public class Main {
	 public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //�Է�
	      int n = Integer.parseInt(br.readLine());
	      String imsis[] = br.readLine().split(" ");
	      int inputs[] = new int[n];
	      for(int i=0;i<n;i++)
	      {
	    	  inputs[i] = Integer.parseInt(imsis[i]);
	      }
	      
	      //���� ���� ������ ���� �� -> ���� += �������
	      //���� ������ ���� �� : ����, �ٸ� �������̶� ���ؼ� max���� 
	      
	      int height =0;
	      int maxheight = 0;
	      for(int i=1;i<n;i++) 
	      {
	    	  if(inputs[i-1] < inputs[i]) //���� �׺��� ���� ��
	    	  {
	    		  //���� ����
	    		  height += inputs[i] - inputs[i-1]; 
	    	  }
	    	  else //���� ���̺��� ���� �Ǵ� ���� -> ����
	    	  {
	    		  if(maxheight < height) //���� ���� ���������� ���
	    		  {
	    			  maxheight = height;
	    		  }
	    		  height = 0; //�������� ���� �ʱ�ȭ
	    	  }
	      }
	      
	      if(height > maxheight)
	      {
	    	  maxheight = height;
	      }
	      
	      bw.write(maxheight+"\n");
	      bw.flush();
	      
	 }
}

