import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if ((i < input.length() - 1 && input.charAt(i) == 'c')
					&& (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-')) {
				count++;
				i++;
			} else if ((i < input.length() - 2 && input.charAt(i) == 'd') && input.charAt(i + 1) == 'z'
					&& input.charAt(i + 2) == '=') {
				count++;
				i += 2;
			} else if ((i < input.length() - 1 && input.charAt(i) == 'd') && input.charAt(i + 1) == '-') {
				count++;
				i++;
			} else if (i < input.length() - 1 && (input.charAt(i) == 'l' || input.charAt(i) == 'n')
					&& input.charAt(i + 1) == 'j') {
				count++;
				i++;
			} else if (i < input.length() - 1 && (input.charAt(i) == 's' || input.charAt(i) == 'z')
					&& input.charAt(i + 1) == '=') {
				count++;
				i++;
			} else {
				count++;
			}
		}
		System.out.println(count);
	}
}
