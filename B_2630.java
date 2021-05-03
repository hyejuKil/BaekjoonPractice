import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2630 {
	static boolean b[][];
	static int whitecount=0;
	static int bluecount=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//�Է�
		int n = Integer.parseInt(br.readLine());
		b = new boolean[n][n];
		
		for(int i=0;i<n;i++)
		{
			String imsi[] = br.readLine().split(" ");	
			for(int j=0;j<n;j++)
			{
				if(imsi[j].equals("0"))
					b[i][j] = false;
				else
					b[i][j] = true;
			}
		}
		
		cut(0,0,n);
		bw.write(whitecount+"\n");
		bw.write(bluecount+"\n");
		bw.flush();
		
	}
	
	static void cut(int sero, int garo, int n)
	{
		//�ش� ���� ��ü �� ���鼭 �� 1�̸� count++, �ƴ� �� 4���
		boolean gijun = false;
		for(int i=sero;i<sero+n;i++)
		{
			for(int j=garo;j<garo+n;j++)
			{
				gijun = b[sero][garo];
				if(b[i][j] != gijun) //���ذ� �ٸ� ��
				{
					if(n==1) //���̻� �ڸ� �� ����
					{
						continue;
					}
					cut(sero,garo,n/2); //���� ��
					cut(sero,garo+n/2,n/2); //������ ��
					cut(sero+n/2, garo, n/2); //���� �Ʒ�
					cut(sero+n/2, garo+n/2, n/2);//4��и�
					return;
				}
			}
		}
		if(gijun == false)
		{
			whitecount++;
		}
		else
		{
			bluecount++;
		}
	}
}
