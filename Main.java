import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.io.*;
import java.math.BigInteger;

public class Main {
	static int n;
	static int m;
	static int b[];
	static boolean isvisit[];
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
	 public static void main(String[] args) throws IOException {
		 
	     
	     String inputs[] = br.readLine().split(" ");
	     n = Integer.parseInt(inputs[0]);
	     ConcurrentLinkedDeque<Integer> q = new ConcurrentLinkedDeque<Integer>();
	     m = Integer.parseInt(inputs[1]);
	     inputs = br.readLine().split(" ");
	     int ans=0;
	     int count3=0;
	     
	     for(int i=1;i<n;i++)
	    	 q.add(i);
	     
	     for(int i=0;i<inputs.length;i++) //뽑아낼 수 갯수만큼
	     {
	    	 if(q.isEmpty())
	    		 break;
	    	 int su = Integer.parseInt(inputs[i]); //뽑아낼 수
	    	 int count=0;
	    	 Iterator<Integer> itr = q.iterator();
	    	 while(itr.hasNext())
	    	 {
	    		 if(itr.next() == su)
	    		 {
	    			 break; 
	    		 }
	    		 count++;
	    	 }
	    	 
	    	 if(count<=(q.size()/2)) //q의 중간보다 앞에 있을경우 -> 2번이 빠름
	    	 {
	    		 for(int j=0;j<count;j++)
	    		 {
	    			 int imsi = q.poll();
	    			 q.add(imsi);
	    		 }
		    	 System.out.println(count);
	    		 ans += count;
	    	 }
	    	 else //3번
	    	 {
	    		 for(int j=0;j<q.size()-count;j++)
	    		 {
	    			 int imsi = q.removeLast();
	    			 q.addFirst(imsi);
	    		 }
		    	 System.out.println(q.size()-count);
	    		 ans += q.size()-count+1; //+1 이유는 1번 사용하기 위해 제일 앞으로 불러와야 하기 때문
	    		 count3++;
	    	 }
	    	 System.out.println("q.peek :"+q.peek());
	    	 q.poll(); //1번
	     }
	     if(count3>1)
	    	 ans+=count3-2;
	     bw.write(ans+"\n");
	     bw.flush();
}
}

