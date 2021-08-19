//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//
//public class B_17626 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//	static int mem[];
//	static int n;
//	
//	public static void main(String[] args) throws IOException {
//		
//		n = Integer.parseInt(br.readLine());
//		mem = new int[50001];
//		
//		Arrays.fill(mem, -1);
//
//		mem[0] = 0;
//		mem[1] = 1;
//		recursion(n);
//		
//		bw.write(mem[n]+"\n");
//		bw.flush();
//		
//	}
//	
//	static int recursion(int n)
//	{
//		if(n<0)
//			return 0;
//		else if(mem[n] != -1)
//		{
//			return mem[n];
//		}
//		else
//		{
//			int min = -1;
//			for(int i=(int)Math.sqrt(n);i>0;i--)
//			{
//				int imsi = recursion(n-(int)Math.pow(i, 2)) +1;
//				if(min == -1 || imsi<min)
//					min = imsi;
//			}
//			
//			return mem[n] = min;
//		}
//	}
//	
//	static long min(long a, long b)
//	{
//		if(a<b)
//			
//			return a;
//		else
//			return b;
//	}
//}
//
