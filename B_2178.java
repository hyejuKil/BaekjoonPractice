import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class B_2178 {
	static boolean miro[][];
	static boolean isvisit[][];
	static int ans=0;
	static int n;
	static int m;
	static Queue<Where> q;
	 public static void main(String[] args) throws IOException {
		 
	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     //BFS
	     String inputs[] = br.readLine().split(" ");
	      n = Integer.parseInt(inputs[0]);
	      m = Integer.parseInt(inputs[1]);
	     
	     miro = new boolean[n][m];
	     isvisit = new boolean[n][m];
	     for(int i=0;i<n;i++)
	     {
	    	 String imsi = br.readLine();
	    	 for(int j=0;j<m;j++)
	    	 {
	    		 if(imsi.charAt(j) == '1')
	    			 miro[i][j] = true;
	    	 }
	     }
	    q = new LinkedList<Where>();
	    
	    BFS(0,0,0);
	    bw.write(ans+"\n");
	    bw.flush();
	 }
	 
	 static void BFS(int y, int x,int count)
	 {
		 if(y == n-1 && x == m-1) //끝
		 {
			 ans = ++count;
			 return; 
		 }
		 else if(isvisit[y][x] == true || miro[y][x] == false) //방문했을 시 또는 0일 시
		 {
			 if(q.isEmpty())
				 return;
			 else
			 {
				 Where imsi = q.poll();
				 BFS(imsi.y,imsi.x,imsi.count);
			 }
		 }
		 else
		 {
			 isvisit[y][x] = true; //방문 표시
			 if(y>0) //위가 있음
				 q.add(new Where(y-1,x,count+1));
			 if(y<n-1) //아래가 있음
				 q.add(new Where(y+1,x,count+1));
			 if(x>0) //왼쪽이 있음
				 q.add(new Where(y,x-1,count+1));
			 if(x<m-1)
				 q.add(new Where(y,x+1,count+1));
			 
			 if(q.isEmpty())
				 return;
			 else
			 {
				 Where imsi = q.poll();
				 BFS(imsi.y,imsi.x,imsi.count);
			 }
		 }
	 }
}

class Where{
	int y;
	int x;
	int count;
	
	Where(int y, int x, int count)
	{
		this.y=y;
		this.x = x;
		this.count = count;
	}
}

