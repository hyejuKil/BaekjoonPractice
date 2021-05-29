import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_15652 {
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
	     
	     DFS(0,1);
	     bw.flush();
}
	 static void DFS(int count, int most) throws IOException
	 {
		 if(count == m)
		 {
			 for(int i=0;i<b.length;i++)
				 bw.write(b[i]+" ");
			 bw.write("\n");
		 }
		 else
		 {
			 for(int i=most;i<=n;i++)
			 {
				 b[count] = i;
				 DFS(count+1,i);
			 }
		 }
	 }
}

//코드 참고 https://fbtmdwhd33.tistory.com/36
