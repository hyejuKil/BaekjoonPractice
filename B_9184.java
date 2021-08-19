//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;
//
//public class B_9184 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	
//	static int mem[][][];
//	
//	
//	public static void main(String[] args) throws IOException {
//		
//		
//		mem = new int [51][51][51];
//		while(true)
//		{
//			int a,b,c;
//			StringTokenizer st = new StringTokenizer(br.readLine()," ");
//			a = Integer.parseInt(st.nextToken());
//			b = Integer.parseInt(st.nextToken());
//			c = Integer.parseInt(st.nextToken());
//			
//			if(a==-1 && b==-1 && c==-1)
//			{
//				bw.flush();
//				return;
//			}
//			
//			bw.write("w("+a+", "+b+", "+c+") = "+w(a,b,c)+"\n");
//		}
//	}
//	
//	static int w(int a, int b, int c)
//	{
//		
//		if (a <= 0 || b <= 0 || c <= 0)
//		    return 1;
//
//		if(mem[a][b][c] !=0)
//		{
//			return mem[a][b][c];
//		}
//		
//		else if (a > 20 || b > 20 || c > 20)
//		{
//			return mem[a][b][c ] = w(20, 20, 20);
//		}
//
//		if (a < b && b < c)
//		    return mem[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
//
//		else
//		    return mem[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
//	}
//}