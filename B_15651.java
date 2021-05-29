import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class B_15651 {

	static int n;
	static int m;
	static int b[];
	static boolean isvisit[];
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
	 public static void main(String[] args) throws IOException {
		 
	     
	     String inputs[] = br.readLine().split(" ");
	     n = Integer.parseInt(inputs[0]);
	     m = Integer.parseInt(inputs[1]);
	     b = new int[m];
	     isvisit = new boolean[n+1];
	     
	     DFS(0);
	     bw.flush();
}
	 static void DFS(int count) throws IOException
	 {
		 if(count == m)
		 {
			 for(int i=0;i<b.length;i++)
				 bw.write(b[i]+" ");
			 bw.write("\n");
		 }
		 else
		 {
			 for(int i=1;i<=n;i++)
			 {
				 b[count] = i;
				 DFS(count+1);
			 }
		 }
	 }
}

//코드 참고 https://fbtmdwhd33.tistory.com/36

