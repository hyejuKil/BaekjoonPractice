import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B_11718 {
	public static void main(String[] args) throws IOException {

	     //BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     Scanner sc = new Scanner(System.in);
	     
	     //입력
	     String input = null;
	     while(sc.hasNext())
	     {
	    	 System.out.println(sc.nextLine());
	     }
	 }
	 
	 //eof 설정을 buffered reader로 하려 했으나 실패 -> 따라서 scanner를 사용함.
}
