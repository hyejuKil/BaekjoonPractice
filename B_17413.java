//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Stack;
//
//public class B_17413 {
//	
//	
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//	public static void main(String[] args) throws IOException {
//
//		// input
//		//���ڿ� ���� -> �־ pop�ؼ� ��� ' '�϶����� �ֱ�
//		//�±� ���� -> <�ְ� >�϶����� �׳� ���
//		
//		String input = br.readLine();
//		Stack<Character> st = new Stack<Character>();
//		boolean istag = false;
//		
//		for(int i=0;i<input.length();i++)
//		{
//			char now = input.charAt(i);
//			
//			if(now == ' ' || now == '<') //���� Ȥ�� �±� ����
//			{
//				if(now == '<')
//					istag = true;
//				while(!st.isEmpty())
//				{
//					bw.write(st.pop()+"");
//				}
//			}
//			else if(now == '>') //�±� ��
//			{
//				istag = false;
//			}
//			else //������ ���
//			{
//				if(istag == false) //�±� �� �ƴ� ���
//				{
//					st.add(now);
//					continue;
//				}
//			}
//			bw.write(now+""); //�ڱ��ڽ� ���
//		}
//		
//		if(!st.isEmpty())
//		{
//			while(!st.isEmpty())
//			{
//				bw.write(st.pop()+"");
//			}
//		}
//		
//		bw.flush();
//	}
//}