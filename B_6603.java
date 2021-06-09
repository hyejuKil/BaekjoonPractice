import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class B_6603 {
	static int n;
	static int ans[];
	static ArrayList<Integer> a;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		// input
		String inputs[];

		while (true) {
			a = new ArrayList<Integer>();
			inputs = br.readLine().split(" ");
			ans = new int[6];
			if (inputs.length == 1)
				return;
			else 
			{
				int inputcount = Integer.parseInt(inputs[0]);
				for (int i = 0; i < inputcount; i++) {
					a.add(Integer.parseInt(inputs[i + 1]));
				}

				DFS(0, 0);
				bw.write("\n");
			}
			bw.flush();
		}
	}

	static void DFS(int now, int count) throws IOException {
		if (count == 6) {
			for (int i = 0; i < 5; i++) {
				bw.write(ans[i] + " ");
			}
			bw.write(ans[5] + "\n");
		} else {
			for (int i = now; i < a.size(); i++) {
					ans[count] = a.get(i);
					DFS(i+1, count + 1);
			}
		}
	}
}