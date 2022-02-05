import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strA = sc.next(), strB = sc.next();
		int max, min;
		if (strA.contains("5") || strA.contains("6") || strB.contains("5") || strB.contains("6")) {
			String maxA = strA.replaceAll("5", "6");
			String maxB = strB.replaceAll("5", "6");
			max = Integer.parseInt(maxA) + Integer.parseInt(maxB);

			String minA = strA.replaceAll("6", "5");
			String minB = strB.replaceAll("6", "5");
			min = Integer.parseInt(minA) + Integer.parseInt(minB);
		} else {
			max = min = Integer.parseInt(strA) + Integer.parseInt(strB);
		}
		System.out.printf("%d %d", min, max);
	}

}
