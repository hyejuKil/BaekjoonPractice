import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static long m;
	static long inputs[];
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
      String imsis[] = br.readLine().split(" "); //ù�� �Է�
      n = Integer.parseInt(imsis[0]);
      m = Long.parseLong(imsis[1]);
      
      imsis = br.readLine().split(" "); //��°�� �Է�
      inputs = new long[n];
      for(int i=0;i<n;i++)
      {
    	  inputs[i] = Long.parseLong(imsis[i]);
      }
      
      Arrays.sort(inputs);
     
      bw.write(BinarySearch(0, inputs[inputs.length-1])+"\n");
      bw.flush();
      
   }
   
   
   
  static long BinarySearch(long start, long end) //���ڴ� ��
   {
	   long mid = (start+end)/2;
	   long choppedLength =0;
	   
	   for(int i=0;i<n;i++) //��ü ���鼭 �����ڸ���
	   {
		   if(inputs[i]>mid) //���� ������ ���ܱ� ���̺��� �� ũ�� �����ϰ� �߸� ���� �߰�
		   {
			   choppedLength += inputs[i]-mid;
		   }
	   }
	   if(choppedLength == m) //m���Ϳ� �� ���� ��
		   return mid;
	   if(start >=end) //�̹� Ž�� ���� Ż��
	   {
		  if(choppedLength >m) //���̴� ���
			  return start;
		  else // Ž�� ���� Ż���ϰ�, ���̰� ������ �� �ѹ� ���߶� Ž�� 
			  return BinarySearch(start-1, start-1);
	   }
	   else if(choppedLength <m) //�� �߶�� �ϴ� ���
		   return BinarySearch(start, mid-1);
	   else //�� �߶�� �ϴ� ���
		   return BinarySearch(mid+1, end);
   }
}

