import java.util.*;
import java.io.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	static int m;
	static Queue<Integer> q;
	static int isvisit[];
	static int anstime = -1;
	
	public static void main(String[] args) throws IOException {

		// input
		String inputs[] = br.readLine().split(" ");
		 n = Integer.parseInt(inputs[0]);
		 m = Integer.parseInt(inputs[1]);
		
		 q = new LinkedList<Integer>(); 
		 isvisit = new int[100001];
		
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
			if(anstime == -1)
				anstime = isvisit[now];
			return;
		}
		else //�湮�ð� �ִ�, �Ǵ� ó�� �湮
		{
			if(now>0 && now>m/2 && (isvisit[now-1] == 0 || isvisit[now-1] > isvisit[now]+1)) //-�� ��ġ�� �ִ� ���
			{
				isvisit[now-1] = isvisit[now]+1;
				q.add(now-1);
			}
			if(now*2 <= 100000 && now<m) //*2 �� ��ġ�� �ִ� ���
			{
				if(isvisit[now*2] == 0 ||isvisit[now*2] > isvisit[now]+1)
				{
					isvisit[now*2] = isvisit[now]+1;
					q.add(now*2);		
				}
			}
			if(now < 100000 && now<m) //now�� �� Ŭ ���
			{
				if(isvisit[now+1] == 0 ||isvisit[now+1] > isvisit[now]+1)
				{
					isvisit[now+1] = isvisit[now]+1;
					q.add(now+1);		
				}
			}
				
			if(!q.isEmpty())
			{
				BFS(q.poll());
			}
		}
	}
}

