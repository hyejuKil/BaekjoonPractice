//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class B_11727 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	
//	static int n;
//	static int su[];
//	
//	public static void main(String[] args) throws IOException {
//		
//		n = Integer.parseInt(br.readLine());
//		su = new int[1001];
//		
//		su[0] = 0;
//		su[1] = 1;
//		su[2] = 3;
//
//		bw.write(jegwi(n)+"\n");
//		bw.flush();
//	}
//	
//	static int jegwi(int a)
//	{
//		if(su[a] !=0 || a==0) //이미 저장된 값
//		{
//			return su[a];
//		}
//		else //계산
//		{
//			//이전 과정+세로, 전전과정+가로가로, 전과정+2*2
//			return su[a] = (jegwi(a-1)+jegwi(a-2)+jegwi(a-2))% 10007;
//		}
//	}
//}