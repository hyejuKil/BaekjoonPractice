//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_1929 {
//	public static void main(String[] args) throws IOException {
//	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	      
//	      //�Է�
//	      String imsis[] = br.readLine().split(" ");
//	      int n = Integer.parseInt(imsis[0]);
//	      int m = Integer.parseInt(imsis[1]);
//	      
//	      int li[] = new int[m+1]; //����Ʈ ����� 2���� m���� �ֱ�
//	      for(int i=2;i<=m;i++)
//	      {
//	    	  li[i] = i;
//	      }
//	      
//	      int imsi=0;
//	      
//	      //�����佺�׳׽��� ü
//	      for(int i=2;i<=m;i++)
//	      {
//	    	  imsi = li[i];
//	    	  if(imsi == -1) //�̹� ���ŵ� �׸� -> pass
//	    		  continue;
//		      for(int j = 2*i; j<=m;j+=i) //���ŵ��� �ʾ��� ��� ����� ��ü ����, ������ �־�� �ϹǷ� 2*i���� 		    
//		     {
//		    	 li[j] = -1;
//		      }  
//	      }
//	      
//	      for(int i=0;i<li.length;i++)
//	      {
//	    	  imsi = li[i];
//	    	  if(imsi != -1 && imsi >=n && imsi <=m) //�������� ���� ���� �� ���鸸 ���
//	    		  bw.write(imsi+"\n");
//	      }
//	      bw.flush();
//	      
//	 	 //�ð��ʰ� -> iterator ��� �迭�� -> �׳� �����佺�׳׽��� ü�� �߸� �˰��־���.
//	 }
//}
