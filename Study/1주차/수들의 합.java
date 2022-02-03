import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 자연수 조건 범위
		long S = sc.nextLong();
		// int 타입으로 할 경우 시간초과 why?
		long N = 0, num = 0;

		while (num<S) {
			num += ++N;
		}
		N = (num==S)?N:N-1;
		System.out.println(N);
	}

}
