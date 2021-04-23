import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B_1654 {
	static long k;
	static long n;
	static long inputs[];
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
      //�Է�
      String imsis[] = br.readLine().split(" ");
      k = Integer.parseInt(imsis[0]); //�̹� ������ �ִ� ���� ��
      n = Integer.parseInt(imsis[1]); //�ʿ��� ������ ����
      
      inputs = new long[(int)k];
      for(int i = 0;i<k;i++)
      {
    	 inputs[i] = Long.parseLong(br.readLine());
      }
      
      Arrays.sort(inputs);
      long imsicm = BinarySearch(1, inputs[inputs.length-1]);
       
      bw.write(imsicm+"\n");
      bw.flush();
      
   }
   
   static long BinarySearch(long start, long end)
   {
	   long mid = (start+end)/2;
	   int count=0; //�߸� ���� �� ��
	   if(mid == 0)
		   return end;
	   
	   for(int i=0;i<k;i++)
	   {
		   if(inputs[i]>=mid) //���� ������ �� ��� �߸�
		   {
			   count += inputs[i]/mid;
		   }
		   //�� ª����� ������
	   }
	   
	   if(start >= end)
	   {
		   if(count == n)
			   return end;
		   else if(start > end)
			   return end;
	   }
	   
	   if(count < n) //���� �� ���� �ʿ� -> �� �۰� �߶�� �� 
	   {
		   return BinarySearch(start, mid-1);
	   }
	   else
	   {
		   return BinarySearch(mid+1, end);
	   }
   }
}
