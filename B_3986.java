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
		// ����
		
		int n = Integer.parseInt(br.readLine());
		int count=0;
		Stack<Character> s = new Stack<Character>();
		
		for(int i=0;i<n;i++)
		{
			String now = br.readLine();
			for(int j=0;j<now.length();j++)
			{
				if(s.isEmpty()) //ù ����
					s.push(now.charAt(j));
				else //�ι�° �̻�
				{
					if(now.charAt(j) == s.peek()) //���ÿ� �� �ִ°Ͱ� ������ -> 2���̹Ƿ� pop
					{
						s.pop();
					}
					else //�ٸ�
					{
						s.push(now.charAt(j));
					}
				}
			}
			
			if(s.size() ==0) //���� ������ְ�, �����
			{
				count++;
			}
			s.clear();
		}
		
		bw.write(count+"\n");
		bw.flush();
	}
}

