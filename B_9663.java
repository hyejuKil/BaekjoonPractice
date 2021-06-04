import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_9663 {
	static int n;
	static boolean garo[];
	static int ans = 0;
	static int[] node;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		n = Integer.parseInt(br.readLine());

		garo = new boolean[n];
		node = new int[n];

		DFS(0);

		bw.write(ans + "\n");
		bw.flush();
	}

	static void DFS(int count) {
		if(count == n) //마지막줄
		{
			ans++;
		}
		
		for (int i = 0; i < n; i++) { //가로
			//되는지 체크하기
			//해당 가로 칸의 세로에 없는지
			if(garo[i] == true)
				continue;
			boolean isdegak = false;
			for(int j=0;j<count;j++) //대각선
			{
				if(Math.abs(count-j) == Math.abs(i-node[j])) //대각선 동일시
				{
					isdegak = true;
					break;
				}
			}
			if(isdegak == true)
				continue;
			
			//해당 세로에도 없고, 대각선도 괜찮 -> 넣기
			node[count] = i;
			garo[i] = true;
			DFS(count+1);
			garo[i] = false;
		}
	}
}