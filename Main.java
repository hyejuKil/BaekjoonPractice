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
			//�Է�
			int n = Integer.parseInt(br.readLine());
			String inputs[] = null;
			for(int i=0;i<n;i++)
			{
				inputs[i] = br.readLine();
			}
			
			//���� ���ڿ� ���� �� �ڸ���
			ArrayList<Character> ans = new ArrayList<Character>
			
			for(int i=1;i<n;i++)
			{
				if(inputs[i].contains(ans)) //ã�� ���ڿ��� ���Խ� �н�
					continue;
				//���� ���� �� ����Ǵ� ���ڿ� �ٽ� ����
				for(int j=0;j<n;j++) //�ݺ��� ���鼭 �ߺ��Ǵ� ���ڿ� ã��
				{
					if(inputs[i].charAt(j) == ans.charAt(j)) //���� ���ڶ��
					{
						continue;
					}
					else //���� �ٸ�
					{
						ans.
					}
				}
				

			}
			
			//���
			int cha = n-ans.length(); //? ��� 
		}
	}
}

