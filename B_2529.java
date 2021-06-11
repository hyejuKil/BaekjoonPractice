import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B_2529 {

	static int n;
	static boolean isused[];
	static int ans[];
	static String signs[];
	static String max= "";
	static String min="";

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		// input
		n = Integer.parseInt(br.readLine());
		ans = new int[n + 1]; // 부호수보다 숫자가 하나 더 많으므로
		isused = new boolean[10];

		signs = br.readLine().split(" ");

		DFS(0, 10, 0);

		bw.write(max+"\n");
		bw.write(min+"\n");
		bw.flush();
	}

	static void DFS(int start, int end, int count) throws IOException {
		if (count == n+1) { //끝
			String imsist;
			imsist = Arrays.toString(ans).replaceAll("[^0-9]","");
			long imsisu = Long.parseLong(imsist);
			
			if(min.equals("") || imsisu<Long.parseLong(min))
				min = imsist;
			if(imsisu>n)
				max = imsist;
		}
		
		else {
			for (int i = start; i < end; i++) {
				if (!isused[i]) // 중복 안되므로
				{
					isused[i] = true;

					ans[count] = i;

					if(count == n) //더 비교할 것 없음
						DFS(0,0,count+1);
					else if (signs[count].equals("<")) // <
					{
						DFS(i+1, 10, count + 1);
					} else // >
						DFS(0, i, count + 1);

					isused[i] = false;
					ans[count] =0;
				}
			}	
		}
	}
}