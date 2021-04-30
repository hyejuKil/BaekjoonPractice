import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class B_11279 {
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
	    		 a=  Delete_Maxheap(a);
	    	 }
	    	 else //Insert
	    	 {
	    		 a = Insert_Maxheap(a, input);
	    	 }
	     }
	 }
	 
	 static ArrayList<Integer> Insert_Maxheap(ArrayList<Integer> a, int input)
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
			 while(now>0 && a.get(now) > a.get((now-1)/2)) //���� ��ġ�� root�� �ƴϰ�, �θ� ��庸�� ���� ��尡 �� Ŭ �� 
			 { 
				 int temp = a.get((now-1)/2);
				 a.set((now-1)/2, a.get(now));
				 a.set(now,temp);
				 now = (now-1)/2;
			 }
		 }
		 return a;
	 }
	 
	 static ArrayList<Integer> Delete_Maxheap(ArrayList<Integer> a)
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
				 if(now*2+2 > a.size()) //overflow
					 break;
				if(now*2+2 == a.size() || a.get(now*2+1)>a.get(now*2+2)) //���� ȥ�ڰų� �����ʺ��� ������ Ŭ ��
				{
					if(a.get(now) < a.get(now*2+1)) //�ڽ� ���ʰ��̶� ���ؼ� �θ� ���� Ŭ���
					{
						//�� change
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
					if(a.get(now) < a.get(now*2+2)) //�����ʰ��� ��
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
			 }
			 System.out.println(out);//root��
			 return a; 
		 }
}
