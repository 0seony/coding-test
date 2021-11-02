import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		// N 입력 받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//구구단 N단 출력하기
		for(int i = 1; i<10; i++) {
			System.out.println(N + "*" + i + "=" + N*i);
		}
	}
}
