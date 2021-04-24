//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_18111 {
//	static int n;
//	static int m;
//	static long b;
//	static int inputs[][];
//	 public static void main(String[] args) throws IOException {
//	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	      
//	      //입력
//	      String imsis[] = br.readLine().split(" ");
//	      n = Integer.parseInt(imsis[0]); //가로
//	      m = Integer.parseInt(imsis[1]); //세로
//	      b = Long.parseLong(imsis[2]); //소지한 블록 개수
//	      inputs = new int[n+1][m+1];
//	      int avg = 0;
//	      int mintime = -1;
//	      int count=0;
//	      
//	      for(int i=0;i<n;i++)
//	      {
//	    	  imsis = br.readLine().split(" ");
//	    	  for(int j=0;j<m;j++)
//	    	  {
//	    		  inputs[i][j] = Integer.parseInt(imsis[j]);
//	    		  avg += inputs[i][j];
//	    	  }
//	      }
//	      int goal = (int) Math.round((avg*1.0/(n*m))); //모든 값의 평균으로 가장 최적일 것으로 예상되는 값
//	      int now=0;
//	      int minnow =0;
//	      
//    	  long imsib = b;
//	     for(now =0;;now++)
//	     {
//	    	 imsib = b;
//	    	  count=0;
//	    	  for(int i=0;i<n;i++)
//	    	  {
//	    		  for(int j=0;j<m;j++)
//	    		  {
//	    			  int cha =0;
//	    			  if(inputs[i][j] > now) //현재 땅이 더 높음 -> 깎기
//	    			  {
//	    				  cha = inputs[i][j] - now;
//	    				  count += cha *2;
//	    				  imsib += cha;
//	    			  }
//	    		  }
//	    	  }
//	    	  
//	    	  for(int i=0;i<n;i++)
//	    	  {
//	    		  for(int j=0;j<m;j++)
//	    		  {
//	    			  int cha=0;
//	    			  if(inputs[i][j] < now) //현재 땅이 더 낮음 -> 붙이기
//	    			  {
//	    				  cha = now - inputs[i][j];
//	    				  if(imsib<cha) //블럭 부족 -> 목표 높이 불가
//	    				  {
//	    					 bw.write(mintime +" "+minnow+"\n");
//	    					 bw.flush();
//	    					 return;
//	    				  }
//	    				  count += cha;
//	    				  imsib -= cha;
//	    			  }
//	    		  }
//	    	  }
//	    	  
//	    	  if(mintime == -1 || count <= mintime)
//	    	  {
//	    		  mintime = count;
//	    		  minnow = now;
//	    	  }
//	      }
//}}
