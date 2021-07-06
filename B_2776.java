import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class B_2776 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			int num = Integer.parseInt(br.readLine());
			String inputs[] = br.readLine().split(" ");
			HashSet<Integer> note1 = new HashSet<Integer>();
			
			for(int j=0;j<num;j++) //note1
			{
				note1.add(Integer.parseInt(inputs[j]));
			}
			
			num = Integer.parseInt(br.readLine()); 
			inputs = br.readLine().split(" "); //note2
			
			for(int j=0;j<num;j++)
			{
				if(note1.contains(Integer.parseInt(inputs[j]))) //ÀÖÀ½
				{
					bw.write("1\n");
				}
				else
					bw.write("0\n");
			}
		}
		
		bw.flush();

	}
}