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
//		//문자열 스택 -> 넣어서 pop해서 출력 ' '일때까지 넣기
//		//태그 스택 -> <넣고 >일때까지 그냥 출력
//		
//		String input = br.readLine();
//		Stack<Character> st = new Stack<Character>();
//		boolean istag = false;
//		
//		for(int i=0;i<input.length();i++)
//		{
//			char now = input.charAt(i);
//			
//			if(now == ' ' || now == '<') //공백 혹은 태그 시작
//			{
//				if(now == '<')
//					istag = true;
//				while(!st.isEmpty())
//				{
//					bw.write(st.pop()+"");
//				}
//			}
//			else if(now == '>') //태그 끝
//			{
//				istag = false;
//			}
//			else //문자일 경우
//			{
//				if(istag == false) //태그 안 아닐 경우
//				{
//					st.add(now);
//					continue;
//				}
//			}
//			bw.write(now+""); //자기자신 출력
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