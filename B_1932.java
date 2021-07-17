import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_1932 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int t;
	static long mem[][];
	static int cost[][];

	public static void main(String[] args) throws IOException {

		t = Integer.parseInt(br.readLine());
		mem = new long[t][t];
		cost = new int[t][t];

		for(int i=0;i<t;i++)
		{
			for(int j=0;j<t;j++)
				mem[i][j] = -1;
		}


		for(int i=0;i<t;i++)
		{
			String s[] = br.readLine().split(" ");

			for(int j=0;j<=i;j++)
			{
				cost[i][j] = Integer.parseInt(s[j]);
			}
		}

		mem[0][0] = cost[0][0];
		
		
		long max =0;
		for(int i=0;i<t;i++)
		{
			recursion(t-1,i);
			if(mem[t-1][i]>max)
				max = mem[t-1][i];
		}
		
		bw.write(max+"\n");
		bw.flush();

	}

	static long recursion(int n,int now)
	{
		if(n<0)
			return 0;
		if(mem[n][now] != -1)
			return mem[n][now];
		else
		{
			if(now == 0) //力老 哭率
			{
				return mem[n][now] = recursion(n-1,0) +cost[n][0];
			}
			else if(now == n) //力老 坷弗率
			{
				return mem[n][now] = recursion(n-1,now-1) +cost[n][now];
			}
			else //啊款单
			{
				return mem[n][now] = Math.max(recursion(n-1,now-1),recursion(n-1,now)) +cost[n][now];
			}
		}
	}
}