//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Iterator;
//import java.util.concurrent.ConcurrentLinkedDeque;
//
//public class B_1021 {
//	static int n;
//	static int m;
//    
//	 public static void main(String[] args) throws IOException {
//		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	 
//	String inputs[] = br.readLine().split(" ");
//    n = Integer.parseInt(inputs[0]);
//    ConcurrentLinkedDeque<Integer> q = new ConcurrentLinkedDeque<Integer>();
//    m = Integer.parseInt(inputs[1]);
//    inputs = br.readLine().split(" ");
//    int ans=0;
//    int count3=0;
//    
//    for(int i=1;i<=n;i++)
//   	 q.add(i);
//    
//    for(int i=0;i<inputs.length;i++) //�̾Ƴ� �� ������ŭ
//    {
//   	 if(q.isEmpty())
//   		 break;
//   	 int su = Integer.parseInt(inputs[i]); //�̾Ƴ� ��
//   	 int count=0;
//   	 Iterator<Integer> itr = q.iterator();
//   	 while(itr.hasNext())
//   	 {
//   		 if(itr.next() == su)
//   		 {
//   			 break; 
//   		 }
//   		 count++;
//   	 }
//   	 
//   	 if(count<=(q.size()/2)) //q�� �߰����� �տ� ������� -> 2���� ����
//   	 {
//   		 for(int j=0;j<count;j++)
//   		 {
//   			 int imsi = q.poll();
//   			 q.add(imsi);
//   		 }
//   		 ans += count;
//   	 }
//   	 else //3��
//   	 {
//   		 for(int j=0;j<q.size()-count;j++)
//   		 {
//   			 int imsi = q.removeLast();
//   			 q.addFirst(imsi);
//   		 }
//   		 ans += q.size()-count; 
//   	 }
//   	 q.poll(); //1��
//    }
//    bw.write(ans+"\n");
//    bw.flush();
//}
//}
