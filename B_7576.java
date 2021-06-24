import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class B_7576 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	static int m;
	static Queue<Node> q;
	static int count=0;
	static int tomato[][];
	
	public static void main(String[] args) throws IOException {

		// input
		String inputs[] = br.readLine().split(" ");
		 m = Integer.parseInt(inputs[0]);
		 n = Integer.parseInt(inputs[1]);
		
		 boolean tomatoall = true;
		 tomato = new int[n][m];
		 q = new LinkedList<Node>(); 
		 for(int i=0;i<n;i++)
		 {
			 inputs = br.readLine().split(" ");
			 for(int j=0;j<inputs.length;j++)
			 {
				 tomato[i][j] = Integer.parseInt(inputs[j]);
				 if(tomato[i][j] == 1) //익은것
				 {
					 q.add(new Node(i,j,0));
				 }
				 else if(tomato[i][j] ==0)
					 tomatoall = false; //시작부터 모든 토마토 익어있지 않음
			 }
		 }
		 
		 if(tomatoall)
		 {
			 bw.write(0+"\n");
			 bw.flush();
			 return;
		 }
		 else if(q.isEmpty())
		 {
			 bw.write(-1+"\n");
				bw.flush();
				return;
		 }
		
		Node start = q.poll();
		BFS(start.y,start.x,0);
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(tomato[i][j] == 0) // 다 돌았는데 덜익음
				{
					bw.write(-1+"\n");
					bw.flush();
					return;
				}
			}
		}
		bw.write(count+"\n");
		bw.flush();
	}
	
	//방문 시각보다 더 빠르게 해당 지점에 도착시 넣기
	static void BFS(int y, int x, int day)
	{
		//System.out.println(y+","+x+" : "+day);
		if(tomato[y][x] == -1) //토마토 없는곳은 패스
		{
			if(!q.isEmpty())
			{
				Node imsi = q.poll();
				BFS(imsi.y,imsi.x, imsi.day);
			}
		}
		else 
		{	
			tomato[y][x] = 1; //익음
			
			//위가 있음
			if(y>0 && tomato[y-1][x] ==0)
			{
				tomato[y-1][x] = 1;
				q.add(new Node(y-1,x,day+1));	
			}
			if(x>0 && tomato[y][x-1] ==0) //왼쪽 있음
			{
				tomato[y][x-1] = 1; //익음
				q.add(new Node(y,x-1,day+1));	
			}
			if(x<m-1 && tomato[y][x+1] ==0)//오른쪽 있음
			{
				tomato[y][x+1] = 1; //익음
				q.add(new Node(y,x+1,day+1));	
			}
			if(y<n-1 && tomato[y+1][x] ==0)
			{
				tomato[y+1][x] = 1; //익음
				q.add(new Node(y+1,x,day+1));
			}
			
			if(!q.isEmpty())
			{
				Node imsi = q.poll();
				if(count<imsi.day)
					count = imsi.day;
				BFS(imsi.y,imsi.x, imsi.day);
			}
		}
	}
}

class Node{
	int x;
	int y;
	int day;
	
	Node(int y, int x, int day)
	{
		this.y = y;
		this.x =x ;
		this.day = day;
	}
}

