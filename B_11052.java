import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_11052 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	static int mem[];
	static int card[];
	
	public static void main(String argv[]) throws NumberFormatException, IOException
	{
		n = Integer.parseInt(br.readLine());
		mem = new int[n+1];
		card = new int[n+1];
		String input[] = br.readLine().split(" ");
		for(int i=1;i<=n;i++)
		{
			card[i] = Integer.parseInt(input[i-1]);
		}
		
		mem[1] = card[1];
		
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				mem[i] = Math.max(mem[i], mem[i-j]+card[j]);
			}
		}
		bw.write(mem[n]+"\n");
		bw.flush();
	}	
}

