import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(bf.readLine());

		// 테스트케이스만큼 반복문 실행
		for (int i = 0; i < C; i++) {

			String[] arr = bf.readLine().split(" ");
			int N = Integer.parseInt(arr[0]);
			int[] score = new int[N];
			double sum = 0;
			for (int j = 0; j < N; j++) {
				score[j] = Integer.parseInt(arr[j + 1]);
				sum += score[j];
			}

			double avg = sum / (double) N;

			int count = 0;

			for (int j = 0; j < N; j++) {
				if (score[j] > avg) {
					count++;
				}
			}
			double per = (double) count / N * 100;
			System.out.println(String.format("%.3f", per) + "%");

		}
	}
}
