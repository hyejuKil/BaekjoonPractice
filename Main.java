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
	     
	     for(int i=0;i<inputs.length;i++) //�̾Ƴ� �� ������ŭ
	     {
	    	 if(q.isEmpty())
	    		 break;
	    	 int su = Integer.parseInt(inputs[i]); //�̾Ƴ� ��
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
	    	 
	    	 if(count<=(q.size()/2)) //q�� �߰����� �տ� ������� -> 2���� ����
	    	 {
	    		 for(int j=0;j<count;j++)
	    		 {
	    			 int imsi = q.poll();
	    			 q.add(imsi);
	    		 }
		    	 System.out.println(count);
	    		 ans += count;
	    	 }
	    	 else //3��
	    	 {
	    		 for(int j=0;j<q.size()-count;j++)
	    		 {
	    			 int imsi = q.removeLast();
	    			 q.addFirst(imsi);
	    		 }
		    	 System.out.println(q.size()-count);
	    		 ans += q.size()-count+1; //+1 ������ 1�� ����ϱ� ���� ���� ������ �ҷ��;� �ϱ� ����
	    		 count3++;
	    	 }
	    	 System.out.println("q.peek :"+q.peek());
	    	 q.poll(); //1��
	     }
	     if(count3>1)
	    	 ans+=count3-2;
	     bw.write(ans+"\n");
	     bw.flush();
}
}

