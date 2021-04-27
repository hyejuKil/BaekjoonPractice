import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_1074code {
	static long r;
	static long c;
	static long count=0;
	static long n;
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //�Է�
	      String imsis[] = br.readLine().split(" ");
	      n = Long.parseLong(imsis[0]);
	      r = Long.parseLong(imsis[1]);
	      c = Long.parseLong(imsis[2]);
	      
	      bw.write(B_1074(0, 0, n)+"\n");
	      bw.flush();
	      
	 }
	 
	 static long B_1074(long sero, long garo, long stage){
		 if(sero == r && garo == c ) //ã������ ���
		 {
			 return count;
		 }
		 else 
		 {
			 long gijun = (long) Math.pow(2, stage);
			 if(r<sero+gijun && c<garo+gijun) //1��и�
			 {
				 B_1074(sero,garo,stage-1);  
			 }
			 if(r<sero+gijun  && c>=garo+gijun) //2��и�
			 {
				 count +=  gijun*gijun;
				 B_1074(sero,garo+(long)Math.pow(2,stage),stage-1); 
			 }
			 if(r>=sero+gijun  && c<garo+gijun) //3��и�
			 {
				 count +=  gijun*gijun*2;
				 B_1074(sero+(long)Math.pow(2,stage),garo,stage-1); 
			 }
			 if(r>=sero+gijun  && c>=garo+gijun) //4��ո�
			 {
				 count += gijun*gijun*3;
				 B_1074(sero+(long)Math.pow(2,stage),garo+(long)Math.pow(2,stage),stage-1); 
			 }
		 }
		return count;
	 }
}
