import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		// 테스트 케이스 입력받기
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		// 출력할 값을 담을 배열 생성
		int[] answer = new int[T];
		
		// 개행 문자 삭제
		sc.nextLine();
		
		// 두 정수를 입력받아 합을 구해 배열에 담기
		for(int i = 0; i<T; i++) {
			String[] number = sc.nextLine().split(" ");
			int sum = Integer.parseInt(number[0]) + Integer.parseInt(number[1]);
			answer[i] = sum;
		}
		
		// 출력
		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
