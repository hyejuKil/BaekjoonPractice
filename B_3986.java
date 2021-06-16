import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B_3986 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		// input
		// 스택
		
		int n = Integer.parseInt(br.readLine());
		int count=0;
		Stack<Character> s = new Stack<Character>();
		
		for(int i=0;i<n;i++)
		{
			String now = br.readLine();
			for(int j=0;j<now.length();j++)
			{
				if(s.isEmpty()) //첫 문자
					s.push(now.charAt(j));
				else //두번째 이상
				{
					if(now.charAt(j) == s.peek()) //스택에 들어가 있는것과 같은것 -> 2개이므로 pop
					{
						s.pop();
					}
					else //다름
					{
						s.push(now.charAt(j));
					}
				}
			}
			
			if(s.size() ==0) //스택 비워져있고, 통과시
			{
				count++;
			}
			s.clear();
		}
		
		bw.write(count+"\n");
		bw.flush();
	}
}

