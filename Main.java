import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	static int ans=0;
	static boolean tile[][];
	
	public static void main(String[] args) throws IOException {
		
		n = Integer.parseInt(br.readLine());
		tile = new boolean[2][n];
		
		DFS(0);
		
		
		bw.write(ans+"\n");
		bw.flush();

	}
	static void DFS(int count) {
		System.out.println(count);
		if(n == count) //타일 다 채움
		{
			ans++;
		}
		else //타일 덜채움
		{
			for(int i=0;i<2;i++)
			{
				if(i==1 && count<(n/2))
					break;
				for(int j=0;j<n;j++)
				{
					if(j>0 && count==0)
						break;
					if(!tile[i][j])
					{
						System.out.println(i+","+j);
						tile[i][j] = true;
						if(j!=n-1 && !tile[i][j+1])//가로
						{
							System.out.println("garo : "+i+","+(j+1));
							tile[i][j+1] = true;
							DFS(count+1);
							tile[i][j+1] = false;
						}
						else if(i==0 && !tile[i+1][j]) //세로
						{
							System.out.println("sero : "+(i+1)+","+j);
							tile[i+1][j] = true;
							DFS(count+1);
							tile[i+1][j] = false;
						}
						tile[i][j] = false;
					}
				}
			}
		}
	}
}