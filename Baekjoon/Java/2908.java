import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = bf.readLine().split(" ");
		String strA = "";
		String strB = "";
		for (int i = 2; i >= 0; i--) {
			strA += arr[0].charAt(i);
			strB += arr[1].charAt(i);
		}
		int A = Integer.parseInt(strA);
		int B = Integer.parseInt(strB);

		System.out.println(Math.max(A, B));
	}
}
