import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n,k;
	static long mem[];
	static int coin[];
	
	public static void main(String argv[]) throws NumberFormatException, IOException
	{
		String s[] = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
		
		mem = new long[k+1];
		coin = new int[n+1];
		
		for(int i=0;i<n;i++)
		{
			coin[i] = Integer.parseInt(br.readLine());
		}
		for(int i=1;i<=k;i++) //수만큼
		{
			long min = 0;
			for(int j=0;j<n;j++) //동전 종류만큼
			{
				long imsi;
				if(i-coin[j]>=0)
				{
					imsi = mem[i-coin[j]]+1;
					if(imsi<min || min == 0)
						min = imsi;
				}
			}
			
			mem[i] = min;
		}
		
		if(mem[k] !=0)
			bw.write(mem[k]+"\n");
		else
			bw.write(-1+"\n");
		bw.flush();
	}	
}
