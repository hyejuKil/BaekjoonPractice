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

public class B_1260 {
	static ArrayList<ArrayList<Integer>> gr;
	static boolean isvisit[];
	static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //�Է�
	     String imsis[] = br.readLine().split(" ");
	     int n = Integer.parseInt(imsis[0]); //������ ����
	     int m = Integer.parseInt(imsis[1]); //������ ��
	     int v = Integer.parseInt(imsis[2]); // ������ ���� ��ȣ

	     gr = new ArrayList<ArrayList<Integer>>(); //�׷���
	     isvisit = new boolean[n+1]; //�湮�ߴ��� ���
	     for(int i=0;i<n+1;i++) 
	     {
	    	 isvisit[i] = false; //�湮 ��� �ʱ�ȭ
	    	 gr.add(new ArrayList<Integer>()); //�׷��� ��� �߰�
	     }
	     for(int i=0;i<m;i++) //�׷��� ����
	     {
	    	 imsis = br.readLine().split(" ");
	    	 gr.get(Integer.parseInt(imsis[0])).add(Integer.parseInt(imsis[1]));
	    	 gr.get(Integer.parseInt(imsis[1])).add(Integer.parseInt(imsis[0]));
	     }
	     for(int i=0;i<n+1;i++) //���� -> ������ ���� Ž���ϵ���
	    	 Collections.sort(gr.get(i));
	     
	     DFS(v); 
	     System.out.println();
	     
	     for(int i=0;i<n+1;i++) //�湮 ��� �ʱ�ȭ
	     {
	    	 isvisit[i] = false;
	     }
	     
	     q = new LinkedList<Integer>(); //BFS ���� queue ����
	     
	     BFS(v);
	     
	 }
	 
	 static void DFS(int i)
	 {
		 if(isvisit[i] == true) //�̹� �湮�� ���
			 return;
		 else
		 {
			 isvisit[i] = true;
			 System.out.print(i+" ");
			 Iterator<Integer> itr = gr.get(i).iterator();
			 while(itr.hasNext())
			 {
				 DFS(itr.next());
			 }
		 }
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
			 System.out.print(i);
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
				 System.out.println();
				 return; 
			 }
			 else
			 {
				 System.out.print(" ");
				 BFS(q.poll()); 
			 }
		 }
	 }
}
