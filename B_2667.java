//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class B_2667 {
//	static ArrayList<ArrayList<Integer>> gr;
//	static boolean isvisit[][];
//	static Queue<Node> q;
//	static int countimsi =0;
//	static int n;
//	 public static void main(String[] args) throws IOException {
//		 
//	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	     
//	     gr = new ArrayList<ArrayList<Integer>>();
//	     n = Integer.parseInt(br.readLine());
//	     isvisit = new boolean[n][n];
//	     q = new LinkedList<Node>();
//	     LinkedList<Integer> ans = new LinkedList<Integer>();
//	     
//	     for(int i=0;i<n;i++)
//	     {
//	    	 String imsi = br.readLine();
//	    	 gr.add(new ArrayList<Integer>());
//	    	 for(int j=0;j<n;j++)
//	    	 {
//	    		 gr.get(i).add(imsi.charAt(j)-'0');
//	    	 }
//	     }
//	     
//	     int countall=0;
//	     for(int i=0;i<n;i++)
//	     {
//	    	 for(int j=0;j<n;j++)
//	    	 {
//	    		 if(isvisit[i][j] == false && gr.get(i).get(j) ==1) //1�̰� �湮 ����
//	    		 {
//	    			 countimsi =0;
//	    			 countall++;
//	    			 q.add(new Node(i,j));
//	    			 BFS(i,j);
//	    			 ans.add(countimsi);
//	    		 }
//	    	 }
//	     }
//	     
//	     Collections.sort(ans);
//	     bw.write(countall+"\n");
//	     Iterator<Integer> itr = ans.iterator();
//	     while(itr.hasNext()) {
//	    	 bw.write(itr.next()+"\n");
//	     }
//	     bw.flush();
//	     
//	 }
//	 static void BFS(int y, int x)
//	 {
//		 if(isvisit[y][x] == true) //�̹� �湮�� ���
//		 {
//			 if(q.isEmpty()== true)
//			 {
//				 return; 
//			 }
//			 else
//			 {
//				 Node imsinode = q.poll();
//				 BFS(imsinode.y, imsinode.x); 
//			 }
//		 }
//		 else
//		 {
//			 isvisit[y][x] = true;
//			 countimsi +=1;
//			 //q�� �߰�
//		        if(y>0 && gr.get(y-1).get(x) ==1) //�� ����
//		            q.add(new Node(y-1, x));
//		        if(y<n-1 && gr.get(y+1).get(x) ==1) // �� ����
//		        	q.add(new Node(y+1, x));
//		        if(x>0 && gr.get(y).get(x-1) ==1) //���� ����
//		        	q.add(new Node(y, x-1));
//		        if(x<n-1 && gr.get(y).get(x+1) ==1) //������ ����
//		        	q.add(new Node(y, x+1));
//			 
//			 //�� ������ ���� �� queue���� ������ �̵�
//			 if(q.isEmpty()== true)
//			 {
//				 return; 
//			 }
//			 else
//			 {
//				 Node imsinode = q.poll();
//				 BFS(imsinode.y, imsinode.x); 
//			 }
//	 }
//}}
//
//class Node {
//	int y;
//	int x;
//	
//	Node(int y, int x)
//	{
//		this.y = y;
//		this.x = x;
//	}
//}
