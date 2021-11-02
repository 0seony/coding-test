import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		//입력받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		// 1부터 n까지 합 구하기
		for(int i = 1; i<=n; i++) {
			sum += i;
		}
		
		// 출력
		System.out.println(sum);
	}
}
