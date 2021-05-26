import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	 public static void main(String[] args) throws IOException {
		 
	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     int n = Integer.parseInt(br.readLine());
	     LinkedList<Character> ans = null;
	     for(int i=0;i<n;i++)
	     {
	    	 String input = br.readLine();
	    	 char nowin;
	    	 int now=0;
	    	 ans = new LinkedList<Character>();
	    	 for(int j=0;j<input.length();j++)
	    	 {
	    		 nowin = input.charAt(j);
	    		 //System.out.println(nowin+" "+now);
	    		 if(nowin == '<' && now>0)
	    		 {
	    			 now-=1;
	    		 }
	    		 else if(nowin == '>' && now<ans.size())
	    		 {
	    			 now+=1;
	    		 }
	    		 else if(nowin == '-' && !ans.isEmpty())
	    		 {
	    				 if(now >= ans.size()) //³¡¹ø
	    				 {
	    					 ans.removeLast();
	    					 now-=1;
	    				 }
	    				 else
	    					 ans.remove(now);
	    		 }
	    		 else if(nowin != '<' && nowin != '-' && nowin !='>')
	    		 {
	    			 ans.add(now, nowin);
	    			 now+=1;
	    		 }
	    	 }
	    	 
		     for(int j=0;j<ans.size();j++)
		    	 bw.write(ans.get(j));
		     bw.write("\n");
	     }
	     
	     bw.flush();
	     
	 }
}


