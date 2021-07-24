import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2581 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String argv[]) throws NumberFormatException, IOException
	{
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		boolean su[] = new boolean[10001];
		for(int i=2;i<=n;i++)
		{
			su[i] = true;
		}
		
		int ans=0;
		int min =0;
		for(int i=2;i<=n;i++) //에라토스테네스 체
		{
			for(int j=i;j<=n;j++) //모든 수
			{
				if(su[j] == false)
				{
					continue;	
				}
				else if(i==j && j>=m)
				{
					if(ans ==0)
						min = j;
					ans += j;	
				}
				else if(j%i == 0) //나누어 떨어짐
				{
					su[j] = false;
				}
			}
		}
		
		if(ans==0)
			bw.write(-1+"\n");
		else
			bw.write(ans+"\n"+min);
		bw.flush();
	}	
}