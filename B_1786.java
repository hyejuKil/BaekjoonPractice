//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class B_1786 {
//	static String t;
//	static String p;
//	static int pi[];
//	static int count=0;
//	static ArrayList<Integer> ans;
//	 public static void main(String[] args) throws IOException {
//		 
//		 
//	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	     
//	     
//	     t = br.readLine();
//	     p = br.readLine();
//	     
//	     pi = new int[p.length()];
//	     ans = new ArrayList<Integer>();
//	     
//	     getPi();
//	     KMP();
//	     
//	     bw.write(count+"\n");
//	     Iterator<Integer> itr = ans.iterator();
//	     while(itr.hasNext())
//	    	 bw.write(itr.next()+"\n");
//	     bw.flush();
//	 }
//
//	 
//	 static void getPi() {
//		 int j=0;
//		 for(int i=1;i<p.length();i++) //���ڿ� ���̸��� ���λ� ���̻� ���� pi üũ
//		 {
//			 while(j>0 && p.charAt(i) != p.charAt(j)) //�ȸ��� ���
//				 j = pi[j-1]; //�������� ���� ������ �Ĺ�
//			 if(p.charAt(i) == p.charAt(j)) //���� ��
//				 pi[i] = ++j; //� �¾Ҵ��� ���
//		 }
//	 }
//	 
//	 static void KMP() {
//		 int j=0;
//		 for(int i=0;i<t.length();i++) //�� ���ڿ� ���̸�ŭ
//		 {
//			 while(j>0 && t.charAt(i) != p.charAt(j)) //�ٸ� ���
//			 {
//				 j = pi[j-1]; //�¾Ҵ� ��ŭ ���ư���
//			 }
//			 
//			 if(t.charAt(i) == p.charAt(j)) //���� ���
//			 {
//				 if(j == p.length()-1) //��
//				 {
//					 count++; //��� ��Ÿ������
//					 ans.add(i-j+1);
//					 j = pi[j]; //�ٽ� ������ŭ ���ư���
//				 }
//				 else //���� ����
//					 j++; 
//			 }
//		 }
//	 }
//	 
//	 //���� ��ũ ��ó : https://devje8.tistory.com/24
//}
