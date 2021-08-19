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
//		 for(int i=1;i<p.length();i++) //문자열 길이마다 접두사 접미사 같은 pi 체크
//		 {
//			 while(j>0 && p.charAt(i) != p.charAt(j)) //안맞을 경우
//				 j = pi[j-1]; //이전까지 맞은 곳으로 컴백
//			 if(p.charAt(i) == p.charAt(j)) //같을 시
//				 pi[i] = ++j; //몇개 맞았는지 기록
//		 }
//	 }
//	 
//	 static void KMP() {
//		 int j=0;
//		 for(int i=0;i<t.length();i++) //긴 문자열 길이만큼
//		 {
//			 while(j>0 && t.charAt(i) != p.charAt(j)) //다를 경우
//			 {
//				 j = pi[j-1]; //맞았던 만큼 돌아가기
//			 }
//			 
//			 if(t.charAt(i) == p.charAt(j)) //같을 경우
//			 {
//				 if(j == p.length()-1) //끝
//				 {
//					 count++; //몇번 나타나는지
//					 ans.add(i-j+1);
//					 j = pi[j]; //다시 맞은만큼 돌아가기
//				 }
//				 else //아직 덜됨
//					 j++; 
//			 }
//		 }
//	 }
//	 
//	 //참고 링크 출처 : https://devje8.tistory.com/24
//}
