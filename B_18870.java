import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class B_18870 {
	 public static void main(String[] args) throws IOException {

	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     //�Է�
	     int n = Integer.parseInt(br.readLine());
	     String imsis[] = br.readLine().split(" ");
	     
	     TreeSet<BigInteger> tr= new TreeSet<BigInteger>();
	     
	     for(int i=0;i<imsis.length;i++)
	     {
	    	 tr.add(new BigInteger(imsis[i]));
	     }
	     
	     NavigableSet<BigInteger> set = tr.descendingSet();
	     NavigableSet<BigInteger> set2 = set.descendingSet(); //�������� ����
	     
	     
	     //���� hashmap�� ����
	     HashMap<BigInteger, Integer> ha = new HashMap<BigInteger, Integer>();
	     int count =0;
	     for(BigInteger big : set2)
	     {
	    	 ha.put(big,count++);
	     }
	     
	     //���� ���ڿ��� ���鼭 value�� ���
	     for(int i=0;i<n;i++)
	     {
	    	 bw.write(ha.get(new BigInteger(imsis[i]))+" ");
	     }
	     bw.flush();
	     
	     //�ݼ� : �޸𸮸� �ʹ� ���� ����� -> treeset���� �� �� ���� �迭���� hashmap���� �� �� �ߺ����� ����
	 }
}
