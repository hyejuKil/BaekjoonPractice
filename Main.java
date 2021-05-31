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
		 if(count==0) //그냥 두기
			{
				System.out.println("["+y+","+x+"]"+" count : "+count);
				chess[y][x] = true; //해당 자리 표시
				sero[y] = true; //i번째 줄에 뭐가 있음 
				garo[x] = true; //가로 j칸에 뭐가 있음
				if(y+1 <n)
					DFS(y+1,x,count+1); //다음 안닿게 놓을 수 있는 가장 가까운 자리
				else
					return;
				
				//끝나고 돌아오면
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
					if(4-count > n-i) //남은 퀸 수보다 남은 줄 수가 더 작을 때
					 {
						return; 
					 }
					else //다른칸이랑 비교해야
					{
						if(sero[i] == true) //가로에 이미 있음, 다음줄로
						{
							break;	
						}
						else if(garo[j] == true) //세로에 이미 있음, 다음칸으로
						{
							continue;	
						}
						//대각선 비교
						//1사분면
						int imsiy = i-1;
						int imsix = j+1;
						
						//1사분면
						boolean isnext = false;
						while(imsiy >=0 && imsix <n) //안튀어나가도록
						{
							if(chess[imsiy--][imsix++] == true) //이미 있음 -> 공격가능
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
						while(imsiy >=0 && imsix >=0) //안튀어나가도록
						{
							if(chess[imsiy--][imsix--] == true) //이미 있음 -> 공격가능
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
						while(imsiy <n && imsix >=0) //안튀어나가도록
						{
							if(chess[imsiy++][imsix--] == true) //이미 있음 -> 공격가능
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
						while(imsiy <n && imsix <n) //안튀어나가도록
						{
							if(chess[imsiy++][imsix++] == true) //이미 있음 -> 공격가능
							{
								isnext = true;
								break;	
							}
						}
						if(isnext == true)
							continue;
						
						//다 비교해봤으나 공격할만한 대상 없음
						{
							System.out.println("["+i+","+j+"]"+" count : "+count);
							if(count ==3) //이미 3개 찍음
							{
								//이번에 찍으면 4개
								ans+=1;
								continue;
							}
								
							chess[i][j] = true; //해당 자리 표시
							sero[i] = true;
							garo[j] = true;
							if(i+1 <n)
								DFS(i+1,j,count+1); //다음 안닿게 놓을 수 있는 가장 가까운 자리
							else 
								return;
							
							//끝나고 돌아오면
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

