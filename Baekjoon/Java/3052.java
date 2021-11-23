import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input[] = new int[10];
		int remain[] = new int[10];
		
		for(int i = 0; i<input.length; i++) {
			input[i] = sc.nextInt();
			remain[i] = input[i] % 42;
		}
		
		int count = 1;
    //이전 값과 비교하여 달랐을 때 최초로 값이 달라지는 지점에서 앞에 수가 count가 안되기 때문에 1부터 시작
    //더 정확하게 다른 수만 카운트 할 수 있는 방법이 있는지?
    
		Arrays.sort(remain);
		for(int i =0; i<remain.length-1; i++) {
			if(remain[i]!=remain[i+1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
