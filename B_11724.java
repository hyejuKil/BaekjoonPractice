import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class B_11724 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n,m;
	static ArrayList<LinkedList<Integer>> gr;
	static boolean isvisit[];
	static Queue<Integer> q = new LinkedList<Integer>();
	static int ans=0;
	
	public static void main(String[] args) throws IOException {
		
		String inputs[] = br.readLine().split(" ");
		n = Integer.parseInt(inputs[0]);
		m = Integer.parseInt(inputs[1]);
		gr = new ArrayList<LinkedList<Integer>>();
		
		for(int i=0;i<=n;i++)
		{
			gr.add(new LinkedList<Integer>());
		}
		
		for(int i=0;i<m;i++)
		{
			inputs = br.readLine().split(" ");
			int node1 = Integer.parseInt(inputs[0]);
			int node2 = Integer.parseInt(inputs[1]);
			isvisit = new boolean[n+1];
			
			gr.get(node1).add(node2); //1노드에 2노드 추가
			gr.get(node2).add(node1); //2번째 노드에 1번째 노드 추가
		}
		
		while(true) //모든 노드들을 방문할 때까지
		{
			boolean isEnd = true;
			int startpoint = 0;
			for(int i=1;i<=n;i++)
			{
				if(!isvisit[i]) //방문 안한 노드가 있으면 isEnd false
				{
					isEnd = false;	
					startpoint = i;
				}
			}
			
			if(isEnd == true)
			{
				bw.write(ans+"\n");
				bw.flush();
				return;
			}
			else
			{
				ans++;
				BFS(startpoint);
			}
				
		}
	}
	
	static void BFS(int node) {
		if(isvisit[node]) //이미 방문한 노드
		{
			if(!q.isEmpty())
			{
				BFS(q.poll());
			}
		}
		else //첫 방문
		{
			isvisit[node] = true;
			for(int i=0;i<gr.get(node).size();i++)
			{
				q.add(gr.get(node).get(i));
			}
			
			if(!q.isEmpty())
			{
				BFS(q.poll());
			}
		}
	}
}
