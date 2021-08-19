//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_1182 {
//
//
//	static int n;
//	static int ans;
//	static int count=0;
//	static int s;
//	static int su[];
//
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//	public static void main(String[] args) throws IOException {
//
//		// input
//		String inputs[];
//		inputs = br.readLine().split(" ");
//		n = Integer.parseInt(inputs[0]);
//		s = Integer.parseInt(inputs[1]);
//		ans = 0;
//		su = new int[n];
//
//		inputs = br.readLine().split(" ");
//		for (int i = 0; i < n; i++) {
//			su[i] = Integer.parseInt(inputs[i]);
//		}
//
//		DFS(0);
//		bw.write(count+"\n");
//		bw.flush();
//	}
//
//	static void DFS(int now) throws IOException {
//		for(int i=now;i<su.length;i++)
//		{
//			ans += su[i];
//			if(ans == s)
//				count++;
//			DFS(i+1);
//			ans -= su[i];
//		}
//	}
//}