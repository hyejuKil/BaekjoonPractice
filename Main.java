import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static long m;
	static long inputs[];
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
      String imsis[] = br.readLine().split(" "); //첫줄 입력
      n = Integer.parseInt(imsis[0]);
      m = Long.parseLong(imsis[1]);
      
      imsis = br.readLine().split(" "); //둘째줄 입력
      inputs = new long[n];
      for(int i=0;i<n;i++)
      {
    	  inputs[i] = Long.parseLong(imsis[i]);
      }
      
      Arrays.sort(inputs);
     
      bw.write(BinarySearch(0, inputs[inputs.length-1])+"\n");
      bw.flush();
      
   }
   
   
   
  static long BinarySearch(long start, long end) //인자는 수
   {
	   long mid = (start+end)/2;
	   long choppedLength =0;
	   
	   for(int i=0;i<n;i++) //전체 돌면서 나무자르기
	   {
		   if(inputs[i]>mid) //만약 나무가 절단기 높이보다 더 크면 절단하고 잘린 길이 추가
		   {
			   choppedLength += inputs[i]-mid;
		   }
	   }
	   if(choppedLength == m) //m미터와 딱 맞을 시
		   return mid;
	   if(start >=end) //이미 탐색 범위 탈출
	   {
		  if(choppedLength >m) //길이는 충분
			  return start;
		  else // 탐색 범위 탈출하고, 길이가 부족할 시 한번 더잘라서 탐색 
			  return BinarySearch(start-1, start-1);
	   }
	   else if(choppedLength <m) //더 잘라야 하는 경우
		   return BinarySearch(start, mid-1);
	   else //덜 잘라야 하는 경우
		   return BinarySearch(mid+1, end);
   }
}

