import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String s = "" + n;
		String[] arr = s.split("");
		Arrays.sort(arr,Collections.reverseOrder());
		s = "";
		for(int i = 0; i<arr.length; i++) {
			s+=arr[i];
		}
        long answer = Long.parseLong(s);
        return answer;
    }
}
