//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_14889 {
//
//	static int n;
//	static int b[][];
//	static boolean isteam[];
//	static int startteam[];
//	static int linkteam[];
//	static int ans =-1;
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//	public static void main(String[] args) throws IOException {
//
//		//input
//		
//		n = Integer.parseInt(br.readLine());
//		String inputs[];
//		b = new int[n][n];
//		isteam = new boolean[n];
//		startteam = new int[n/2];
//		linkteam = new int[n/2];
//		for(int i=0;i<n;i++)
//		{	
//			inputs = br.readLine().split(" ");
//			for(int j=0;j<n;j++)
//			{
//				b[i][j] = Integer.parseInt(inputs[j]);
//			}
//		}	
//		
//		//��Ʈ��ŷ
//		DFS(0,0);
//		bw.write(ans+"\n");
//		bw.flush();
//	}
//	
//	static void DFS(int now,int count) throws IOException
//	{
//		if(count ==0 && now==n/2) //��ƴ ��, ��
//			return;
//		else if(count == n/2) //�� �ϼ�, ���
//		{
//			int start=0;
//			int link =0;
//			for(int i=0;i<n;i++)
//			{
//				if(isteam[i] == true) //��ŸƮ��
//				{
//					startteam[start++] = i;
//				}
//				else //��ũ��
//				{
//					linkteam[link++] = i;
//				}
//			}
//			
//			start=0; link=0;
//			for(int i=0;i<(n/2)-1;i++) //�� �ɷ�ġ ���ϱ�
//			{
//				for(int j=i+1;j<n/2;j++)
//				{
//					start += b[startteam[i]][startteam[j]];
//					start += b[startteam[j]][startteam[i]];
//					link += b[linkteam[i]][linkteam[j]];
//					link += b[linkteam[j]][linkteam[i]];
//					
//				}
//			}
//			
//			if(ans > Math.abs(start-link) || ans == -1)
//			{
//				ans = Math.abs(start-link);
//			}
//		}
//		else //�� ���ϼ�
//		{
//			for(int i=now;i<n;i++)
//			{
//				if(!isteam[i]) //�����̽�
//				{
//					isteam[i] = true;
//					DFS(i,count+1); //������� ���Ϸ�
//					isteam[i] = false; //�ʱ�ȭ
//				}
//					
//			}
//		}
//	}
//}