import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 매우 큰 정수 다루기 - BigInteger 클래스
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());
		System.out.println(A.add(B));
	}
}
