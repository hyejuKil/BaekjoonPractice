//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.LinkedList;
//
//public class B_16198 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	static int n;
//	static int inputs[];
//	static LinkedList<Integer> lists;
//	static int max=-1;
//	
//	public static void main(String[] args) throws IOException {
//
//		// input
//		
//		n = Integer.parseInt(br.readLine());
//		inputs = new int[n];
//		lists = new LinkedList<Integer>();
//		
//		String imsi[] = br.readLine().split(" ");
//		for(int i=0;i<n;i++)
//		{
//			inputs[i] = Integer.parseInt(imsi[i]);
//			lists.add(inputs[i]);
//		}
//		
//		
//		DFS(0,0);
//		bw.write(max+"\n");
//		
//		bw.flush();
//	}
//	
//	static void DFS(int count, int now)
//	{
//		if(count == n-2)
//		{
//			if(max == -1 || max < now)
//			{
//				max = now;
//			}
//		}
//		else
//		{
//			for(int i =1;i<lists.size()-1;i++)
//			{
//				int cha = lists.get(i-1) * lists.get(i+1);
//				int whatIRemove = lists.get(i);
//				lists.remove(i);
//				DFS(count+1, now + cha);
//				
//				lists.add(i,whatIRemove);
//			}
//		}
//	}
//}