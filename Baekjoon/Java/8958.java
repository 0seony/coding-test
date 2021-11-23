import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());

		int count = 0;
		int score = 0;

		for (int i = 0; i < T; i++) {
			String[] arr = bf.readLine().split("");
			for (int j = 0; j < arr.length; j++) {
				if(arr[j].equals("O")) {
					count++;
				}else if(arr[j].equals("X")) {
					count = 0;
				}
				score += count;

			}
			System.out.println(score);
			count = 0;
			score = 0;
		}
	}
}
