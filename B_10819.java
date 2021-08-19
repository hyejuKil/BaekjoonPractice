//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_10819 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	static int n;
//	static int inputs[];
//	static boolean isused[];
//	static int answers[];
//	static int max=-1;
//	
//	public static void main(String[] args) throws IOException {
//
//		// input
//		
//		n = Integer.parseInt(br.readLine());
//		inputs = new int[n];
//		isused = new boolean[n];
//		answers = new int[n];
//		
//		String imsi[] = br.readLine().split(" ");
//		for(int i=0;i<n;i++)
//		{
//			inputs[i] = Integer.parseInt(imsi[i]);
//		}
//		
//		DFS(0);
//		bw.write(max+"\n");
//		
//		bw.flush();
//	}
//	
//	static void DFS(int count)
//	{
//		if(count == n)
//		{
//			int ans=0;
//			for(int i=0;i<n-1;i++)
//			{
//				ans += Math.abs(answers[i]-answers[i+1]);
//			}
//			if(ans >max || max == -1)
//				max = ans;
//		}
//		else
//		{
//			for(int i=0;i<n;i++)
//			{
//				if(!isused[i])
//				{
//					isused[i] = true;
//					answers[count] = inputs[i];
//					DFS(count+1);
//					
//					isused[i] = false;
//				}
//			}
//		}
//	}
//}
