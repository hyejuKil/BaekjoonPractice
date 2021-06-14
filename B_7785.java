import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.TreeSet;

public class B_7785 {
	
	static int n;
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		// input
		n = Integer.parseInt(br.readLine());
		TreeSet<String> people = new TreeSet<String>();
		
		for(int i=0;i<n;i++)
		{
			String imsis[] = br.readLine().split(" ");
			
			if(imsis[1].equals("enter")) {
				people.add(imsis[0]);
			}
			else
			{
				people.remove(imsis[0]);
			}
		}
		
		Iterator itr = people.descendingIterator();
		while(itr.hasNext())
		{
			bw.write(itr.next()+"\n");
		}
		
		
		bw.flush();
	}
}
