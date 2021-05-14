import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	static int Y;
	static int X;
	static int tomato[][];
	static boolean isvisit[][];
	static int Acount=0;
	static Queue<Location> q;
	 public static void main(String[] args) throws IOException {

	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     //���� �丶��� -> BFS�� ���鼭 1�� �ٲٱ�, count++ (�ʹ� ������ �ʺ������ �����Ƿ�)
	     //�� ������ �� ��ü �ѹ� ���鼭 �������� �ֳ� Ȯ��, ������ -1, ������ count
	     
	     //�Է�
	     String inputs[] = br.readLine().split(" ");
	      X = Integer.parseInt(inputs[0]);
	      Y = Integer.parseInt(inputs[1]);
	     tomato = new int[Y][X];
	     isvisit = new boolean[Y][X];
	     int answer=0;
	     
	     Acount =0;
	     boolean firstall = true;
	     
	     String imsi;
	     q = new LinkedList<Location>(); //BFS�̹Ƿ� queue
	     for(int i=0;i<Y;i++)
	     {
	    	 imsi = br.readLine();
		     StringTokenizer st = new StringTokenizer(imsi);
		     int j=0; 
		     while(st.hasMoreTokens())
		     {
		    	 tomato[i][j] = Integer.parseInt(st.nextToken());
	    		 if(tomato[i][j] != 1) //�;��ִ� ���°� �ƴ� ��
	    			 firstall = false;
	    		 else 
	    			 q.add(new Location(i,j,0));
	    		 j++;
		     }
	     }
	     
	     if(firstall == true) //ó������ �� �;��ִ� ����
	     {
	    	 bw.write(0+"\n");
	    	 bw.flush();
	    	 return;
	     }
	     
	     Location start = q.poll();
	     BFS(start.y,start.x,start.count);
	     
	     //������ �丶�� �ִ��� �˻�
	     for(int i=0;i<Y;i++)
	     {
	    	 for(int j=0;j<X;j++)
	    	 {
	    		 if(tomato[i][j] ==0) //�ϳ��� ������ �� ���� ��
	    		 {
	    			 bw.write(-1+"\n");
	    			 bw.flush();
	    			 return;
	    		 }
	    	 }
	     }
	     bw.write(Acount+"\n"); //�ʹµ� �ɸ��� �ϼ�
	     bw.flush();
	 }
	 
	 static void BFS(int y, int x, int count)
	 {
		 if(isvisit[y][x] == true || tomato[y][x] == -1) //�湮�� ����̰ų� �丶�� ����
		 {
			 if(q.isEmpty())
				 return;
			 else
			 {
				 Location imsi = q.poll();
				 BFS(imsi.y,imsi.x,imsi.count);
			 }
		 }
		 else 
		 {
			 //System.out.println("y : "+y+" x : "+x);
			 isvisit[y][x] = true;
			 tomato[y][x] = 1; //����
			 if(y>0 && tomato[y-1][x] == 0) //���� �ְ� �丶�� ���� ���
			 {
				 q.add(new Location(y-1,x,count+1));
			 }
			 if(y<Y-1 && tomato[y+1][x] == 0) //�Ʒ��� ���� ���
			 {
				 q.add(new Location(y+1,x,count+1));
			 }
			 if(x>0 && tomato[y][x-1] == 0) //���� �ְ� �丶�� ���� ���
			 {
				 q.add(new Location(y,x-1,count+1));
			 }
			 if(x<X-1 && tomato[y][x+1] == 0) //������ ���� ���
			 {
				 q.add(new Location(y,x+1,count+1));
			 }
		 }
		 if(Acount < count)
			 Acount = count;
		 //�� �־����� ������ 
		if(q.isEmpty())
		{
			 return;	
		}
		else
		{
			Location imsi = q.poll();
			BFS(imsi.y,imsi.x,imsi.count);
		}
	 }
}

class Location{
	int y;
	int x;
	int count;
	
	Location(int y, int x,int count)
	{
		this.y = y;
		this.x = x;
		this.count = count;
	}
}


