class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        if(len%2!=0){
            answer=s.substring(len/2,(len/2)+1);
            //answer+=s.charAt(len/2);
        }else {
            answer=s.substring((len/2)-1,(len/2)+1);
            // for(int i=(len/2)-1; i<=len/2; i++){
            //     answer+=s.charAt(i);
            // }
        }
        return answer;
    }
}

/* 문자열 길이의 홀짝 여부에 따라 if-else문으로 접근
   처음 코딩은 substring 없이 비효율적으로 코딩함
   substring을 사용하여 다시 완성 */
