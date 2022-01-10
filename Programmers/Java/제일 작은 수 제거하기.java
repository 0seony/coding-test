class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int index = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        for(int i=index; i<arr.length-1; i++){
            arr[i] = arr[i+1];
            arr[i+1] = min;
        }

        int[] answer;
        if(arr.length != 1){
            answer = new int[arr.length-1];
            System.arraycopy(arr,0,answer,0,arr.length-1);
            }else{
            answer = new int[] {-1};
        }
           return answer; 
        }
    }
