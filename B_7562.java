import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class B_7562 {
	static Queue<jwapyo> q;
	static boolean chess[][];
	static int ansy,ansx;
	static int n;
	static int gile;
	
	public static void main(String[] args) throws IOException {
		
		 n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			gile = Integer.parseInt(br.readLine());
			chess = new boolean[gile][gile];
			q = new LinkedList<jwapyo>();
			
			String s[] = br.readLine().split(" ");
			int starty = Integer.parseInt(s[0]);
			int startx = Integer.parseInt(s[1]);
			
			s = br.readLine().split(" ");
			
			ansy = Integer.parseInt(s[0]);
			ansx = Integer.parseInt(s[1]);
			BFS(starty,startx,0);

		}
		bw.flush();
		return;
	}
	static void BFS(int a, int b, int count) throws IOException
	{
		//System.out.println(a+" "+b+" "+count);
		if (a<0 || b<0 || a>=gile || b>=gile ||chess[a][b] == true) //이미 방문 전적
		{
			if(!q.isEmpty())
			{
				jwapyo imsi = q.poll();
				BFS(imsi.y, imsi.x, imsi.count);
			}
		}
		else if(a == ansy && b == ansx)
		{
			//System.out.println("count : "+count);
			bw.write(count+"\n");
			q.clear();
			return;
		}
		else //new!
		{
			chess[a][b] = true;
			
			int dy[] = {2,1,-1,-2,-2,-1,1,2};
			int dx[] = {1,2,2,1,-1,-2,-2,-1};
			
			for(int i=0;i<8;i++)
			{
				int next_y = a+dy[i];
				int next_x = b+dx[i];
				
				if(0<= next_x && next_x < gile && 0<= next_y && next_y < gile)
				{
					if(!chess[next_y][next_x]) 
					{
					    q.add(new jwapyo(next_y, next_x,count+1));
					    chess[a][b] = true;
					}	
				}
			}
			
			if(!q.isEmpty())
			{
				jwapyo imsi = q.poll();
				BFS(imsi.y, imsi.x, imsi.count);
			}
			
		}
	}
}

class jwapyo
{
	int y,x,count;
	
	jwapyo(int y, int x,int count)
	{
		this.y = y;
		this.x = x;
		this.count = count;
	}
}

//알게된 점 : queue에 int배열 쓸 수 있음, 상하좌우 하는법(타인 코드 참고)
