//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.HashMap;
//
//public class B_17219 {
//	public static void main(String[] args) throws IOException {
//		
//	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	      
//	      //ют╥б
//	      String imsis[] = br.readLine().split(" ");
//	      int n = Integer.parseInt(imsis[0]);
//	      int m = Integer.parseInt(imsis[1]);
//	      HashMap<String, String> h = new HashMap<String, String>();
//	      
//	      for(int i=0;i<n;i++)
//	      {
//	    	  imsis = br.readLine().split(" ");
//	    	  h.put(imsis[0], imsis[1]);
//	      }
//	      
//	      String imsi = "";
//	      for(int i=0;i<m;i++)
//	      {
//	    	  imsi = br.readLine();
//	    	  bw.write(h.get(imsi)+"\n");
//	      }
//	      
//	      bw.flush();
//	}
//}
