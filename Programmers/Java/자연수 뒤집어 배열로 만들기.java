class Solution {
    public int[] solution(long n) {
        String str_n = String.valueOf(n);
        String[] arr = str_n.split("");
        str_n = "";
        for(int i = arr.length-1; i>=0; i--){
            str_n += arr[i];
        }
        arr = str_n.split("");
        int[] answer = new int[str_n.length()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
