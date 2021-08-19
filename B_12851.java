import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B_12851 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	static int m;
	static Queue<Integer> q;
	static int isvisit[];
	static int recent =-1;
	static int anstime = -1;
	static int count=0;
	
	public static void main(String[] args) throws IOException {

		// input
		String inputs[] = br.readLine().split(" ");
		 n = Integer.parseInt(inputs[0]);
		 m = Integer.parseInt(inputs[1]);
		
		 q = new LinkedList<Integer>(); 
		 isvisit = new int[100001];
		 Arrays.fill(isvisit, -1);
		
		 isvisit[n] = 0;
		 
		 if(n>m)
		 {
				bw.write((n-m)+"\n");
				bw.flush();
				return;
		 }
		 
		BFS(n);
		bw.write(anstime+"\n");
		bw.flush();
	}
	
	//�湮 �ð����� �� ������ �ش� ������ ������ �ֱ�
	static void BFS(int now)
	{
		//System.out.println(now+" "+isvisit[now]);
		if(now == m)
		{
			recent = isvisit[now];
			if(anstime == -1)
			{
				anstime = isvisit[now];
			}
			else if(anstime < isvisit[now]) //�Ƹ� ��?
				return;
			//System.out.println("in : "+count);
			if(!q.isEmpty())
			{
				BFS(q.poll());
			}
		}
		else //�湮�ð� �ִ�, �Ǵ� ó�� �湮
		{
			if(recent != -1 && recent < isvisit[now])
				return;
			if(now>0 && now<100000) //-�� ��ġ�� �ִ� ���
			{
				if(isvisit[now-1] == -1|| isvisit[now-1] == isvisit[now]+1)
				{
					isvisit[now-1] = isvisit[now]+1;
					q.add(now-1);	
				}
			}
			if(now<100000) //now�� �� Ŭ ���
			{
				if(isvisit[now+1] == -1 || isvisit[now+1] == isvisit[now]+1)
				{
					isvisit[now+1] = isvisit[now]+1;
					q.add(now+1);		
				}
			}
			if(now*2 <= 100000 ) //*2 �� ��ġ�� �ִ� ���
			{
				if(isvisit[now*2] == -1 || isvisit[now*2] <= isvisit[now]+1)
				{
					isvisit[now*2] = isvisit[now];
					q.add(now*2);		
				}
			}
				
			if(!q.isEmpty())
			{
				BFS(q.poll());
			}
		}
	}
}