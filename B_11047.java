import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_11047 {
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //입력
	      String imsis[] = br.readLine().split(" ");
	      int n = Integer.parseInt(imsis[0]);
	      int k = Integer.parseInt(imsis[1]);
	      int types[] = new int[n];
	      int count=0;
	      
	      for(int i=0;i<n;i++)
	      {
	    	  types[i] = Integer.parseInt(br.readLine());
	      }
	      
	      //그리디
	      for(int i=n-1;i>=0;i--)
	      {
	    	  if(k ==0) //동전으로 전부 표현 끝
	    		  break;
	    	  else if(k<types[i]) //동전이 표현할 수보다 더 큼
	    		  continue;
	    	  else //동전 써서 표현 가능
	    	  {
	    		  int imsi = k/types[i]; //사용할 동전 개수
	    		  k -= imsi * types[i]; //돈 차감
	    		  count += imsi; //전체 동전 수에 더하기
	    	  }
	      }
	      
	      bw.write(count+"\n");
	      bw.flush();
	 }
}
