//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_5525 {
//	static StringBuilder moto;
//	static String gibon;
//	static int pi[];
//	static String s;
//	static int count=0;
//	 public static void main(String[] args) throws IOException {
//
//	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	     
//	     moto = new StringBuilder("IOI");
//	     int n =Integer.parseInt(br.readLine()); //n
//	     
//	     for(int i=1;i<n;i++)
//	     {
//	    	 moto.append("OI");
//	     }
//	     
//	     gibon = moto.toString();
//	     pi = new int[gibon.length()];
//	     
//	     //s�� ���� m
//	     int m =Integer.parseInt(br.readLine()); //m
//	     s = br.readLine();
//	     
//	     //kmp
//	     getPi();
//	     KMP();
//	     
//	     
//	     bw.write(count+"\n");
//	     bw.flush();
//	 }
//	 
//	 //�˰Ե� �� : String�� StringBuilder�� equals ������ �� toString���� �ٲ���� �ν���
//	 
//	 static void getPi() {
//		 int j=0;
//		 for(int i=1;i<gibon.length();i++)
//		 {
//			 while(j > 0 && gibon.charAt(i) != gibon.charAt(j)) //�ȸ´� ���
//				 j = pi[j-1]; //�¾Ҵ� ������ ���ư���
//			 //�´� ���	
//			 if(gibon.charAt(i) == gibon.charAt(j)) {
//				 pi[i] = ++j;
//			 }
//		 }
//	 }
//	 
//	 static void KMP() {
//		 int j=0;
//		 for(int i=0;i<s.length();i++) {
//			 while(j>0 && s.charAt(i) != gibon.charAt(j)) 
//			 {
//				 j = pi[j-1];
//			 }
//			 if(s.charAt(i) == gibon.charAt(j))
//			 {
//				 if(j == gibon.length()-1) //��ġ
//				 {
//					 count++;
//					 j = pi[j];
//				 }
//				 else
//					 ++j; 
//			 }
//		 }
//	 }
//	 
//	 //kmp ���� �� �𸣰���.
//}
