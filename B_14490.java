//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_14490 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	static int n;
//	static int m;
//	
//	
//	public static void main(String[] args) throws IOException {
//
//		// input
//		
//		String inputs[] = br.readLine().split(":");
//		n = Integer.parseInt(inputs[0]);
//		m = Integer.parseInt(inputs[1]);
//		boolean NisBig = false;
//		
//		if(n>m)
//			NisBig = true;
//		yakboon(NisBig);
//		
//		bw.write(n+":"+m+"\n");
//		
//		bw.flush();
//	}
//	
//	static void yakboon(boolean NisBig) {
//		
//		if(NisBig) //n>m
//		{
//			for(int i=n;i>1;i--)
//			{
//				if(n%i ==0 && m%i ==0) //약분 가능
//				{
//					n /= i;
//					m /= i;
//				}
//			}
//		}
//		else
//		{
//			for(int i=m;i>1;i--)
//			{
//				if(n%i ==0 && m%i ==0) //약분 가능
//				{
//					n /= i;
//					m /= i;
//				}
//			}
//		}
//	}
//}