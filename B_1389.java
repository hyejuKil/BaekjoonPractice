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
//public class B_1389 {
//	static int n;
//	static int m;
//	static ArrayList<ArrayList<Integer>> li;
//	static boolean isvisit[];
//	static int nujuk =0;
//	static Queue<Node> q = new LinkedList<Node>();
//	 public static void main(String[] args) throws IOException {
//
//	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	     
//	     //�Է�
//	     String inputs[] = br.readLine().split(" ");
//	     n = Integer.parseInt(inputs[0]); //������ ��
//	     m = Integer.parseInt(inputs[1]); //ģ�� ������ ��
//	     
//	     li = new ArrayList<ArrayList<Integer>>();
//	     
//	     for(int i=0;i<=n;i++) //���� �߰�
//	     {
//	    	li.add(new ArrayList<Integer>()); 
//	     }
//	     
//	     for(int i=0;i<m;i++) //���� �߰�
//	     {
//	    	 inputs = br.readLine().split(" ");
//	    	 li.get(Integer.parseInt(inputs[0])).add(Integer.parseInt(inputs[1]));
//	    	 li.get(Integer.parseInt(inputs[1])).add(Integer.parseInt(inputs[0]));
//	     }
//	     
//	     for(int i=1;i<=n;i++) //����
//	     {
//	    	 Collections.sort(li.get(i));;
//	     }
//	     
//	     int min = -1;
//	     int minnum = 0;
//	     for(int i=1;i<=n;i++) //��� ����ŭ ĳ������
//	     {
//		     int imsimin = 0;
//	    	 for(int j=1;j<=n;j++)
//	    	 {
//	    		 if(i==j) //�ڱ� �ڽ�
//	    			 continue;
//	    		 else
//	    		 {
//	    			 nujuk=0;
//	    		     isvisit = new boolean[n+1];
//	    			 BFS(i,j,0);
//	    			 imsimin += nujuk;
//	    			 q.clear();
//	    		 }
//	    	 }
//			 //System.out.println("imsimin = "+imsimin);
//	    	 if(min == -1 || imsimin <min)
//	    	 {
//	    		 min = imsimin;
//	    		 minnum = i;
//	    	 }
//	     }
//	     
//	     bw.write(minnum+"\n");
//	     bw.flush();
//	 }
//	 
//	 static void BFS(int now, int end, int count)
//	 {
//		 //System.out.println("now : "+now+" count : "+count);
//		 if(now == end) //ã�� ����� ��� -> ��
//		 {
//			 nujuk = count;
//			 return;
//		 }
//		 else if(nujuk != 0 || now>n )
//			 return;
//		 else if(isvisit[now] == true) //�湮�� ����� ��� -> ���� ���
//		 {
//			 if(q.isEmpty())
//				 return;
//			 else
//			 {
//				 Node imsinode = q.poll();
//				 BFS(imsinode.node,end,imsinode.count); 
//			 }
//		 }
//		 else //�湮���� �ʾҰ� ã�� ��嵵 �ƴ� 
//		 {
//			 isvisit[now] = true;
//			 
//			 Iterator<Integer> itr = li.get(now).iterator();
//			 
//			 while(itr.hasNext()) //queue�� �߰�
//			 {
//				 int imsisu = itr.next();
//				 if(imsisu == end)
//				 {
//					 nujuk = count+1;
//					 return;
//				 }
//				 q.add(new Node(imsisu, count+1));
//			 }
//			 
//			 //���� ���
//			 if(q.isEmpty())
//				 return;
//			 else
//			 {
//				 Node imsinode = q.poll();
//				 BFS(imsinode.node,end,imsinode.count); 
//			 }
//		 }
//	 }
//}
//
//class Node{
//	int node;
//	int count;
//	
//	Node(int node, int count)
//	{
//		this.node = node;
//		this.count = count;
//	}
//}
