import java.util.*;
import java.io.*;

public class Main {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
      //�Է�
      int n= Integer.parseInt(br.readLine());
      int inputNum = 0; //�Է¹޴� ���� ��
      int answer = 0; //���°�� ��µǴ��� �˾ƾ��ϴ� ���� ��ȣ
      int count=0; //��µǴ� ����
      String imsis[];
      Queue<Node> q;
      for(int i=0;i<n;i++)
      {
    	  count=0;
    	  imsis = br.readLine().split(" "); //���� ���� �Է�
    	  inputNum = Integer.parseInt(imsis[0]); 
    	  answer = Integer.parseInt(imsis[1]);
    	  
    	  q = new LinkedList<Node>();
    	  Node imsinode;
    	  imsis = br.readLine().split(" ");
    	  for(int j=0;j<inputNum;j++) //���� �Է�
    	  {
    		  imsinode = new Node(j,Integer.parseInt(imsis[j]));
    		  q.add(imsinode);
    	  }
    	  
    	  //�ݺ����� ���� ��µǴ��� ã��
    	  while(true)
    	  {
    		  boolean isbreak = false;
    		  Iterator<Node> itr = q.iterator();
    		  while(itr.hasNext())
    		  {
    			  if(itr.next().priority > q.peek().priority) //�� ū �켱���� �߰�
    			  {
    				  Node imsiPoll = q.poll();
    				  q.add(imsiPoll); //�ٽ� ���� �ڿ� ����
    				  isbreak = true;
    				  break;
    			  }
    		  }
    		  //�� ū �켱���� �߰� ���� -> ã�� ��ġ�� ������ ��� ��, �ƴϸ� �׳� poll
    		  if(isbreak == false)
    		  {
    			  count++;
        		  if(q.peek().input == answer)
        		  {
        			  bw.write(count+"\n");
        			  q.clear();
        			  break;
        		  }
        		  else
        			  q.poll();  
    		  }
    	  }
      }
      bw.flush();
      
   }
}

class Node{
	int input;
	int priority;
	
	Node(int input, int priority)
	{
		this.input = input;
		this.priority = priority;
	}
}

