import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class B_2580 {

	static int n;
	static int b[][];
	static boolean isprint=false;
	static ArrayList<Node> zeros;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		//input
		
		String inputs[];
		b = new int[9][9];
		zeros = new ArrayList<Node>();
		for(int i=0;i<9;i++)
		{	
			inputs = br.readLine().split(" ");
			for(int j=0;j<9;j++)
			{
				b[i][j] = Integer.parseInt(inputs[j]);
				if(b[i][j] == 0)
				{
					zeros.add(new Node(i,j)); //0�� ��� �߰�
				}
			}
		}	
		
		//��Ʈ��ŷ
		DFS(0);
		bw.flush();
	}
	
	static void DFS(int count) throws IOException
	{
		if(count == zeros.size()) //0�� �� ä��
		{
			for(int i=0;i<9;i++)
			{
				for(int j=0;j<8;j++)
					bw.write(b[i][j]+" ");
				bw.write(b[i][8]+"\n");
			}
			isprint = true;
			return;
		}
		else if(isprint == true)
			return;
		else 
		{
			HashSet<Integer> su = new HashSet<Integer>(); //1~9���� ��� �ߺ� �����ϱ� ���� set
			List<Integer> imsi;
			for(int i=1;i<10;i++) //1~9���� ���
				su.add(i);
			
			Node now = zeros.get(count);
			int motoy= (now.y/3)*3; //�簢�� ó�� y��ǥ
			int motox = (now.x/3)*3-1; //�簢�� ó�� x��ǥ
			for(int i=0;i<9;i++)
			{	
				if(su.size()==0) //��� �Ұ�
				{
					
					return; //�ٽ� ������ ���ư� ã�ƺ��� ���ۿ�	
				}
				su.remove(b[now.y][i]); //�ش� �������� �ش�Ǵ� �� �����
				su.remove(b[i][now.x]); //�ش� �������� �ش�Ǵ� �� �����
				//�ش�Ǵ� �簢���� �����
				if(i%3==0 && i!=0) //�����ٷ�
				{
					motoy++;
					motox =(now.x/3)*3;
				}
				else
					motox++;
				
				su.remove(b[motoy][motox]);
				
			}
		
			if(su.size() == 1) //�Ѱ� ���� -> ���� ĭ�� �� �� �ִ� �� �ϳ���
			{
				//���� ĭ�� ���� �� �Է��ϰ� ����
				imsi = new ArrayList<Integer>(su);
				b[now.y][now.x] = imsi.get(0);
				DFS(count+1); //���� ��ĭ���� ��
			}
			else //������ ����
			{
				Iterator<Integer> itr = su.iterator();
				
				//�ĺ� ���鼭 �� �־��
				while(itr.hasNext())
				{
					b[now.y][now.x] = itr.next();
					DFS(count+1); //���� ��ĭ���� ��
				}
			}
			b[now.y][now.x] =0; //�� ������ ������ ���ư����� ������ 0���� �ʱ�ȭ���ֱ�!!!!!
		}
	}
}

class Node{
	int y;
	int x;
	
	Node(int y, int x)
	{
		this.y =y;
		this.x = x;
	}
}
