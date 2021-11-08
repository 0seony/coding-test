import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] S = bf.readLine().split("");
		String[] count = new String[26];
		for(int i=0; i<count.length; i++) {
			count[i] = String.valueOf((char)(i+97));
			for(int j = 0; j<S.length; j++) {
				count[i] = String.valueOf((char)(i+97));
				if(count[i].equals(S[j])) {
					count[i] = String.valueOf(j);
					break;
				}else if(!count[i].equals(S[j])) {
					count[i] = String.valueOf(-1);
				}
			}
		}
		
		for(int i = 0; i<count.length; i++) {
			System.out.print(count[i] + " ");
		}
	}

}
