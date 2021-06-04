import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_9663 {
	static int n;
	static boolean garo[];
	static int ans = 0;
	static int[] node;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		n = Integer.parseInt(br.readLine());

		garo = new boolean[n];
		node = new int[n];

		DFS(0);

		bw.write(ans + "\n");
		bw.flush();
	}

	static void DFS(int count) {
		if(count == n) //��������
		{
			ans++;
		}
		
		for (int i = 0; i < n; i++) { //����
			//�Ǵ��� üũ�ϱ�
			//�ش� ���� ĭ�� ���ο� ������
			if(garo[i] == true)
				continue;
			boolean isdegak = false;
			for(int j=0;j<count;j++) //�밢��
			{
				if(Math.abs(count-j) == Math.abs(i-node[j])) //�밢�� ���Ͻ�
				{
					isdegak = true;
					break;
				}
			}
			if(isdegak == true)
				continue;
			
			//�ش� ���ο��� ����, �밢���� ���� -> �ֱ�
			node[count] = i;
			garo[i] = true;
			DFS(count+1);
			garo[i] = false;
		}
	}
}