import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class B_11286 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int t = Integer.parseInt(br.readLine());
		int count=0;
		
		while(t!=0)
		{
			int imsi = (int) Math.floor((Math.sqrt(t)));
			count++;
			t -= Math.pow(imsi, 2);
		}
		
		bw.write(count+"\n");
		bw.flush();
	}
}