import java.util.*;
import java.io.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	static int m;
	static Queue<Node> q;
	static int isvisit[];
	static int anstime = -1;
	
	public static void main(String[] args) throws IOException {

		// input
		String inputs[] = br.readLine().split(" ");
		 n = Integer.parseInt(inputs[0]);
		 m = Integer.parseInt(inputs[1]);
		
		 q = new LinkedList<Node>(); 
		 isvisit = new int[100001];
		
		BFS(n,0);
		bw.write(anstime+"\n");
		bw.flush();
	}
	
	//방문 시각보다 더 빠르게 해당 지점에 도착시 넣기
	static void BFS(int now, int time)
	{
		System.out.println(now+" "+time);
		if(now == m)
		{
			if(anstime == -1)
				anstime = time;
			return;
		}
		else //방문시각 최단, 또는 처음 방문
		{
			if(now>0 && now>m/2 && (isvisit[now-1] == 0 || isvisit[now-1] > time+1)) //-할 가치가 있는 경우
			{
				isvisit[now-1] = time+1;
				q.add(new Node(now-1,time+1));
			}
			if(now*2 <= 100000) //*2 할 가치가 있는 경우
			{
				if(isvisit[now*2] == 0 ||isvisit[now*2] > time+1)
				{
					isvisit[now*2] = time+1;
					q.add(new Node(now*2, time+1));		
				}
			}
			if(now < 100000  && isvisit[now+1] == 0 ||isvisit[now+1] > time+1) //now가 더 클 경우
			{
				isvisit[now+1] = time+1;
				q.add(new Node(now+1, time+1));	
			}
				
			if(!q.isEmpty())
			{
				Node imsi = q.poll();
				BFS(imsi.x, imsi.time);
			}
		}
	}
}

class Node{
	public Node(int x, int time) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.time = time;
	}
	int x;
	int time;
}
