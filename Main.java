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
	    	 }
	    	 else //Insert
	    	 {
	    		 a = Insert_Minheap(a, input);
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
			 while(now!=0 && a.get(now) < a.get((now-1)/2)) //���� ��ġ�� root�� �ƴϰ�, �θ� ��庸�� ���� ��尡 �� Ŭ �� 
			 { 
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
				 if(a.get(now) > a.get(now*2+1)) //�ڽ� ���ʰ��̶� ���ؼ� �θ� �� Ŭ���
				 {
					//�� change
					 int temp = a.get(now*2+1);
					 a.set(now*2+1, a.get(now));
					 a.set(now,temp);
					 now = now *2 +1;
				 }
				 else if(a.get(now) > a.get(now*2)+2) //�����ʰ��� ��
				 {
					//�� change
					 int temp = a.get(now*2+2);
					 a.set(now*2+2, a.get(now));
					 a.set(now,temp);
					 now = now*2+2;
				 }
				 else
					 break;
			 }
			 System.out.println(out);//root��
			 return a; 
		 }
	 }
}

