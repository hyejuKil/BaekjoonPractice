import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static long mem[];
	static int[][] cost;
	static int t;
	
	public static void main(String[] args) throws IOException {
		
		t = Integer.parseInt(br.readLine());
		mem = new long[t+1];
		cost = new int[t+1][t+1];
		
		Arrays.fill(mem, -1);
		
		
		for(int i=0;i<t;i++)
		{
			String s[] = br.readLine().split(" ");
			
			for(int j=0;j<t;j++)
			{
				cost[i][j] = Integer.parseInt(s[j]);
			}
			
		}
		
		long ans =-1;
		for(int i=0;i<3;i++)
		{
			long imsi = recursion(t, i);
			if(ans ==-1 || ans<imsi)
				ans = imsi;
			System.out.println(imsi);
			Arrays.fill(mem, -1);
		}
		
//		bw.write(+"\n");
//		bw.flush();
		
	}
	
	static long recursion(int n,int before)
	{
		System.out.println("n : "+n+" before : "+before +" mem : "+mem[n] );
		if(n<0 )
			return 0;
		else if(mem[n] !=-1)
			return mem[n];
		if(n==0)
		{
			if(before==0)
			{
				return mem[0] = min(cost[0][1],cost[0][2]);
			}
			else if(before ==1)
				return mem[0] = min(cost[0][0],cost[0][2]);
			else
				return mem[0] = min(cost[0][0],cost[0][1]);
		}
		else
		{
			long imsi1,imsi2;
			if(before ==0) //ÀÌÀü »¡
			{
				imsi1 = recursion(n-1, 1);
				imsi2 = recursion(n-1, 2);
				
				if(imsi1<imsi2)
					return mem[n] = imsi1+cost[n][1];
				else
					return mem[n] = imsi2+cost[n][2];
			}
			else if(before ==1)//ÃÊ
			{
				imsi1 = recursion(n-1, 0);
				imsi2 = recursion(n-1, 2);
				
				if(imsi1<imsi2)
					return mem[n] = imsi1+cost[n][0];
				else
					return mem[n] = imsi2+cost[n][2];
			}
			else //ÆÄ where ==2
			{
				imsi1 = recursion(n-1, 0);
				imsi2 = recursion(n-1, 1);
				
				if(imsi1<imsi2)
					return mem[n] = imsi1+cost[n][0];
				else
					return mem[n] = imsi2+cost[n][1];
			}
		}
	}
	
	static long min(long a, long b)
	{
		if(a<b)
			
			return a;
		else
			return b;
	}
}
