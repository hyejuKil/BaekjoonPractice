import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	static HashMap<int[], Integer> su;
	
	public static void main(String[] args) throws IOException {
		
		int a, b, c;
		su = new HashMap<int[], Integer>();
		while(true)
		{
			String[] inputs = br.readLine().split(" ");
			a = Integer.parseInt(inputs[0]);
			b = Integer.parseInt(inputs[1]);
			c = Integer.parseInt(inputs[2]);
			
			if(a==-1 && b==-1 && c==-1)
				break;
			else
			{
				jegwi(a,b,c);
				bw.write("w("+a+", "+b+", "+c+") = "+su.get(new int[] {a,b,c})+"\n");
				
			}
		}
		bw.flush();
	}
	
	static int jegwi(int a,int b, int c)
	{
		int[] imsis = new int[] {a,b,c};
		System.out.println(a+" "+b+" "+c);
		if(su.containsKey(imsis))
		{
			System.out.println("Á¸Àç");
			return su.get(imsis);
		}
		if(a<=0 || b<=0 || c<=0) 
		{
			int imsi = 1;
			su.put(imsis, imsi);
			System.out.println("imsis : "+su.get(imsis));
			return imsi;
		}
		else if(a>20 || b>20 || c>20)
		{
			int imsi = jegwi(20,20,20);
			su.put(imsis, imsi);
			return imsi; 
		}
		else if(a<b && b<c)
		{
			int imsi = jegwi(a,b,c-1)+jegwi(a,b-1,c-1)-jegwi(a,b-1,c);
			su.put(imsis, imsi);
			return imsi; 
		}
		else 
		{
			int imsi = jegwi(a-1,b,c)+jegwi(a-1,b,c-1)-jegwi(a-1,b-1,c-1);
			su.put(imsis, imsi);
			return imsi; 
		}
	}
}
