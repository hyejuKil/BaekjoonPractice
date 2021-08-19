//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//
//public class B_1107 {
//
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//	static int goal;
//	static int goalsize;
//	static int n;
//	static boolean isbreak[];
//	static int min=0;
//	static StringBuilder imsians;
//	public static void main(String[] args) throws IOException {
//
//		// input
//		String imsigoal = br.readLine();
//		goalsize = imsigoal.length();
//		if(goalsize == 6)
//				goalsize--;
//		goal = Integer.parseInt(imsigoal); //��ǥ ä��
//		n = Integer.parseInt(br.readLine());
//		isbreak = new boolean[10];
//		imsians = new StringBuilder();
//		
//		if(n !=0)
//		{
//			String imsis[] = br.readLine().split(" ");
//			Arrays.sort(imsis);
//			int j=0;
//			for(int i=0;i<10;i++)
//			{
//				if(j != imsis.length && Integer.parseInt(imsis[j]) == i) //���峭 ��
//				{
//					j++;
//					isbreak[i] = true;
//				}
//				else
//					isbreak[i] = false;
//			}	
//		}
//		
//		min = Math.abs(100-goal); //�׳� +-�θ� �������� ��
//		if(min == 0)
//		{
//			bw.write(0+"\n");
//		}
//		else
//		{
//			DFS(0);
//			bw.write(min+"\n");
//		}
//		bw.flush();
//	}
//
//	static void DFS(int count) throws IOException {
//		if(count <= goalsize+1 && imsians.length()!=0) 
//		{
//			int imsisu = Integer.parseInt(imsians.toString());
//			if(imsisu > 1000000 )
//				return;
//			int imsimin = Math.abs(imsisu - goal); //
//			int jarisu = Integer.toString(imsisu).length();
//			imsimin += jarisu;
//			if(imsimin < min)
//				min = imsimin;
//		}
//		if(count< goalsize+1)
//		{
//			for(int i=0;i<10;i++)
//			{
//				if(!isbreak[i]) //���� �ȳ��� ��
//				{
//					imsians.append(i); //���̱�
//					DFS(count+1);
//					imsians.deleteCharAt(count);
//				}
//			}
//		}
//	}
//}
//
