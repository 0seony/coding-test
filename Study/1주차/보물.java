import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for(int j=0; j<N; j++) {
			B[j] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		int S = 0;
		for(int k=0; k<N; k++) {
			S += A[k] * B[N-1-k];
		}
		System.out.println(S);
	}

}
