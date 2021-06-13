import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B_5430 {

	static String command;
	static LinkedList<Integer> input;
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		// input
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++)
		{
			command = br.readLine();
			boolean iserror = false;
			boolean isreverse = false;
			int inputCount = Integer.parseInt(br.readLine());
			input = new LinkedList<Integer>();
			
			String tempInput = br.readLine();
			StringTokenizer to = new StringTokenizer(tempInput,"[],");
			while(to.hasMoreTokens())
				input.add(Integer.parseInt(to.nextToken()));
			
			//명령어 실행
			for(int j=0;j<command.length();++j)
			{
				switch(command.charAt(j))
				{
					case 'R':
						if(input.isEmpty())
						{
							continue;
						}
						else
						{
							if(isreverse == true) //이미 뒤집힘
								isreverse = false;
							else
								isreverse = true;
						}
						break;
					case 'D':
						if(input.isEmpty())
						{
							bw.write("error\n");
							iserror = true;
							break;
						}
						else
						{
							if(isreverse == false)
								input.removeFirst();
							else
								input.removeLast();
						}
				}
				if(iserror)
					break;
			}
			
			if(!iserror)
			{
				if(input.size()==0)
					bw.write(input+"\n");
				else
				{
					int size = input.size()-1;
					//목록 출력
					bw.write("[");
					//그대로일 경우
					if(isreverse == false) 
					{
						for(int j=0;j<size;j++)
						{
							bw.write(input.removeFirst()+",");
						}
						bw.write(input.removeFirst()+"]\n");	
					}
					else
					{
						for(int j=0;j<size;j++)
						{
							bw.write(input.removeLast()+",");
						}
						bw.write(input.removeLast()+"]\n");	
					}
				}
			}
		
		}
		bw.flush();
	}
}
