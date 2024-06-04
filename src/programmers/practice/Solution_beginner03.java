package practice;

import java.util.*;

// 최빈값 구하기
public class Solution_beginner03 {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,4};
        System.out.println(solution(array));
    }
    static int solution(int[] array) {
        int answer = 0;
        int maxCnt = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : array){
            int cnt = map.getOrDefault(num,0) +1;
            if(cnt > maxCnt){
                maxCnt = cnt;
                answer = num;
            }else if(cnt == maxCnt){
                answer = -1;
            }
            map.put(num,cnt);
        }
        return answer;
    }
}
