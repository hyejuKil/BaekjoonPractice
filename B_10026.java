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
//	     //�Է�
//	     n = Integer.parseInt(br.readLine());
//	     inputs = new String[n];
//	     for(int i=0;i<n;i++) //�Է� �ޱ�
//	     {
//	    	 inputs[i] = br.readLine();
//	     }
//	     isvisit = new boolean[n][n];
//	     int count =0;
//	     //���ϻ��� �ƴ�
//	     for(int i=0;i<n;i++)
//	     {
//	    	 for(int j=0;j<n;j++)
//	    	 {
//	    		 if(isvisit[i][j] == false) //�湮�� �� ������
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
//	     isvisit = new boolean[n][n]; //���� false�� �ʱ�ȭ
//	     
//	     for(int i=0;i<n;i++) //���ϻ�����
//	     {
//	    	 for(int j=0;j<n;j++)
//	    	 {
//	    		 if(isvisit[i][j] == false) //�湮�� �� ������
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
//		 if(isredgreen == false && now!= color) //���ϻ��� �ƴϰ� ���� �ٸ� ��� return
//		 {
//			 return;
//		 }
//		 if(isredgreen == true) //���ϻ����� ��� 
//		 {
//			 if(color == 'B') //������ �Ķ��̰� �ڽ��� �ٸ� ���� ���
//			 {
//				 if(now != color)
//					 return;
//			 }
//			 else //������ �ʷϰ� ������ ���
//			 {
//				 if(now == 'B') // �ڽ��� �Ķ����� ���
//					 return;
//			 }
//		 }
//		  //�湮���� ����, ������ ���� ���
//			 isvisit[y][x] = true; //�湮 ���
//			 
//			 if(y>0) //���� �˻� �ʿ�
//			 {
//				DFS(y-1, x, color,isredgreen); 
//			 }
//			 if(y<n-1) // //���� �˻� �ʿ�
//			 {
//				 DFS(y+1, x,color,isredgreen);
//			 }
//			 if(x>0) //���� �˻� �ʿ�
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
