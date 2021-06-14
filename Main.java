import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
	
	static int n;
	static int k;
	static boolean iscatch = false;
	static int visittime[];
	static int min =0;
	static Queue<Qin> q;
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		// input
		String imsi[] = br.readLine().split(" ");
		n = Integer.parseInt(imsi[0]);
		k = Integer.parseInt(imsi[1]);
		q = new LinkedList<Qin>();
		visittime = new int[100001];
		
		BFS(0,n);
		bw.write(min+"\n");
		bw.flush();
	}
	
	static void BFS(int time, int now) throws IOException
	{
		System.out.println("time : "+time+" now : "+now);
		if(now == k) //동생 잡음
		{
			min = time;
			iscatch = true;
			q.clear();
			return;
		}
		else if(iscatch) //이미 잡음
			return;
		else if(visittime[now] != 0 && visittime[now] <time)
		{
			if(q.isEmpty())
				return;
			else
			{
				Qin imsi = q.poll();
				BFS(imsi.time,imsi.now);
			}
		}
		else //아직 못잡음
		{
			if(now> k/3 && now>0)
			{
				q.add(new Qin(time+1, now-1)); //한칸 뒤로
			}
			if(now> k/3 &&now<100000)
				q.add(new Qin(time+1,now+1)); //앞으로
			if(now*2 < 100000)
				q.add(new Qin(time+1,now*2)); //순간이동
			
			if(q.isEmpty())
				return;
			else
			{
				Qin imsi = q.poll();
				BFS(imsi.time,imsi.now);
			}
		}
	}
}

class Qin{
	int time;
	int now;
	
	Qin(int time, int now)
	{
		this.time = time;
		this.now = now;
	}
}
