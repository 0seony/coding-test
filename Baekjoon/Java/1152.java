import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = bf.readLine().split(" ");
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == "") {
				continue;
			}
			count++;
		}
		System.out.println(count);
	}
}
