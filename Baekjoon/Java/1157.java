import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toUpperCase();

		int[] count = new int[26];

		for (int i = 0; i < word.length(); i++) {
			count[word.charAt(i) - 65]++;
		}

		int max = 0; //-1로 하는건 왜그런걸까
		char answer = ' ';
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				answer = (char) (i + 65);
			} else if (max == count[i]) {
				answer = '?';
			}
		}
		System.out.println(answer);

//		가장 많은 횟수
//		Arrays.sort(count);
//		
//		if(count[count.length-1]==count[count.length-2]) {
//			System.out.println('?');
//		}else {
//			System.out.println(count[count.length-1]);
//		}
	}

}
