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
					zeros.add(new Node(i,j)); //0인 노드 추가
				}
			}
		}	
		
		//백트래킹
		DFS(0);
		bw.flush();
	}
	
	static void DFS(int count) throws IOException
	{
		if(count == zeros.size()) //0을 다 채움
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
			HashSet<Integer> su = new HashSet<Integer>(); //1~9까지 담아 중복 제거하기 위한 set
			List<Integer> imsi;
			for(int i=1;i<10;i++) //1~9까지 담기
				su.add(i);
			
			Node now = zeros.get(count);
			int motoy= (now.y/3)*3; //사각형 처음 y좌표
			int motox = (now.x/3)*3-1; //사각형 처음 x좌표
			for(int i=0;i<9;i++)
			{	
				if(su.size()==0) //모두 불가
				{
					
					return; //다시 전으로 돌아가 찾아보는 수밖에	
				}
				su.remove(b[now.y][i]); //해당 세로줄의 해당되는 수 지우기
				su.remove(b[i][now.x]); //해당 가로줄의 해당되는 수 지우기
				//해당되는 사각형내 지우기
				if(i%3==0 && i!=0) //다음줄로
				{
					motoy++;
					motox =(now.x/3)*3;
				}
				else
					motox++;
				
				su.remove(b[motoy][motox]);
				
			}
		
			if(su.size() == 1) //한개 남음 -> 현재 칸에 들어갈 수 있는 수 하나뿐
			{
				//현재 칸에 남은 수 입력하고 다음
				imsi = new ArrayList<Integer>(su);
				b[now.y][now.x] = imsi.get(0);
				DFS(count+1); //다음 빈칸으로 고
			}
			else //여러개 남음
			{
				Iterator<Integer> itr = su.iterator();
				
				//후보 돌면서 다 넣어보기
				while(itr.hasNext())
				{
					b[now.y][now.x] = itr.next();
					DFS(count+1); //다음 빈칸으로 고
				}
			}
			b[now.y][now.x] =0; //다 끝났고 전으로 돌아갈때는 이전항 0으로 초기화해주기!!!!!
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
