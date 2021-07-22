import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_1912 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int mem[];
	static int inputs[];
	static int n;
	
	public static void main(String argv[]) throws NumberFormatException, IOException
	{
		n = Integer.parseInt(br.readLine());
		mem = new int[n+1];
		inputs = new int[n+1];
		
		String input[] = br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			inputs[i] = Integer.parseInt(input[i]);
		}
		
		int ans = mem[0] = inputs[0];
		for(int i=1;i<n;i++)
		{
			mem[i] = Math.max(inputs[i], mem[i-1]+inputs[i]);
			if(ans < mem[i])
				ans = mem[i];
		}
		
		bw.write(ans+"\n");
		bw.flush();
		
	}
}
