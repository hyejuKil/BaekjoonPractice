//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//
//public class B_2579 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//	static long mem[];
//	static int stairs[];
//	static int t;
//	
//	public static void main(String[] args) throws IOException {
//		
//		t = Integer.parseInt(br.readLine());
//		mem = new long[301];
//		stairs = new int[301];
//		
//		Arrays.fill(mem, 0L);
//		
//		
//		for(int i=0;i<t;i++)
//		{
//			stairs[i] = Integer.parseInt(br.readLine());
//		}
//		mem[0] = stairs[0];
//		mem[1] = stairs[1]+stairs[0];
//		recursion(t-1);
//		bw.write(mem[t-1]+"\n");
//		bw.flush();
//		
//	}
//	
//	static long recursion(int n)
//	{
//		if(n >= t || n<0) //계단수 오버
//		{
//			return 0;
//		}
//		else if(mem[n] != 0)
//			return mem[n];
//		else
//		{
//			long imsi = max(stairs[n-1]+recursion(n-3), recursion(n-2));
//			return mem[n] = imsi+stairs[n];
//		}
//	}
//	
//	static long max(long a, long b)
//	{
//		if(a<b)
//			
//			return b;
//		else
//			return a;
//	}
//}
//
////참고 https://globalhost.interdol.com/454