import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	static int Y;
	static int X;
	static int tomato[][];
	static boolean isvisit[][];
	static int Acount=0;
	static Queue<Location> q;
	 public static void main(String[] args) throws IOException {

	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     //익은 토마토면 -> BFS로 돌면서 1로 바꾸기, count++ (익는 순서가 너비순으로 퍼지므로)
	     //다 끝났을 시 전체 한번 돌면서 안익은거 있나 확인, 있을시 -1, 없으면 count
	     
	     //입력
	     String inputs[] = br.readLine().split(" ");
	      X = Integer.parseInt(inputs[0]);
	      Y = Integer.parseInt(inputs[1]);
	     tomato = new int[Y][X];
	     isvisit = new boolean[Y][X];
	     int answer=0;
	     
	     Acount =0;
	     boolean firstall = true;
	     
	     String imsi;
	     q = new LinkedList<Location>(); //BFS이므로 queue
	     for(int i=0;i<Y;i++)
	     {
	    	 imsi = br.readLine();
		     StringTokenizer st = new StringTokenizer(imsi);
		     int j=0; 
		     while(st.hasMoreTokens())
		     {
		    	 tomato[i][j] = Integer.parseInt(st.nextToken());
	    		 if(tomato[i][j] != 1) //익어있는 상태가 아닐 시
	    			 firstall = false;
	    		 else 
	    			 q.add(new Location(i,j,0));
	    		 j++;
		     }
	     }
	     
	     if(firstall == true) //처음부터 다 익어있는 상태
	     {
	    	 bw.write(0+"\n");
	    	 bw.flush();
	    	 return;
	     }
	     
	     Location start = q.poll();
	     BFS(start.y,start.x,start.count);
	     
	     //안익은 토마토 있는지 검사
	     for(int i=0;i<Y;i++)
	     {
	    	 for(int j=0;j<X;j++)
	    	 {
	    		 if(tomato[i][j] ==0) //하나라도 안익은 게 있을 시
	    		 {
	    			 bw.write(-1+"\n");
	    			 bw.flush();
	    			 return;
	    		 }
	    	 }
	     }
	     bw.write(Acount+"\n"); //익는데 걸리는 일수
	     bw.flush();
	 }
	 
	 static void BFS(int y, int x, int count)
	 {
		 if(isvisit[y][x] == true || tomato[y][x] == -1) //방문한 노드이거나 토마토 없음
		 {
			 if(q.isEmpty())
				 return;
			 else
			 {
				 Location imsi = q.poll();
				 BFS(imsi.y,imsi.x,imsi.count);
			 }
		 }
		 else 
		 {
			 //System.out.println("y : "+y+" x : "+x);
			 isvisit[y][x] = true;
			 tomato[y][x] = 1; //익음
			 if(y>0 && tomato[y-1][x] == 0) //위가 있고 토마토 있을 경우
			 {
				 q.add(new Location(y-1,x,count+1));
			 }
			 if(y<Y-1 && tomato[y+1][x] == 0) //아래가 있을 경우
			 {
				 q.add(new Location(y+1,x,count+1));
			 }
			 if(x>0 && tomato[y][x-1] == 0) //왼쪽 있고 토마토 있을 경우
			 {
				 q.add(new Location(y,x-1,count+1));
			 }
			 if(x<X-1 && tomato[y][x+1] == 0) //오른쪽 있을 경우
			 {
				 q.add(new Location(y,x+1,count+1));
			 }
		 }
		 if(Acount < count)
			 Acount = count;
		 //다 넣었으면 다음거 
		if(q.isEmpty())
		{
			 return;	
		}
		else
		{
			Location imsi = q.poll();
			BFS(imsi.y,imsi.x,imsi.count);
		}
	 }
}

class Location{
	int y;
	int x;
	int count;
	
	Location(int y, int x,int count)
	{
		this.y = y;
		this.x = x;
		this.count = count;
	}
}


