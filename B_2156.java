import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2156 {
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

		long max =0;
		mem[0] = 0;
		mem[1] = juice[1];
		
		if(n == 1)
		{
			bw.write(mem[1]+"\n");
			bw.flush();
			return;
		}
		mem[2] = juice[1]+juice[2];
		
		max = Math.max(mem[1], mem[2]);
		
		for(int i=3;i<=n;i++)
		{
			long imsi = 0;
			for(int j=2;j<=n && i>=j;j++)
			{
				if(mem[i-j]>imsi)
					imsi = mem[i-j];
				if(mem[i-j]+juice[i-1]>imsi && j>2)
					imsi = mem[i-j]+juice[i-1];
			}
			mem[i] = imsi+juice[i];
			if(mem[i]>max)
				max = mem[i];
		}
		
		
		bw.write(max+"\n");
		bw.flush();
	}
	
}