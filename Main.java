import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	static int n;
	static int m;
	static int b[];
	static boolean isused[];
	 public static void main(String[] args) throws IOException {
		 
	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     String inputs[] = br.readLine().split(" ");
	     n = Integer.parseInt(inputs[0]);
	     m = Integer.parseInt(inputs[1]);
	     b = new int[m];
	     isused = new boolean[n];
	     
	     hamsu(0,1);
	     
}
	 static void hamsu(int jarisu, int gap)
	 {
	     if(gap>n) //자리수의 값이 n+1 -> 끝일 경우
	     {
	    	 //앞자리수 +1로 리턴, isused 갱신
	    	 if(jarisu == m-1) //끝자리
	    		 return;
	    	 isused[b[jarisu-1]] = false; //앞자리수 isued false
	    	 isused[b[jarisu-1]+1] = true;
	    	 hamsu(jarisu-1, gap+1);
	     }
	     else if(isused[gap] == true) //이미 쓰여지고 있는 경우
	    	 hamsu(jarisu,gap+1);
	     else //끝도 아니고, 이미쓰여지고 있지도 않고
	     {
	    	 //현재 수 저장, 다음 자리수로 고
	    	 isused[gap] = true;
	    	 b[jarisu] = gap;
	    	 if(jarisu == m-1) //출력
	    	 {
	    		 for(int i=0;i<m;i++)
		    		 System.out.print(b[i]+" ");
		    	 System.out.println();
		    	 hamsu(jarisu,gap+1);
	    	 }
	    	 hamsu(jarisu+1, 1);
	     }
	 }
}



