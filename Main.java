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
	     
	     //s�� ���� m
	     int m =Integer.parseInt(br.readLine()); //m
	     String s = br.readLine();
	     int count=0;
	     
	     //s �ݺ��� ���鼭 gibon�� ���� �� count++;
	     
	     for(int i=0;i<s.length();i++)
	     {
	    	 if(s.charAt(i) == 'O') //�������� I�̹Ƿ� ������� �ʾƵ� �ɵ�
	    		 continue;
	    	 else //I�� ����
	    	 {
	    		 if(i+gibon.length() > s.length()) //���̻� ����
	    			 break;
	    		 String imsi = s.substring(i, i+gibon.length()); //�ӽ� ���ڿ�
	    		 if(imsi.equals(gibon.toString()))
	    		 {
	    			 count++; 
	    		 }
	    		 
	    	 }
	     }
	     
	     bw.write(count+"\n");
	     bw.flush();
	 }
	 
	 //�˰Ե� �� : String�� StringBuilder�� equals ������ �� toString���� �ٲ���� �ν���
	 //�ð��ʰ�
	 //���� -> kmp �˰��� ����ϱ�
}


