package practice;

import java.util.*;

public class Solution_stackqueue03 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};

        System.out.println(solution(prices).toString());
    }
    static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();

        for(int price : prices){
            queue.add(price);
        }
        int idx = 0;
       while (!queue.isEmpty()){
           int cur = queue.poll();
           for(int i= prices.length - queue.size();i<prices.length;i++){
               if(cur > prices[i]){ // 가격이 떨어진 경우
                   answer[idx]++;
                   break;
               }else if(cur <= prices[i]){ //가격이 떨어지지 않은 경우
                    answer[idx]++;
               }
           }
           idx++;
       }

        return answer;
    }
}

