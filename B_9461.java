//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//
//public class B_9461 {
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
//		mem = new long[t];
//		stairs = new int[t];
//		
//		Arrays.fill(mem, 0L);
//		
//		
//		
//		for(int i=0;i<t;i++)
//		{
//			stairs[i] = Integer.parseInt(br.readLine());
//		}
//		recursion(t-1,false);
//		bw.write(mem[t-1]+"\n");
//		bw.flush();
//		
//	}
//	
//	static long recursion(int n, boolean istwostep)
//	{
//		if(n >= t || n<0) //계단수 오버
//		{
//			return 0;
//		}
//		else if(mem[n] != 0)
//			return mem[n];
//		else
//		{
//			if(istwostep) //다음번에 두칸 걸어서 이전칸인 현재는 한칸 띄어서만 가능
//			{
//				return mem[n] = recursion(n-2, false)+stairs[n];
//			}
//			long imsi1 = recursion(n-2, false)+stairs[n];
//			long imsi2 = recursion(n-1, true)+stairs[n];
//			
//			return mem[n] = max(imsi1,imsi2);
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