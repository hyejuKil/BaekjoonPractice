//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class B_11652 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	
//	public static void main(String[] args) throws IOException {
//
//		// input
//		// Treemap
//		
//		int n = Integer.parseInt(br.readLine());
//		TreeMap<Long, Integer> m = new TreeMap<Long, Integer>();
//		int max=0;
//		
//		for(int i=0;i<n;i++)
//		{
//			Long now = Long.parseLong(br.readLine());
//			//없으면 추가
//			if(!m.containsKey(now))
//			{
//				m.put(now, 1);
//			}
//			else //이미 있음
//			{
//				int imsi = m.get(now);
//				m.replace(now, imsi+1);
//			}
//			if(m.get(now) >max)
//				max = m.get(now);
//		}
//		
//		for(Map.Entry<Long, Integer> entry : m.entrySet())
//		{
//			if(entry.getValue() == max)
//			{
//				bw.write(entry.getKey()+"\n");
//				bw.flush();
//				return;
//			}
//		}
//	}
//	
//}
