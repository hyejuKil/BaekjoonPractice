//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class B_15654 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	static boolean isused[];
//	static int[] ans;
//	static int n;
//	static int m;
//	static ArrayList<Integer> b;
//
//	public static void main(String[] args) throws IOException {
//
//		// 입력
//		String inputs[] = br.readLine().split(" ");
//		n = Integer.parseInt(inputs[0]);
//		m = Integer.parseInt(inputs[1]);
//
//		ans = new int[m];
//		isused = new boolean[n];
//		inputs = br.readLine().split(" ");
//		b = new ArrayList<Integer>();
//		for (int i = 0; i < inputs.length; i++)
//			b.add(Integer.parseInt(inputs[i]));
//
//		Collections.sort(b);
//
//		DFS(0);
//		bw.flush();
//	}
//
//	static void DFS(int count) throws IOException {
//		if (count == m) // 출력
//		{
//			for (int i = 0; i < m; i++) 
//			{
//				bw.write(ans[i] + " ");
//			}
//			bw.write("\n");
//		} 
//		else {
//			for (int i = 0; i < n; i++) // 모든 문자 돌면서
//			{
//				if(!isused[i]) //사용되지 않았을 시
//				{
//					isused[i] = true;
//					ans[count] = b.get(i);
//					DFS(count+1);
//					
//					isused[i] = false;
//				}
//			}
//		}
//	}
//}
//
