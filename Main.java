import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int n;
	static long mem[]; 
	static int juice[];
	
	public static void main(String[] args) throws IOException {

		n = Integer.parseInt(br.readLine());
		mem = new long[10001];
		juice = new int[n+1];
		
		for(int i=1;i<=n;i++)
		{
			juice[i] = Integer.parseInt(br.readLine());
		}

		mem[0] = 0;
		mem[1] = juice[1];
		mem[2] = juice[1]+juice[2];
		
		long max =0;
		for(int i=3;i<=n;i++)
		{
			long imsi = mem[i-3]+juice[i-1];
			for(int j=2;j<=n && i>j;j++)
			{
				if(mem[i-j]>imsi)
					imsi = mem[i-j];
			}
			mem[i] = imsi+juice[i];
			if(mem[i]>max)
				max = mem[i];
		}
		
		bw.write(max+"\n");
		bw.flush();
	}
	
}