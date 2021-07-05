import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		// input
		//그냥 문자 -> 현재 커서 위치에 넣기, 커서 +1
		// < -> 현재 위치가 1 이상일 경우 커서 --
		// > -> 현재 위치가 문자열길이보다 작을경우 커서 ++
		// - -> 하나 지우고 커서 --
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++)
		{
			String s = br.readLine();//입력받은 문자열
			ArrayList<Character> ans = new ArrayList<Character>();
			int pointer =0;
			for(int j=0;j<s.length();j++) 
			{
				char now = s.charAt(j);
				//System.out.println("now : "+ now+" pointer : "+pointer);
				switch(now) {
				// < -> 현재 위치가 1 이상일 경우 커서 --
				case '<':
					if(pointer >0)
						pointer--;
					break;
				case '>':
					if(pointer <ans.size())
						pointer++;
					break;
				case '-':
					if(ans.isEmpty() || pointer ==0)
						break;
					else {
						ans.remove(pointer-1);
						pointer--;
					}
					break;
				default:
					ans.add(pointer, now);
					pointer++;
				}	
			}
			for(int k=0;k<ans.size();k++)
			{
				bw.write(ans.get(k)+"");
			}
			bw.write("\n");
		}
		bw.flush();
		
		//linkedlist 쓰면 삽입, 삭제에서 시간초과
		//Arrayslit 쓰면 삽입시 밀어내서 시간초과
	}
}