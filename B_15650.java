//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_15650 {
//	static int n;
//	static int m;
//	static int b[];
//	static boolean isvisit[];
//	 public static void main(String[] args) throws IOException {
//		 
//	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	     
//	     String inputs[] = br.readLine().split(" ");
//	     n = Integer.parseInt(inputs[0]);
//	     m = Integer.parseInt(inputs[1]);
//	     b = new int[m];
//	     isvisit = new boolean[n+1];
//	     
//	     DFS(1,0);
//}
//	 static void DFS(int before, int count)
//	 {
//		 if(count == m) //갯수만큼 찾음 -> 출력
//		 {
//			 for(int i=0;i<m;i++)
//				 System.out.print(b[i]+" ");
//			 System.out.println();
//		 }
//		 else 
//		 {
//			 for(int i=before;i<=n;i++)
//			 {
//				 if(isvisit[i] == true)//이미 방문한 경우
//					 continue;
//				 else //아직 미방문
//				 {
//					 isvisit[i] = true; //방문 체크
//					 b[count] = i;
//					 DFS(i,count+1); //다음 자릿수
//					 isvisit[i] = false; //방문기록 초기화
//				 }
//					 
//			 }
//		 }
//	 }
//}
//
////코드 참고 https://fbtmdwhd33.tistory.com/36
