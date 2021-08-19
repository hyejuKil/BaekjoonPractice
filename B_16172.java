//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_16172 {
//	static String s;
//	static String p;
//	static int[] fail;
//	static boolean isbubun=false;
//	 public static void main(String[] args) throws IOException {
//		 
//		 
//	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	     
//	     s = br.readLine();
//	     p = br.readLine();
//	     
//	     fail = new int[p.length()+1];
//	     
//	     getfail();
//	     KMP();
//	     
//	     if(isbubun == true)
//	    	 bw.write(1+"\n");
//	     else
//	    	 bw.write(0+"\n");
//	     bw.flush();
//	     
//	 }
//	 
//	 static void getfail() {
//		 int j=0; 
//		 for(int i=1;i<p.length();i++)
//		 {
//			 while(j>0 && p.charAt(i) != p.charAt(j))
//				 j = fail[j-1];
//			 if(p.charAt(i) == p.charAt(j))
//				 fail[i] = ++j;
//		 }
//	 }
//	 
//	 static void KMP() {
//		 int j=0;
//		 for(int i=0;i<s.length();i++)
//		 {
//			 if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
//			 {
//				 continue; 
//			 }
//			 while(j>0 && s.charAt(i) != p.charAt(j))
//				 j = fail[j-1];
//			 if(s.charAt(i) == p.charAt(j))
//			 {
//				 if(j == p.length()-1)
//				 {
//					isbubun = true;
//					return;
//				 }
//				 else
//					 j++;
//			 }
//		 }
//	 }
//}
