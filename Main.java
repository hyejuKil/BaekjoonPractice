import java.util.*;
import java.io.*;

public class Main {
	 public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //�Է�
	     int n =Integer.parseInt(br.readLine()); //������ ����
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
		 //���� ���� �ְ�, ���� ���� �ø��� ����
		 if(a.size()==0) //ù��
		 {
			 a.add(input);
			 return a;
		 }
		 
		 else
		 {
			 a.add(input); //���� ���� ����
			 int now = a.size()-1; //���� ��ġ(�迭 ���� ��)
			 while(now>0 && Math.abs(a.get(now)) <= Math.abs(a.get((now-1)/2))) //���� ��ġ�� root�� �ƴϰ�, �θ� ��庸�� ���� ��尡 �� ����
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
		 if(a.size()==0) //�迭 ����� ��
		 {
			 System.out.println("0");
			 return a;
		 }
		 
		 else //Delete ����
		 {
			 int out = a.get(0); //root���� ���ŵ�
			 a.set(0, a.get(a.size()-1)); //���� ���� ������ root�� ���� �����
			 a.remove(a.size()-1); //���� ����
			 int now = 0;
			 
			 //���� -> root���� �´� ��ġ���� ���Ͽ� ����
			 while(now<a.size()/2)
			 { 
				 if(now*2+2 > a.size())
					 break;
				if(now*2+2 == a.size() || Math.abs(a.get(now*2+1))<=Math.abs(a.get(now*2+2))) //������ �����ʺ��� �� �۰� �������� ������ ��
				{
					if(Math.abs(a.get(now))>= Math.abs(a.get(now*2+1))) //�ڽ� ���ʰ��̶� ���ؼ� �θ� �� Ŭ���
					{
						//�� change
							if(Math.abs(a.get(now))== Math.abs(a.get(now*2+1)) && a.get(now) < a.get(now *2+1)) //���밪 ���� �θ��� �� ������ -> �״��
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
					if(a.get(now)>= Math.abs(a.get(now*2+2))) //�����ʰ��� ��
					 {
						//�� change
						if(Math.abs(a.get(now))== Math.abs(a.get(now*2+2)) && a.get(now) < a.get(now *2+2)) //���밪 ���� �θ��� �� ������ -> �״��
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
			 System.out.println(out);//root��
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

