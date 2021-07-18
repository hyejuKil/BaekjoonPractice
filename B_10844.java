import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_10844 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int n;
	static long mem[][]; 
	
	public static void main(String[] args) throws IOException {

		n = Integer.parseInt(br.readLine());
		mem = new long[101][11];
		
		long ans =0;
		for(int i=0;i<10;i++)
		{
			mem[0][i] = 0;
			if(i==0)
				mem[1][i] = 0;
			else
				mem[1][i] = 1;
			ans += mem[1][i];
		}
		if(n == 1)
		{
			bw.write(ans+"\n");
			bw.flush();
			return;
		}
		
		for(int i=2;i<=n;i++)
		{
			ans= mem[i][0] = mem[i-1][1];
			for(int j=1;j<10;j++)
			{
				mem[i][j] = (mem[i-1][j-1]+mem[i-1][j+1]) % 1000000000;
				ans = (ans+mem[i][j]) %1000000000;
			}
			if(i==n)
				bw.write(ans+"\n");
		}
		
		bw.flush();
	}
	
}
