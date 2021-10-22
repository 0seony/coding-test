import java.util.Scanner;

public class Main2753 {
	public static void main(String[] args) {
		
		//연도 입력받기
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		//윤년은 4의배수이면서 100의 배수가 아니고 400의 배수
		if(year%4==0 && year%100!=0) {
			System.out.println(1);
		}else if(year%400==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
