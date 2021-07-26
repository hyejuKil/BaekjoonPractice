import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.*;
import java.util.*;
public class B_2293 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String argv[]) throws NumberFormatException, IOException
	{
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int mem[] = new int[100001];
		
		
		for(int i=0;i<n;i++) //���� ����ŭ �ݺ�
		{
			int coin = Integer.parseInt(br.readLine());
			mem[coin] +=1;
			for(int j=coin;j<=k;j++) //�������� ī����
			{
				mem[j] += mem[j-coin];
			}
		}
		
		bw.write(mem[k]+"\n");
		bw.flush();
	}	
}

