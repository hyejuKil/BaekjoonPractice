//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class B_1759 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    static boolean isused[];
//    static char ans[];
//    static char moum[];
//    static int l;
//    static int c;
//    static ArrayList<Character> b;
//	 public static void main(String[] args) throws IOException {
//	  
//	      //�Է�
//	      String inputs[] = br.readLine().split(" ");
//	       l = Integer.parseInt(inputs[0]);
//	       c = Integer.parseInt(inputs[1]);
//	      isused = new boolean[c];
//	      ans = new char[l];
//	      moum = new char[] {'a','e','i','o','u'};
//	      
//	      inputs = br.readLine().split(" ");
//	      b= new ArrayList<Character>();
//	      for(int i=0;i<inputs.length;i++)
//	    	  b.add(inputs[i].charAt(0));
//	      
//	      Collections.sort(b);
////	      for(int i=0;i<b.size();i++)
////	    	  System.out.print(b.get(i)+" ");
////	      System.out.println();
//	      
//	      DFS(0,0);
//	      bw.flush();
//	 }
//	 
//	 static void DFS(int now, int count) throws IOException
//	 {
//		 if(count ==l) //���
//		 {
//			 //�ּ� �ϳ��� ����
//			 int check = 0;
//			 for(int i=0;i<5;i++)
//			 {
//				 for(int j=0;j<ans.length;j++)
//				 {
//					 if(ans[j] == moum[i])
//					 {
//						 check++;
//						 break;
//					 }
//				 }
//			 }
//			 if(check == 0 || l-check <2) //���� ���ų� ���� �ΰ� �̸��� ��
//				 return;
//			 
//			 for(int i=0;i<l;i++)
//			 {
//		 		bw.write(ans[i]+"");
//		     }
//			 bw.write("\n"); 
//		 }
//		 else
//		 {
//			 for(int i=now;i<c;i++) //��� ���� ���鼭
//			 {
//				 if(now ==0 && c-i<l) //��������̹Ƿ� 4���� ��ä�� �� return
//					 return;
//				 else
//				 {
//					 if(isused[i] ==false)
//					 {
//						 isused[i] = true;
//						 ans[count] = b.get(i);
//						  
//						 DFS(i+1, count+1);
//						 
//						 isused[i] = false;
//					 }
//				 }
//			 }
//		 }
//	 }
//}
//
//
