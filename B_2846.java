import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2846 {
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
	      
	      if(height > maxheight) //������ �� ������ �ʿ�!
	      {
	    	  maxheight = height;
	      }
	      
	      bw.write(maxheight+"\n");
	      bw.flush();
	      
	 }
}
