import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_11653 {
	public static void main(String[] args) throws IOException {

	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     
	     int n = Integer.parseInt(br.readLine());
	     
	     int now =2;
	     while(n != 1)
	     {
	    	 if(n%now == 0) //나누어질 경우
	    	 {
	    		 bw.write(now+"\n");
	    		 n /= now;
	    	 }
	    	 else
	    		 now++;
	     }
	     
	     bw.flush();
	 }
}
