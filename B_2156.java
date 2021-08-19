//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_2156 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//	static int n;
//	static long mem[]; 
//	static int juice[];
//	
//	public static void main(String[] args) throws IOException {
//
//		n = Integer.parseInt(br.readLine());
//		mem = new long[10001];
//		juice = new int[n+1];
//		
//		for(int i=1;i<=n;i++)
//		{
//			juice[i] = Integer.parseInt(br.readLine());
//		}
//
//		long max =0;
//		mem[0] = 0;
//		mem[1] = juice[1];
//		mem[2] = juice[1]+juice[2];
//		
//		max = Math.max(mem[1], mem[2]);
//		
//		for(int i=3;i<=n;i++)
//		{
//			mem[i] = Math.max(Math.max(mem[i-1], mem[i-2]+juice[i]),mem[i-3]+juice[i-1]+juice[i]);
//			if(mem[i]>max)
//				max = mem[i];
//		}
//		
//		
//		bw.write(mem[n]+"\n");
//		bw.flush();
//	}
//	
//}