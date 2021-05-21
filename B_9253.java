import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_9253 {
	static int[] fail;
	static boolean isbubun=false;
	 public static void main(String[] args) throws IOException {
		 
		 
	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     String s = br.readLine();
	     String a = br.readLine();
	     String p = br.readLine();
	     
	     fail = new int[p.length()+1];
	     
	     getfail(p);
	     KMP(s,p);
	     KMP(a,p);
	     
	     if(isbubun == true)
	    	 bw.write("YES\n");
	     else
	    	 bw.write("NO\n");
	     bw.flush();
	     
	 }
	 
	 static void getfail(String p) {
		 int j=0; 
		 for(int i=1;i<p.length();i++)
		 {
			 while(j>0 && p.charAt(i) != p.charAt(j))
				 j = fail[j-1];
			 if(p.charAt(i) == p.charAt(j))
				 fail[i] = ++j;
		 }
	 }
	 
	 static void KMP(String moto, String bigyo) {
		 int j=0;
		 for(int i=0;i<moto.length();i++)
		 {
			 while(j>0 && moto.charAt(i) != bigyo.charAt(j))
				 j = fail[j-1];
			 if(moto.charAt(i) == bigyo.charAt(j))
			 {
				 if(j == bigyo.length()-1)
				 {
					isbubun = true;
					return;
				 }
				 else
					 j++;
			 }
		 }
	 }
}
