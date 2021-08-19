//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class B_1697 {
//
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	
//	static int n;
//	static int m;
//	static Queue<Integer> q;
//	static int isvisit[];
//	static int anstime = -1;
//	
//	public static void main(String[] args) throws IOException {
//
//		// input
//		String inputs[] = br.readLine().split(" ");
//		 n = Integer.parseInt(inputs[0]);
//		 m = Integer.parseInt(inputs[1]);
//		
//		 q = new LinkedList<Integer>(); 
//		 isvisit = new int[100001];
//		 Arrays.fill(isvisit, -1);
//		
//		 isvisit[n] = 0;
//		BFS(n);
//		bw.write(anstime+"\n");
//		bw.flush();
//	}
//	
//	//방문 시각보다 더 빠르게 해당 지점에 도착시 넣기
//	static void BFS(int now)
//	{
//		//System.out.println(now+" "+isvisit[now]);
//		if(now == m)
//		{
//			if(anstime == -1)
//				anstime = isvisit[now];
//			return;
//		}
//		else //방문시각 최단, 또는 처음 방문
//		{	
//			if(now>0 && isvisit[now-1] == -1) //-할 가치가 있는 경우
//			{
//				isvisit[now-1] = isvisit[now]+1;
//				q.add(now-1);
//			}
//			if(now<100000 && now<m) //now가 더 클 경우
//			{
//				if(isvisit[now+1] == -1)
//				{
//					isvisit[now+1] = isvisit[now]+1;
//					q.add(now+1);		
//				}
//			}
//			if(now*2 <= 100000 && now<m) //*2 할 가치가 있는 경우
//			{
//				if(isvisit[now*2] == -1)
//				{
//					isvisit[now*2] = isvisit[now]+1;
//					q.add(now*2);		
//				}
//			}
//				
//			if(!q.isEmpty())
//			{
//				BFS(q.poll());
//			}
//		}
//	}
//}
//
