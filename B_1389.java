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
//	     //입력
//	     String inputs[] = br.readLine().split(" ");
//	     n = Integer.parseInt(inputs[0]); //유저의 수
//	     m = Integer.parseInt(inputs[1]); //친구 관계의 수
//	     
//	     li = new ArrayList<ArrayList<Integer>>();
//	     
//	     for(int i=0;i<=n;i++) //유저 추가
//	     {
//	    	li.add(new ArrayList<Integer>()); 
//	     }
//	     
//	     for(int i=0;i<m;i++) //관계 추가
//	     {
//	    	 inputs = br.readLine().split(" ");
//	    	 li.get(Integer.parseInt(inputs[0])).add(Integer.parseInt(inputs[1]));
//	    	 li.get(Integer.parseInt(inputs[1])).add(Integer.parseInt(inputs[0]));
//	     }
//	     
//	     for(int i=1;i<=n;i++) //정렬
//	     {
//	    	 Collections.sort(li.get(i));;
//	     }
//	     
//	     int min = -1;
//	     int minnum = 0;
//	     for(int i=1;i<=n;i++) //노드 수만큼 캐빈베이컨
//	     {
//		     int imsimin = 0;
//	    	 for(int j=1;j<=n;j++)
//	    	 {
//	    		 if(i==j) //자기 자신
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
//		 if(now == end) //찾는 노드일 경우 -> 끝
//		 {
//			 nujuk = count;
//			 return;
//		 }
//		 else if(nujuk != 0 || now>n )
//			 return;
//		 else if(isvisit[now] == true) //방문한 노드일 경우 -> 다음 노드
//		 {
//			 if(q.isEmpty())
//				 return;
//			 else
//			 {
//				 Node imsinode = q.poll();
//				 BFS(imsinode.node,end,imsinode.count); 
//			 }
//		 }
//		 else //방문하지 않았고 찾는 노드도 아님 
//		 {
//			 isvisit[now] = true;
//			 
//			 Iterator<Integer> itr = li.get(now).iterator();
//			 
//			 while(itr.hasNext()) //queue에 추가
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
//			 //다음 노드
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
