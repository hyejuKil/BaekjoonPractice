import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int ans =-1;
	static int su[];
	
	public static void main(String[] args) throws IOException {
		
		int t = Integer.parseInt(br.readLine());
		su = new int[50001];
		
		Arrays.fill(su, -1);
		
		DFS(t,0);
		bw.write(ans+"\n");
		bw.flush();
	}
	
	static void DFS(int n, int count)
	{
		if(n == 0) //³¡
		{
			if(count < ans || ans == -1)
			{
				ans = count;
			}
			return;
		}
		else if(n<0)
			return;
		else if(su[n] != -1)
		{
			if(count>su[n])
				return;
		}
		 //´úÇÔ
		{
			su[n] = count;
			int now = (int) Math.sqrt(n);
			for(int i=now;i>0;i--)
			{
				DFS((int)(n-Math.pow(i, 2)), count+1);
			}
		}
	}
}
