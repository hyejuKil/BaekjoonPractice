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
     
      //입력
      String imsis[] = br.readLine().split(" ");
      k = Integer.parseInt(imsis[0]); //이미 가지고 있는 랜선 수
      n = Integer.parseInt(imsis[1]); //필요한 랜선의 개수
      
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
	   int count=0; //잘린 랜선 수 합
	   if(mid == 0)
		   return end;
	   
	   for(int i=0;i<k;i++)
	   {
		   if(inputs[i]>=mid) //원래 랜선이 더 길어 잘림
		   {
			   count += inputs[i]/mid;
		   }
		   //더 짧은경우 버려짐
	   }
	   
	   if(start >= end)
	   {
		   if(count == n)
			   return end;
		   else if(start > end)
			   return end;
	   }
	   
	   if(count < n) //전선 더 많이 필요 -> 더 작게 잘라야 함 
	   {
		   return BinarySearch(start, mid-1);
	   }
	   else
	   {
		   return BinarySearch(mid+1, end);
	   }
   }
}
