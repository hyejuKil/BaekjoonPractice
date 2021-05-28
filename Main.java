import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	static int n;
	static int m;
	static int b[];
	static boolean isused[];
	 public static void main(String[] args) throws IOException {
		 
	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     String inputs[] = br.readLine().split(" ");
	     n = Integer.parseInt(inputs[0]);
	     m = Integer.parseInt(inputs[1]);
	     b = new int[m];
	     isused = new boolean[n];
	     
	     hamsu(0,1);
	     
}
	 static void hamsu(int jarisu, int gap)
	 {
	     if(gap>n) //�ڸ����� ���� n+1 -> ���� ���
	     {
	    	 //���ڸ��� +1�� ����, isused ����
	    	 if(jarisu == m-1) //���ڸ�
	    		 return;
	    	 isused[b[jarisu-1]] = false; //���ڸ��� isued false
	    	 isused[b[jarisu-1]+1] = true;
	    	 hamsu(jarisu-1, gap+1);
	     }
	     else if(isused[gap] == true) //�̹� �������� �ִ� ���
	    	 hamsu(jarisu,gap+1);
	     else //���� �ƴϰ�, �̹̾������� ������ �ʰ�
	     {
	    	 //���� �� ����, ���� �ڸ����� ��
	    	 isused[gap] = true;
	    	 b[jarisu] = gap;
	    	 if(jarisu == m-1) //���
	    	 {
	    		 for(int i=0;i<m;i++)
		    		 System.out.print(b[i]+" ");
		    	 System.out.println();
		    	 hamsu(jarisu,gap+1);
	    	 }
	    	 hamsu(jarisu+1, 1);
	     }
	 }
}



