import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2630 {
	static boolean b[][];
	static int whitecount=0;
	static int bluecount=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//입력
		int n = Integer.parseInt(br.readLine());
		b = new boolean[n][n];
		
		for(int i=0;i<n;i++)
		{
			String imsi[] = br.readLine().split(" ");	
			for(int j=0;j<n;j++)
			{
				if(imsi[j].equals("0"))
					b[i][j] = false;
				else
					b[i][j] = true;
			}
		}
		
		cut(0,0,n);
		bw.write(whitecount+"\n");
		bw.write(bluecount+"\n");
		bw.flush();
		
	}
	
	static void cut(int sero, int garo, int n)
	{
		//해당 영역 전체 다 돌면서 다 1이면 count++, 아닐 시 4등분
		boolean gijun = false;
		for(int i=sero;i<sero+n;i++)
		{
			for(int j=garo;j<garo+n;j++)
			{
				gijun = b[sero][garo];
				if(b[i][j] != gijun) //기준과 다를 시
				{
					if(n==1) //더이상 자를 수 없음
					{
						continue;
					}
					cut(sero,garo,n/2); //왼쪽 위
					cut(sero,garo+n/2,n/2); //오른쪽 위
					cut(sero+n/2, garo, n/2); //왼쪽 아래
					cut(sero+n/2, garo+n/2, n/2);//4사분면
					return;
				}
			}
		}
		if(gijun == false)
		{
			whitecount++;
		}
		else
		{
			bluecount++;
		}
	}
}
