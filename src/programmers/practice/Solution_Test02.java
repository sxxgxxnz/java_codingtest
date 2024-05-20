package practice;

import java.util.*;

// 프로그래머스 - 연속 부분 수열 합의 개수
public class Solution_Test02 {
    public static void main(String[] args) {
        int[] elements = {7,9,1,1,4};

        System.out.println(solution(elements));
    }
    static int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for(int i=1;i<=elements.length;i++){
            for(int j=0;j<elements.length;j++){
                int sum = 0;
                for(int k=j;k<i+j;k++){
                    // elements.length % elements.length = 0 이 나옴
                    // 첫 번째 요소에 접근할 수 있어 원형 수열을 표현할 수 있음
                    sum+=elements[k%elements.length];
                }
                set.add(sum);
            }


        }
        return set.size();
    }
}
