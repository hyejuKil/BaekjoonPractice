//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Stack;
//
//public class B_9375 {
//	 public static void main(String[] args) throws IOException {
//
//	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	    
//	     //입력
//	     int n = Integer.parseInt(br.readLine());
//	     for(int i=0;i<n;i++)
//	     {
//		     int ans=1;
//		     HashMap<String, Integer> closet = new HashMap<String, Integer>();
//		     Stack<String> type = new Stack<String>();
//	    	 int c = Integer.parseInt(br.readLine()); //옷 개수
//	    	 for(int j=0;j<c;j++)
//	    	 {
//	    		 String imsis[] = br.readLine().split(" ");
//	    		 if(closet.containsKey(imsis[1])) //이미 있는 종류의 옷이라면
//	    		 {
//	    			 int imsisu = closet.get(imsis[1]); 
//	    			 closet.replace(imsis[1], imsisu+1); //해당 종류의 옷 개수 ++
//	    		 }
//	    		 else //없는 종류의 옷이라면
//	    		 {
//	    			 closet.put(imsis[1], 1);
//	    			 type.push(imsis[1]);
//	    		 }
//	    	 }
//	    	 
//	    	 if(closet.size()==0) //0개일 시
//	    	 {
//	    		bw.write("0\n"); 
//	    	 }
//	    	 //만약 한 종류라면
//	    	 else if(closet.size() ==1) //한 종류의 옷일 경우 
//	    	 {
//	    		 bw.write(closet.get(type.pop())+"\n");
//	    	 }
//	    	 else 
//	    	 {
//	    		 Iterator<String> keys = closet.keySet().iterator();
//	    		 while(keys.hasNext())
//	    		 {
//	    			 String key = keys.next();
//	    			 ans *= (closet.get(key)+1);
//	    		 }
//	    		 bw.write(ans-1+"\n");
//	    	 }
//	    	 bw.flush();
//	     }
//	 }
//}
