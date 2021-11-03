import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] number_str = sc.nextLine().split(" ");
		int[] number = new int[N];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(number_str[i]);
		}
		Arrays.sort(number);
		System.out.println(number[0] + " " + number[N - 1]);
	}
}
