import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		//x좌표, y좌표 입력받기
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println(1);
		}else if(x<0 && y>0) {
			System.out.println(2);
		}else if(x<0 && y<0) {
			System.out.println(3);
		}else if(x>0 && y<0) {
			System.out.println(4);
		}
	}
}