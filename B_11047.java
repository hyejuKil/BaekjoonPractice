import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_11047 {
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //�Է�
	      String imsis[] = br.readLine().split(" ");
	      int n = Integer.parseInt(imsis[0]);
	      int k = Integer.parseInt(imsis[1]);
	      int types[] = new int[n];
	      int count=0;
	      
	      for(int i=0;i<n;i++)
	      {
	    	  types[i] = Integer.parseInt(br.readLine());
	      }
	      
	      //�׸���
	      for(int i=n-1;i>=0;i--)
	      {
	    	  if(k ==0) //�������� ���� ǥ�� ��
	    		  break;
	    	  else if(k<types[i]) //������ ǥ���� ������ �� ŭ
	    		  continue;
	    	  else //���� �Ἥ ǥ�� ����
	    	  {
	    		  int imsi = k/types[i]; //����� ���� ����
	    		  k -= imsi * types[i]; //�� ����
	    		  count += imsi; //��ü ���� ���� ���ϱ�
	    	  }
	      }
	      
	      bw.write(count+"\n");
	      bw.flush();
	 }
}
