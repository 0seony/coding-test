class Solution {
    public String solution(String phone_number) {
        String[] ph = phone_number.split("");
        String answer = "";

        for(int i = 0; i<ph.length-4; i++){
            ph[i] = "*";
        }
        for(int i = 0; i<ph.length; i++){
            answer += ph[i].charAt(0);
        }
        return answer;
    }
}
