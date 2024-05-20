package practice;

// 연습문제 - 귤 고르기
import java.util.*;
import java.io.*;

public class Solution_Test01 {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1,3,2,5,4,5,2,3};
        System.out.println(solution(k,tangerine));
    }
    static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : tangerine){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // key 기준으로 내림차순
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

        for(Integer key : list){
            // key(=귤의 종류)를 통해 찾은
            // value(=귤의 개수)를 k에서 뺌 -> 최솟값을 빠르게 찾을 수 있음
            k-= map.get(key);
            answer++;

            if(k<=0){
                break;
            }
        }
        return answer;
    }
}
