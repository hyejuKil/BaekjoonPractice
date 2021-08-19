//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Collections;
//import java.util.LinkedList;
//
//public class B_11656 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//	public static void main(String[] args) throws IOException {
//
//		// input
//		
//		String input = br.readLine();
//		LinkedList<String> jupmi = new LinkedList<String>();
//		
//		for(int i=0;i<input.length();i++)
//		{
//			jupmi.add(input.substring(i, input.length()));
//		}
//		
//		Collections.sort(jupmi);
//		
//		for(int i=0;i<jupmi.size();i++) {
//			bw.write(jupmi.get(i)+"\n");
//		}
//		bw.flush();
//	}
//}
