package practice;

// 프로그래머스 - 의상(해시)
import java.util.*;

public class Solution_hash01 {
    public static void main(String[] args) {
        //String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(clothes));
    }
    static int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> map = new HashMap<>();
        //int cnt = 0;
        for(int i=0;i<clothes.length;i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
       // System.out.println(map);
        // 조합 -> 안 입는 경우를 위해 +1
        for(String key : map.keySet()){
            answer*=(map.get(key)+1);
        }
        // '모두' 안 입을 경우 -1
        answer-=1;
        return answer;
    }
}
