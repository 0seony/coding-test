import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수 A,B 입력 받기
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {	//A가 B보다 큰 경우
			System.out.println(">");
		}else if(A<B) {	//A가 B보다 작은 경우
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}
}
