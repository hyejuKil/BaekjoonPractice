//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//
//public class B_1463 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	
//	static int[] mem;
//	
//	public static void main(String[] args) throws IOException {
//		
//		int n = Integer.parseInt(br.readLine());
//		mem = new int[1000001];
//		Arrays.fill(mem, -1);
//		
//		bw.write(recursion(n)+"\n");
//		bw.flush();
//		return;
//		
//	}
//	
//	static int recursion(int n)
//	{
//		if(mem[n] != -1)
//		{
//			return mem[n];
//		}
//		else if(n<=1)
//			return 0;
//		else
//		{
//			int imsi1=100000, imsi2=100000;
//			if(n%3 ==0)
//			{
//				imsi1 = recursion(n/3);
//			}
//			if(n%2==0) 
//			{
//				imsi2 = recursion(n/2);
//			}
//			int imsi3 = recursion(n-1);
//			
//			return mem[n] = min(min(imsi1,imsi2),imsi3)+1;
//		}
//	}
//	static int min(int a, int b)
//	{
//		if(a<b)
//			return a;
//		else
//			return b;
//	}
//}
//
////몇일만에 처음 성공한 재귀, 참고 없이 풀음!!!
