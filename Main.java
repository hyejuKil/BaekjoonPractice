import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.io.*;
import java.math.BigInteger;

public class Main {
	static int n;
	static boolean chess[][];
	static boolean sero[];
	static boolean garo[];
	static int ans=0;
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
	 public static void main(String[] args) throws IOException {
		 
	     n = Integer.parseInt(br.readLine());
	    
	     chess = new boolean[n][n];
	     sero = new boolean[n];
	     garo = new boolean[n];
	     
	     DFS(0,0,0);
	     
	     bw.write(ans+"\n");
	     bw.flush();
}
	 
	 static void DFS(int y, int x, int count)
	 {
		 if(count ==4)
		 {
				System.out.println("["+y+","+x+"]"+" count : "+count);
				chess[y][x]=false;
				sero[y] = false;
				garo[x] = false;
			 ans++;
		 }
		 if(count==0) //�׳� �α�
			{
				System.out.println("["+y+","+x+"]"+" count : "+count);
				chess[y][x] = true; //�ش� �ڸ� ǥ��
				sero[y] = true; //i��° �ٿ� ���� ���� 
				garo[x] = true; //���� jĭ�� ���� ����
				if(y+1 <n)
					DFS(y+1,x,count+1); //���� �ȴ�� ���� �� �ִ� ���� ����� �ڸ�
				else
					return;
				
				//������ ���ƿ���
				chess[y][x]=false;
				sero[y] = false;
				garo[x] = false;
			}
		 else 
		 {
			for(int i=y;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.println("i : "+i+" j :"+j);
					if(4-count > n-i) //���� �� ������ ���� �� ���� �� ���� ��
					 {
						return; 
					 }
					else //�ٸ�ĭ�̶� ���ؾ�
					{
						if(sero[i] == true) //���ο� �̹� ����, �����ٷ�
						{
							break;	
						}
						else if(garo[j] == true) //���ο� �̹� ����, ����ĭ����
						{
							continue;	
						}
						//�밢�� ��
						//1��и�
						int imsiy = i-1;
						int imsix = j+1;
						
						//1��и�
						boolean isnext = false;
						while(imsiy >=0 && imsix <n) //��Ƣ�������
						{
							if(chess[imsiy--][imsix++] == true) //�̹� ���� -> ���ݰ���
							{
								isnext = true;
								break;
							}
						}
						if(isnext == true)
							continue;
						//2
						imsiy = i-1;
						imsix = j-1;
						if(imsiy >=n || imsix >=n)
							continue;
						while(imsiy >=0 && imsix >=0) //��Ƣ�������
						{
							if(chess[imsiy--][imsix--] == true) //�̹� ���� -> ���ݰ���
							{
								isnext = true;
								break;	
							}
						}
						if(isnext == true)
							continue;
						//3
						imsiy = i+1;
						imsix = j-1;
						while(imsiy <n && imsix >=0) //��Ƣ�������
						{
							if(chess[imsiy++][imsix--] == true) //�̹� ���� -> ���ݰ���
							{
								isnext = true;
								break;	
							}
						}
						if(isnext == true)
							continue;
						//4
						imsiy = i+1;
						imsix = j+1;
						while(imsiy <n && imsix <n) //��Ƣ�������
						{
							if(chess[imsiy++][imsix++] == true) //�̹� ���� -> ���ݰ���
							{
								isnext = true;
								break;	
							}
						}
						if(isnext == true)
							continue;
						
						//�� ���غ����� �����Ҹ��� ��� ����
						{
							System.out.println("["+i+","+j+"]"+" count : "+count);
							if(count ==3) //�̹� 3�� ����
							{
								//�̹��� ������ 4��
								ans+=1;
								continue;
							}
								
							chess[i][j] = true; //�ش� �ڸ� ǥ��
							sero[i] = true;
							garo[j] = true;
							if(i+1 <n)
								DFS(i+1,j,count+1); //���� �ȴ�� ���� �� �ִ� ���� ����� �ڸ�
							else 
								return;
							
							//������ ���ƿ���
							chess[i][j]=false;
							sero[i] = false;
							garo[j] = false;
						}
					}
				}
			}
		 }
	 }
}

