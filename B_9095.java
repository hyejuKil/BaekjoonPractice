//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.LinkedList;
//
//public class B_9095 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	
//	static int su=0;
//	static LinkedList<Integer> li;
//	static int count=0;
//	
//	public static void main(String[] args) throws IOException {
//
//		// input
//		
//		int n =Integer.parseInt(br.readLine());
//		
//		for(int i=0;i<n;i++)
//		{
//			su = Integer.parseInt(br.readLine());
//			li = new LinkedList<Integer>();
//			count =0;
//			
//			DFS(0);
//			bw.write(count+"\n");
//		}
//		bw.flush();
//	}
//	
//	//아마 백트래킹..?
//	static void DFS(int now)
//	{
//		if(now == su)
//		{
//			count++;
//		}
//		else if(now>su)
//			return;
//		else //now < su
//		{
//			for(int i=1;i<=3;i++)
//			{
//				int su = now +i;
//				DFS(su);
//			}
//		}
//	}
//}