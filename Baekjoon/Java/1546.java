import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N];
		double[] new_score = new double[N];

		for (int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
		}
		
		Arrays.sort(score);
		int M = score[N-1];
		double sum = 0;
		for(int i=0; i<N; i++) {
			new_score[i] = score[i]/(double)M*100; //M앞에 double캐스팅을 하지 않았더니 0으로 나누어떨어졌음
			sum += new_score[i];
		}
		
		System.out.println(sum/N);
	}

}
