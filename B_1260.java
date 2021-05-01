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
	      
	      //입력
	     String imsis[] = br.readLine().split(" ");
	     int n = Integer.parseInt(imsis[0]); //정점의 개수
	     int m = Integer.parseInt(imsis[1]); //간선의 개
	     int v = Integer.parseInt(imsis[2]); // 시작할 정점 번호

	     gr = new ArrayList<ArrayList<Integer>>(); //그래프
	     isvisit = new boolean[n+1]; //방문했는지 기록
	     for(int i=0;i<n+1;i++) 
	     {
	    	 isvisit[i] = false; //방문 기록 초기화
	    	 gr.add(new ArrayList<Integer>()); //그래프 노드 추가
	     }
	     for(int i=0;i<m;i++) //그래프 생성
	     {
	    	 imsis = br.readLine().split(" ");
	    	 gr.get(Integer.parseInt(imsis[0])).add(Integer.parseInt(imsis[1]));
	    	 gr.get(Integer.parseInt(imsis[1])).add(Integer.parseInt(imsis[0]));
	     }
	     for(int i=0;i<n+1;i++) //정렬 -> 작은거 먼저 탐색하도록
	    	 Collections.sort(gr.get(i));
	     
	     DFS(v); 
	     System.out.println();
	     
	     for(int i=0;i<n+1;i++) //방문 기록 초기화
	     {
	    	 isvisit[i] = false;
	     }
	     
	     q = new LinkedList<Integer>(); //BFS 위한 queue 생성
	     
	     BFS(v);
	     
	 }
	 
	 static void DFS(int i)
	 {
		 if(isvisit[i] == true) //이미 방문한 노드
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
		 if(isvisit[i] == true) //이미 방문한 노드
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
				 if(isvisit[imsi] == false) //방문 안한 노드 발견시
				 {
					 q.add(imsi); //queue에 넣기
				 }
			 }
			 //더 넣은거 없을 시 queue에서 꺼내서 이동
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
