import java.util.*;
import java.io.*;

public class Main {
	 public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //입력
	     int n =Integer.parseInt(br.readLine()); //연산의 개수
	     int input = 0;
	     ArrayList<Integer> a = new ArrayList<Integer>();
	     for(int i=0;i<n;i++)
	     {
	    	 input = Integer.parseInt(br.readLine());
	    	 
	    	 if(input == 0) //Delete
	    	 {
	    		 a=  Delete_Minheap(a);
//	    		 System.out.print("!");
//	    		 for(int j=0;j<a.size();j++)
//	    			 System.out.print(a.get(j)+" ");
//	    		 System.out.println(" !");
	    	 }
	    	 else //Insert
	    	 {
	    		 a = Insert_Minheap(a, input);
//	    		 System.out.print("?");
//	    		 for(int j=0;j<a.size();j++)
//	    			 System.out.print(a.get(j)+" ");
//	    		 System.out.println(" ?");
	    	 }
	     }
	 }
	 
	 static ArrayList<Integer> Insert_Minheap(ArrayList<Integer> a, int input)
	 {
		 //가장 끝에 넣고, 점차 위로 올리며 정렬
		 if(a.size()==0) //첫항
		 {
			 a.add(input);
			 return a;
		 }
		 
		 else
		 {
			 a.add(input); //제일 끝에 생성
			 int now = a.size()-1; //현재 위치(배열 제일 끝)
			 while(now>0 && Math.abs(a.get(now)) <= Math.abs(a.get((now-1)/2))) //현재 위치가 root가 아니고, 부모 노드보다 현재 노드가 더 작을
			 { 
				 if(now >1 &&Math.abs(a.get(now))== Math.abs(a.get((now-1)/2)) && a.get(now) > a.get(a.get((now-1)/2))) //
						break;
				 int temp = a.get((now-1)/2);
				 a.set((now-1)/2, a.get(now));
				 a.set(now,temp);
				 now = (now-1)/2;
			 }
		 }
		 return a;
	 }
	 
	 static ArrayList<Integer> Delete_Minheap(ArrayList<Integer> a)
	 {
		 if(a.size()==0) //배열 비었을 시
		 {
			 System.out.println("0");
			 return a;
		 }
		 
		 else //Delete 가능
		 {
			 int out = a.get(0); //root항이 제거됨
			 a.set(0, a.get(a.size()-1)); //제일 끝항 값으로 root항 값을 덮어씌움
			 a.remove(a.size()-1); //끝항 제거
			 int now = 0;
			 
			 //정렬 -> root값을 맞는 위치까지 비교하여 내림
			 while(now<a.size()/2)
			 { 
				 if(now*2+2 > a.size())
					 break;
				if(now*2+2 == a.size() || Math.abs(a.get(now*2+1))<=Math.abs(a.get(now*2+2))) //왼쪽이 오른쪽보다 더 작고 오른쪽이 존재할 때
				{
					if(Math.abs(a.get(now))>= Math.abs(a.get(now*2+1))) //자식 왼쪽값이랑 비교해서 부모가 더 클경우
					{
						//값 change
							if(Math.abs(a.get(now))== Math.abs(a.get(now*2+1)) && a.get(now) < a.get(now *2+1)) //절대값 같고 부모값이 더 작을때 -> 그대로
								break;
							int temp = a.get(now*2+1);
							a.set(now*2+1, a.get(now));
							a.set(now,temp);
							now = now *2 +1;	
					}
					else
						break;
				}
				else 
				{
					if(a.get(now)>= Math.abs(a.get(now*2+2))) //오른쪽값과 비교
					 {
						//값 change
						if(Math.abs(a.get(now))== Math.abs(a.get(now*2+2)) && a.get(now) < a.get(now *2+2)) //절대값 같고 부모값이 더 작을때 -> 그대로
							break;
						 int temp = a.get(now*2+2);
						 a.set(now*2+2, a.get(now));
						 a.set(now,temp);
						 now = now*2+2;
					 }	
					else
						break;
				}
			 }
			 System.out.println(out);//root값
			 return a; 
		 }
	 }
	 
	 static int min(int a, int b)
	 {
		 if(a<b)
			 return a;
		 else
			 return b;
	 }
	 
}

