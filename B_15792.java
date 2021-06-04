import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class B_15792 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		String inputs[] = br.readLine().split(" ");

		BigDecimal a = new BigDecimal(inputs[0]);
		BigDecimal b = new BigDecimal(inputs[1]);
		
		bw.write(a.divide(b,2000, RoundingMode.HALF_EVEN)+ "\n");
		bw.flush();
	}
}

//java 큰 소수점 -> BigDemical, 소수점 자리 정해주는 방법은 divide의 경우 (나눌수, 소수점개수, RoundingMode.HALF_EVEN ->얘는 반올림 정책)