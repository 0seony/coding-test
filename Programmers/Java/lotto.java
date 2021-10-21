import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        //당첨 가능한 최고 순위
        int max_count = 0;
        for(int i=0; i<lottos.length; i++ ) {
            if(lottos[i]==0) {
                max_count++;
            }
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i]==win_nums[j]) {
                        max_count++;
                    }
                }
            }
        //아무 숫자도 맞추지 못한 경우
        if(max_count==0){
            max_count = 1;
        }

        //당첨 가능한 최저 순위
        int min_count = 0;
        for(int i=0; i<lottos.length; i++ ) {
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i]==win_nums[j]) {
                        min_count++;
                    }
                }
            }
        //아무 숫자도 맞추지 못한 경우
        if(min_count==0){
            min_count = 1;
        }



        //answer
        int[] answer = {7-max_count, 7-min_count};
        return answer;

    }

}