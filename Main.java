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
		//�׳� ���� -> ���� Ŀ�� ��ġ�� �ֱ�, Ŀ�� +1
		// < -> ���� ��ġ�� 1 �̻��� ��� Ŀ�� --
		// > -> ���� ��ġ�� ���ڿ����̺��� ������� Ŀ�� ++
		// - -> �ϳ� ����� Ŀ�� --
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++)
		{
			String s = br.readLine();//�Է¹��� ���ڿ�
			ArrayList<Character> ans = new ArrayList<Character>();
			int pointer =0;
			for(int j=0;j<s.length();j++) 
			{
				char now = s.charAt(j);
				//System.out.println("now : "+ now+" pointer : "+pointer);
				switch(now) {
				// < -> ���� ��ġ�� 1 �̻��� ��� Ŀ�� --
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
		
		//linkedlist ���� ����, �������� �ð��ʰ�
		//Arrayslit ���� ���Խ� �о�� �ð��ʰ�
	}
}