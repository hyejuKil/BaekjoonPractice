import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class B_2606 {
	static ArrayList<ArrayList<Integer>> gr;
	static boolean isvisit[];
	static Queue<Integer> q;
	static int count=0;
	public static void main(String[] args) throws IOException {
		
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //�Է�
	      String imsis[];
	      int n = Integer.parseInt(br.readLine());
	      int m = Integer.parseInt(br.readLine());
	      gr = new ArrayList<ArrayList<Integer>>(); //�׷���
		  isvisit = new boolean[n+1]; //�湮�ߴ��� ���
		  for(int i=0;i<n+1;i++) 
		  {
		   isvisit[i] = false; //�湮 ��� �ʱ�ȭ
		     gr.add(new ArrayList<Integer>()); //�׷��� ��� �߰�
		  }
		  q = new LinkedList<Integer>(); //BFS ���� queue ����
		  for(int i=0;i<m;i++) //�׷��� ����
		  {
		    imsis = br.readLine().split(" ");
		    gr.get(Integer.parseInt(imsis[0])).add(Integer.parseInt(imsis[1]));
		    gr.get(Integer.parseInt(imsis[1])).add(Integer.parseInt(imsis[0]));
		  }
		   for(int i=0;i<n+1;i++) //���� -> ������ ���� Ž���ϵ���
			   Collections.sort(gr.get(i));
	      
		  BFS(1);
		  
		  bw.write(count-1+"\n"); 
	      bw.flush();
	}
	
	 static void BFS(int i)
	 {
		 if(isvisit[i] == true) //�̹� �湮�� ���
		 {
			 if(q.isEmpty()== true)
			 {
				 return; 
			 }
			 else
			 {
				 BFS(q.poll()); 
			 }
		 }
		 else
		 {
			 isvisit[i] = true;
			 count++;
			 Iterator<Integer> itr = gr.get(i).iterator();
			 while(itr.hasNext())
			 {
				 int imsi = itr.next();
				 if(isvisit[imsi] == false) //�湮 ���� ��� �߽߰�
				 {
					 q.add(imsi); //queue�� �ֱ�
				 }
			 }
			 //�� ������ ���� �� queue���� ������ �̵�
			 if(q.isEmpty()== true)
			 {
				 return; 
			 }
			 else
			 {
				 BFS(q.poll()); 
			 }
		 }
	 }
}
