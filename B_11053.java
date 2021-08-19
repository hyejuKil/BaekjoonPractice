//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//
//public class B_11053 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	
//	static int n;
//	static int inputs[];
//	static int mem[];
//	public static void main(String[] args) throws IOException {
//
//		//input
//		n = Integer.parseInt(br.readLine());
//		inputs = new int[1001];
//		mem = new int[1001];
//		Arrays.fill(mem, -1);
//		String s[] = br.readLine().split(" ");
//		for(int i=0;i<n;i++)
//		{
//			inputs[i] = Integer.parseInt(s[i]);
//		}
//		
//		//이전까지 반복하며 가장 길면서 현재 수가 더 큰 경우 찾기 +1
//		int max =0;
//		for(int i=0;i<n;i++)
//		{
//			mem[i] = 1;
//		
//			for(int j=0;j<i;j++)
//			{
//				if(mem[i]<mem[j]+1 && inputs[i]>inputs[j])
//				{
//					mem[i] = mem[j]+1;
//				}
//			}
//			if(mem[i]>max)
//				max = mem[i];
//		}
//		
//		bw.write(max+"\n");
//		bw.flush();
//	}
//	
//}
////타인 코드 참고 출처 : https://st-lab.tistory.com/137