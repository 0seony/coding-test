import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		while(N!=0) {
			if(N%5==0) {
				count += N/5;
				N = 0;
				continue;
			}else if(N%3==0 && N<15) {
				count += N/3;
				N = 0;
				continue;
			}else if(N-5>2) {
				count++;
				N -=5;
				continue;
			}else {
				count = -1;
				N = 0;
			}
		}
		System.out.println(count);
	}

}
