import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	static boolean b[][];
	static int whitecount=0;
	static int bluecount=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		static boolean b[][];
		static int whitecount=0;
		static int bluecount=0;
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			//입력
			int n = Integer.parseInt(br.readLine());
			String inputs[] = null;
			for(int i=0;i<n;i++)
			{
				inputs[i] = br.readLine();
			}
			
			//공통 문자열 설정 후 자르기
			ArrayList<Character> ans = new ArrayList<Character>
			
			for(int i=1;i<n;i++)
			{
				if(inputs[i].contains(ans)) //찾는 문자열을 포함시 패스
					continue;
				//포함 안할 시 공통되는 문자열 다시 설정
				for(int j=0;j<n;j++) //반복문 돌면서 중복되는 문자열 찾기
				{
					if(inputs[i].charAt(j) == ans.charAt(j)) //같은 문자라면
					{
						continue;
					}
					else //둘이 다름
					{
						ans.
					}
				}
				

			}
			
			//출력
			int cha = n-ans.length(); //? 출력 
		}
	}
}

