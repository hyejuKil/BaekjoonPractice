import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_1541 {
	static boolean nowminus = false;
	 public static void main(String[] args) throws IOException {

	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     int ans =0;
	     
	     //입력
	     String input = br.readLine();
	     
	     //숫자만
	     String su[] = input.split("\\+|\\-");
	     //부호만
	     
	     StringTokenizer st = new StringTokenizer(input,"0|1|2|3|4|5|6|7|8|9"); //split으로 자를 시 공백 포함하여 tokenizer 사용(split은 구분자 사이에 데이터가 없는 경우 공백의 데이터 반환하므로)
	     String buho[] = new String[50];
	     int imsii =0;
	     while(st.hasMoreTokens()) {
	    	 buho[imsii++] = st.nextToken(); 
	     }
	     
	     //기존 수에서 -가 나올 경우 괄호로 묶어 전부 음수로 만들기 -> 최소가 나올 것으로 예상
	     ans = Integer.parseInt(su[0]); //첫항은 그냥 첫번째 수
	     for(int i=1;i<su.length;i++) //숫자 개수만큼 반복
	     {
	    	 int imsisu = Integer.parseInt(su[i]);
	    	 if(buho[i-1].equals("-")) //해당 수 앞의 부호가 -일 경우
	    	 {
	    		 if(nowminus == false) //이전에는 +였음
	    		 {
	    			 nowminus = true; // 앞으로는 -부호안의 괄호로 감싸짐
	    		 }
   			 ans -= imsisu; //현재수는 -로 계산됨
	    	 }
	    	 else //해당 수 앞의 부호가 +일 경우
	    	 {
	    		 if(nowminus == false) //이전에 -가 없었을 경우
	    		 {
	    			 //그냥 더하기
	    			 ans += imsisu;
	    		 } 
	    		 else //이전에 -가 있었음 (현재 괄호로 묶인 - 안임) 
	    		 {
	    			 //빽
	    			 ans -= imsisu;
	    		 }
	    	 }
	     }
	     bw.write(ans+"\n");
	     bw.flush();
	     
	 }
}
