//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.TreeSet;
//
//public class B_14888 {
//	static int n;
//	static int b[];
//	static int operators[];
//	static TreeSet<Integer> ans;
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//	public static void main(String[] args) throws IOException {
//
//		//input
//		n = Integer.parseInt(br.readLine());
//		ans = new TreeSet<Integer>();
//		
//		String inputs[] = br.readLine().split(" ");
//		b = new int[n];
//		for(int i=0;i<n;i++)
//			b[i] = Integer.parseInt(inputs[i]);
//		
//		inputs = br.readLine().split(" ");
//		operators = new int[4];
//		for(int i=0;i<4;i++)
//		{
//			operators[i] = Integer.parseInt(inputs[i]);	
//		}
//		
//		//백트래킹
//		
//		DFS(0,b[0]);
//		
//		bw.write(ans.last()+"\n"); //최대
//		bw.write(ans.first()+"\n"); //최소
//		bw.flush();
//	}
//	
//	static void DFS(int count, int now)
//	{
//		if(count == n-1) //마지막 수, 연산 끝
//		{
//			ans.add(now);
//		}
//		else
//		{
//			for(int i=0;i<4;i++)
//			{
//				if(operators[i] == 0) //연산자 고갈
//					continue;
//				else //연산자 사용가능
//				{
//					operators[i]--; //하나 씀
//					int imsi = now;
//					switch (i) {
//					case 0:
//						imsi+= b[count+1];
//						break;
//					case 1:
//						imsi-= b[count+1];
//						break;
//					case 2:
//						imsi *= b[count+1];
//						break;
//					default: //나누기
//						if(imsi <0) //음수일 경우
//						{
//							imsi = Math.abs(imsi);
//							imsi /= b[count+1];
//							imsi *=-1;
//						}
//						else
//							imsi /= b[count+1];
//					}
//					
//					DFS(count+1, imsi);
//					
//					operators[i]++;
//				}
//			}
//		}
//	}
//}
