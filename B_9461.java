import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B_9461 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static Long mem[];
	
	public static void main(String[] args) throws IOException {
		
		int t = Integer.parseInt(br.readLine());
		mem = new Long[101];
		
		Arrays.fill(mem, 0L);
		
		mem[1] =1L;
		mem[2] =1L;
		mem[3] =1L;
		mem[4] = 2L;
		
		for(int i=0;i<t;i++)
		{
			int now = Integer.parseInt(br.readLine());
			
			bw.write(recursion(now)+"\n");
		}
		bw.flush();
		
	}
	
	static Long recursion(int n)
	{
		if(mem[n] != 0)
			return mem[n];
		else
		{
			return mem[n] = recursion(n-2)+recursion(n-3);
		}
	}
}