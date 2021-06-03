import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class B_15663 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] ans;
	static LinkedHashSet<String> anst;
	static int n;
	static int m;
	static boolean isused[];
	static ArrayList<Integer> b;

	public static void main(String[] args) throws IOException {

		// 입력
		String inputs[] = br.readLine().split(" ");
		n = Integer.parseInt(inputs[0]);
		m = Integer.parseInt(inputs[1]);

		anst = new LinkedHashSet<String>();
		ans = new int[m];
		isused = new boolean[n];
		inputs = br.readLine().split(" ");
		b = new ArrayList<Integer>();
		for (int i = 0; i < inputs.length; i++)
			b.add(Integer.parseInt(inputs[i]));

		Collections.sort(b);

		DFS(0);
		
		Iterator<String> itr = anst.iterator();
		while(itr.hasNext())
		{
			bw.write(itr.next()+"\n");
		}
		bw.flush();
	}

	static void DFS(int count) throws IOException {
		if (count == m) // 출력
		{
			StringBuilder imsist = new StringBuilder();
			
			for(int i=0;i<m;i++)
			{
				imsist.append(ans[i]);
				if(i != m-1)
					imsist.append(" ");
			}
			
			
			anst.add(imsist.toString());
		} 
		else {
			for (int i = 0; i < n; i++) // 모든 문자 돌면서
			{
				if(!isused[i])
				{
					isused[i] = true;
					ans[count] = b.get(i);
					DFS(count+1);	
					isused[i] = false;
				}
			}
		}
	}
}

// Treeset : 넣은 값의 사전순대로 순서, LinkedHashset : 넣은 순서대로 순서