import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_1541 {
	static boolean nowminus = false;
	 public static void main(String[] args) throws IOException {

	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     int ans =0;
	     
	     //�Է�
	     String input = br.readLine();
	     
	     //���ڸ�
	     String su[] = input.split("\\+|\\-");
	     //��ȣ��
	     
	     StringTokenizer st = new StringTokenizer(input,"0|1|2|3|4|5|6|7|8|9"); //split���� �ڸ� �� ���� �����Ͽ� tokenizer ���(split�� ������ ���̿� �����Ͱ� ���� ��� ������ ������ ��ȯ�ϹǷ�)
	     String buho[] = new String[50];
	     int imsii =0;
	     while(st.hasMoreTokens()) {
	    	 buho[imsii++] = st.nextToken(); 
	     }
	     
	     //���� ������ -�� ���� ��� ��ȣ�� ���� ���� ������ ����� -> �ּҰ� ���� ������ ����
	     ans = Integer.parseInt(su[0]); //ù���� �׳� ù��° ��
	     for(int i=1;i<su.length;i++) //���� ������ŭ �ݺ�
	     {
	    	 int imsisu = Integer.parseInt(su[i]);
	    	 if(buho[i-1].equals("-")) //�ش� �� ���� ��ȣ�� -�� ���
	    	 {
	    		 if(nowminus == false) //�������� +����
	    		 {
	    			 nowminus = true; // �����δ� -��ȣ���� ��ȣ�� ������
	    		 }
   			 ans -= imsisu; //������� -�� ����
	    	 }
	    	 else //�ش� �� ���� ��ȣ�� +�� ���
	    	 {
	    		 if(nowminus == false) //������ -�� ������ ���
	    		 {
	    			 //�׳� ���ϱ�
	    			 ans += imsisu;
	    		 } 
	    		 else //������ -�� �־��� (���� ��ȣ�� ���� - ����) 
	    		 {
	    			 //��
	    			 ans -= imsisu;
	    		 }
	    	 }
	     }
	     bw.write(ans+"\n");
	     bw.flush();
	     
	 }
}
