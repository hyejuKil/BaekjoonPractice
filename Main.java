import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	static int stair[];//각 계단의 비용
	static int cost[]; //해당 계단까지 올라가는 비용
	static int max=0;
	static Queue<Move> q;
	
	public static void main(String[] args) throws IOException {

		// input
		n = Integer.parseInt(br.readLine());
		stair = new int[n];
		cost = new int[n];
		q = new LinkedList<Move>();
		for(int i=0;i<n;i++)
		{
			stair[i] = Integer.parseInt(br.readLine());
		}
		
		cost[0] = stair[0];
		DFS(0,0,cost[0]);
		
		bw.write(max+"\n");
		bw.flush();
	}
	
	//아마 백트래킹..?
	static void DFS(int count, int step,int costhap)
	{
		System.out.println(count+" : "+cost[count]+" , step : "+step+" costhap : "+costhap);
		if(count ==n-1) //계단 끝
		{
			if(cost[n-1] > max && step <2)
				max = cost[n-1];
			
			if(!q.isEmpty())
			{
				Move imsi = q.poll();
				DFS(imsi.count, imsi.step,imsi.costhap);
			}
		}
		else //오르는 중
		{
			System.out.println("in : "+(count)+" : "+cost[count]+" "+step);
			if(costhap != cost[count])
			{
				System.out.println("in");
				if(!q.isEmpty())
				{
					Move imsi = q.poll();
					DFS(imsi.count, imsi.step,imsi.costhap);
				}	
			}
			//한칸 오르기
			if(step!=1 )
			{
				if(cost[count+1] < cost[count]+stair[count+1])
				{
					cost[count+1] = cost[count]+stair[count+1];
					System.out.println("in 1 : "+(count+1)+" : "+cost[count+1]);
					q.add(new Move(count+1, step+1,cost[count+1])); //한칸 이동	
				}
			}
			//두칸 오르기
			if(count+2 <n && cost[count+2] < cost[count]+stair[count+2])
			{
				cost[count+2] = cost[count] + stair[count+2];
				System.out.println("in 2 : "+(count+2)+" : "+cost[count+2]);
				q.add(new Move(count+2, 0,cost[count+2]));	
			}
			
			if(!q.isEmpty())
			{
				Move imsi = q.poll();
				DFS(imsi.count, imsi.step,imsi.costhap);
			}
		}
	}
}

class Move{
	int count;
	int step;
	int costhap;
	
	Move(int count, int step,int costhap)
	{
		this.count = count;
		this.step = step;
		this.costhap =costhap;
	}
}