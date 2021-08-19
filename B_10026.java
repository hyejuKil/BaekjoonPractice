//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_10026 {
//	static boolean isvisit[][];
//	static String inputs[];
//	static int n;
//	 public static void main(String[] args) throws IOException {
//
//	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	     
//	     //입력
//	     n = Integer.parseInt(br.readLine());
//	     inputs = new String[n];
//	     for(int i=0;i<n;i++) //입력 받기
//	     {
//	    	 inputs[i] = br.readLine();
//	     }
//	     isvisit = new boolean[n][n];
//	     int count =0;
//	     //적록색약 아님
//	     for(int i=0;i<n;i++)
//	     {
//	    	 for(int j=0;j<n;j++)
//	    	 {
//	    		 if(isvisit[i][j] == false) //방문한 적 없으면
//	    		 {
//	    			 count +=1;
//	    			 DFS(i,j,inputs[i].charAt(j), false);
//	    		 }
//	    	 }
//	     }
//	    bw.write(count+" ");
//	     
//	     
//	     count=0;
//	     isvisit = new boolean[n][n]; //새로 false로 초기화
//	     
//	     for(int i=0;i<n;i++) //적록색맹임
//	     {
//	    	 for(int j=0;j<n;j++)
//	    	 {
//	    		 if(isvisit[i][j] == false) //방문한 적 없으면
//	    		 {
//	    			 count +=1;
//	    			 DFS(i,j,inputs[i].charAt(j), true);
//	    		 }
//	    	 }
//	     }
//	     bw.write(count+" ");
//	     bw.flush();
//	     
//	     
//	 }
//	 static void DFS(int y, int x, char color, boolean isredgreen)
//	 {
//		 char now = inputs[y].charAt(x);
//		 if(isvisit[y][x] == true)
//			 return;
//		 if(isredgreen == false && now!= color) //적록색약 아니고 색이 다를 경우 return
//		 {
//			 return;
//		 }
//		 if(isredgreen == true) //적록색약의 경우 
//		 {
//			 if(color == 'B') //구역이 파랑이고 자신은 다른 색일 경우
//			 {
//				 if(now != color)
//					 return;
//			 }
//			 else //구역이 초록과 빨강일 경우
//			 {
//				 if(now == 'B') // 자신은 파란색일 경우
//					 return;
//			 }
//		 }
//		  //방문한적 없고, 구역의 색일 경우
//			 isvisit[y][x] = true; //방문 기록
//			 
//			 if(y>0) //위쪽 검사 필요
//			 {
//				DFS(y-1, x, color,isredgreen); 
//			 }
//			 if(y<n-1) // //밑쪽 검사 필요
//			 {
//				 DFS(y+1, x,color,isredgreen);
//			 }
//			 if(x>0) //왼쪽 검사 필요
//			 {
//				 DFS(y,x-1, color,isredgreen);
//			 }
//			 if(x<n-1)
//			 {
//				 DFS(y,x+1, color,isredgreen);
//			 }
//			 return;
//	 }
//}
