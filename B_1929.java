//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_1929 {
//	public static void main(String[] args) throws IOException {
//	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	      
//	      //입력
//	      String imsis[] = br.readLine().split(" ");
//	      int n = Integer.parseInt(imsis[0]);
//	      int m = Integer.parseInt(imsis[1]);
//	      
//	      int li[] = new int[m+1]; //리스트 만들고 2부터 m까지 넣기
//	      for(int i=2;i<=m;i++)
//	      {
//	    	  li[i] = i;
//	      }
//	      
//	      int imsi=0;
//	      
//	      //에라토스테네스의 체
//	      for(int i=2;i<=m;i++)
//	      {
//	    	  imsi = li[i];
//	    	  if(imsi == -1) //이미 제거된 항목 -> pass
//	    		  continue;
//		      for(int j = 2*i; j<=m;j+=i) //제거되지 않았을 경우 배수를 전체 삭제, 원본은 있어야 하므로 2*i부터 		    
//		     {
//		    	 li[j] = -1;
//		      }  
//	      }
//	      
//	      for(int i=0;i<li.length;i++)
//	      {
//	    	  imsi = li[i];
//	    	  if(imsi != -1 && imsi >=n && imsi <=m) //삭제되지 않은 범위 내 수들만 출력
//	    		  bw.write(imsi+"\n");
//	      }
//	      bw.flush();
//	      
//	 	 //시간초과 -> iterator 대신 배열로 -> 그냥 에라토스테네스의 체를 잘못 알고있었음.
//	 }
//}
