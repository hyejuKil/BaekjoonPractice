import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class B_1676 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//입력
		int n = Integer.parseInt(br.readLine());
		
		BigInteger su = new BigInteger("1");
		
		for(int i=2;i<=n;i++)
		{
			BigInteger imsi = new BigInteger(Integer.toString(i));
			su = su.multiply(imsi);
		}
		
		int count=0;
		String pec = su.toString();
		
		for(int i=pec.length()-1; i>=0;i--)
		{
			if(pec.charAt(i) == '0')
				count++;
			else //찾던 것
			{
				bw.write(count+"\n");
				bw.flush();
				return;
			}
		}
	}
}
