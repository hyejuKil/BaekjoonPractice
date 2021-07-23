import java.io.*;
import java.util.*;
public class B_2293 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n,k;
	static int coins[];
	static int mem[];
	
	public static void main(String argv[]) throws NumberFormatException, IOException
	{
		String input[] = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		k = Integer.parseInt(input[1]);
		coins = new int[n+1];
		mem = new int[k+1];
		
		for(int i=1;i<=n;i++)
		{
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		mem[coins[0]] = 1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=coins[i];j<=k;j++)
			{
				mem[j] += mem[j-coins[i]];
			}
		}
		
		bw.write(mem[k]+"\n");
		bw.flush();
		
	}
}
//타인 코드 참고 : https://hu-coding.tistory.com/31
