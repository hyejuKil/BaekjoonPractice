import java.util.*;
import java.io.*;

public class Main {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
      //입력
      int n= Integer.parseInt(br.readLine());
      int inputNum = 0; //입력받는 문서 수
      int answer = 0; //몇번째로 출력되는지 알아야하는 문서 번호
      int count=0; //출력되는 순서
      String imsis[];
      Queue<Node> q;
      for(int i=0;i<n;i++)
      {
    	  count=0;
    	  imsis = br.readLine().split(" "); //문서 정보 입력
    	  inputNum = Integer.parseInt(imsis[0]); 
    	  answer = Integer.parseInt(imsis[1]);
    	  
    	  q = new LinkedList<Node>();
    	  Node imsinode;
    	  imsis = br.readLine().split(" ");
    	  for(int j=0;j<inputNum;j++) //문서 입력
    	  {
    		  imsinode = new Node(j,Integer.parseInt(imsis[j]));
    		  q.add(imsinode);
    	  }
    	  
    	  //반복으로 언제 출력되는지 찾기
    	  while(true)
    	  {
    		  boolean isbreak = false;
    		  Iterator<Node> itr = q.iterator();
    		  while(itr.hasNext())
    		  {
    			  if(itr.next().priority > q.peek().priority) //더 큰 우선순위 발견
    			  {
    				  Node imsiPoll = q.poll();
    				  q.add(imsiPoll); //다시 제일 뒤에 삽입
    				  isbreak = true;
    				  break;
    			  }
    		  }
    		  //더 큰 우선순위 발견 실패 -> 찾는 위치의 문서일 경우 끝, 아니면 그냥 poll
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

