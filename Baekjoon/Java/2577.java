import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int multi = A * B * C;
		String str_multi = Integer.toString(multi);

		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		int count = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < str_multi.length(); j++) {
				if (num[i] == str_multi.charAt(j)) {
					count++;
				}
			}
			num[i] = Integer.toString(count).charAt(0);
			System.out.println(num[i]);
			count = 0;
		}

//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
	}
}
