import java.util.*;
import java.io.*;

public class Main {
	 public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //입력
	      int n = Integer.parseInt(br.readLine());
	      String imsis[] = br.readLine().split(" ");
	      int inputs[] = new int[n];
	      for(int i=0;i<n;i++)
	      {
	    	  inputs[i] = Integer.parseInt(imsis[i]);
	      }
	      
	      //만약 이전 수보다 증가 시 -> 높이 += 현재높이
	      //이전 수보다 감소 시 : 정산, 다른 오르막이랑 비교해서 max인지 
	      
	      int height =0;
	      int maxheight = 0;
	      for(int i=1;i<n;i++) 
	      {
	    	  if(inputs[i-1] < inputs[i]) //이전 항보다 증가 시
	    	  {
	    		  //높이 증가
	    		  height += inputs[i] - inputs[i-1]; 
	    	  }
	    	  else //이전 높이보다 감소 또는 평지 -> 정산
	    	  {
	    		  if(maxheight < height) //가장 높은 오르막길일 경우
	    		  {
	    			  maxheight = height;
	    		  }
	    		  height = 0; //오르막길 높이 초기화
	    	  }
	      }
	      
	      if(height > maxheight)
	      {
	    	  maxheight = height;
	      }
	      
	      bw.write(maxheight+"\n");
	      bw.flush();
	      
	 }
}

