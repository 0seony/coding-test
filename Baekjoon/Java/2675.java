import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String[] arr = sc.nextLine().split(" ");
			String S = "";
			int R = Integer.parseInt(arr[0]);
			for (int j = 0; j < arr[1].length(); j++) {
				for (int k = 0; k < R; k++) {
					S += arr[1].charAt(j);
				}
			}
			System.out.println(S);
		}
	}
}
