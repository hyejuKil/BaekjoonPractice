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
	     
	     //입력
	     int n = Integer.parseInt(br.readLine());
	     String imsis[] = br.readLine().split(" ");
	     
	     TreeSet<BigInteger> tr= new TreeSet<BigInteger>();
	     
	     for(int i=0;i<imsis.length;i++)
	     {
	    	 tr.add(new BigInteger(imsis[i]));
	     }
	     
	     NavigableSet<BigInteger> set = tr.descendingSet();
	     NavigableSet<BigInteger> set2 = set.descendingSet(); //오름차순 정렬
	     
	     
	     //새로 hashmap에 저장
	     HashMap<BigInteger, Integer> ha = new HashMap<BigInteger, Integer>();
	     int count =0;
	     for(BigInteger big : set2)
	     {
	    	 ha.put(big,count++);
	     }
	     
	     //원본 문자열을 돌면서 value값 출력
	     for(int i=0;i<n;i++)
	     {
	    	 bw.write(ha.get(new BigInteger(imsis[i]))+" ");
	     }
	     bw.flush();
	     
	     //반성 : 메모리를 너무 많이 사용함 -> treeset으로 갈 것 없이 배열에서 hashmap으로 갈 때 중복제거 가능
	 }
}
