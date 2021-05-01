import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_11723 {
	static boolean x[];
	public static void main(String[] args) throws IOException {
		
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //ют╥б
	      int n = Integer.parseInt(br.readLine());
	      x = new boolean[21];
	     
	      for(int i=0;i<n;i++)
	      {
		      String imsis[] = br.readLine().split(" ");
		      if(imsis[0].equals("add")) 
		      {
		    	  x[(Integer.parseInt(imsis[1]))] = true;
		      }
		      else if(imsis[0].equals("remove"))
		      {
		    	  x[(Integer.parseInt(imsis[1]))] = false;
		      }
		      else if(imsis[0].equals("check"))
		      {
		    	  if(x[Integer.parseInt(imsis[1])] == true)
		    	  {
		    		  bw.write(1+"\n");
		    	  }
		    	  else
		    		  bw.write(0+"\n");
		      }
		      else if(imsis[0].equals("toggle"))
		      {
		    	  if(x[Integer.parseInt(imsis[1])] == true)
		    	  {
		    		  x[Integer.parseInt(imsis[1])] = false;
		    	  }
		    	  else
		    		  x[Integer.parseInt(imsis[1])] = true;
		      }
		      else if(imsis[0].equals("all"))
		      {
		    	  for(int j=1;j<21;j++)
		    	  {
		    		  x[j] = true;
		    	  }
		      }
		      else //empty
		      {
		    	  for(int j=1;j<21;j++)
		    	  {
		    		  x[j] = false;
		    	  }
		      }
	      }
	      
	      bw.flush();
	}
}
