package practice;

import java.util.*;

//프로그래머스 - N으로 표현(동적계획법)
public class Solution_dp02 {
    public static void main(String[] args) {
        int N = 5;
        int number = 12;

        System.out.println(solution(N,number));
    }
    //bottom-up 방식
    static int solution(int N, int number) {
        if(number == N) return 1;

        // 가능한 숫자들의 set을 담을 리스트를 초기화
        // 이 리스트는 N을 사용한 개수별로 만들 수 있는 숫자들의 집합을 저장한다.
        List<Set<Integer>> dp = new ArrayList<>();
        for(int i=0;i<=8;i++){
            dp.add(new HashSet<>());
        }
        // 숫자 N을 이용하여 만들 수 있는 숫자들 초기화
        // -> 숫자를 1개 쓸땐 자기 자신만 들어갈 수 있음
        dp.get(1).add(N);

        // 숫자를 더하거나 뺴는 연산을 적용하여 가능한 숫자들 생성
        for(int i=2;i<=8;i++){
            // 숫자를 i개 사용했을 때 나온 결과값들이 들어갈 set
            Set<Integer> total = dp.get(i);

            // 이전 인덱스부터 경우의 수 만들기
            for(int j=1;j<i;j++){
                // dp[j] 와 dp[i-j]에 저장된 숫자들을 이용하여 i에 해당하는 숫자를 만듬
                // 연산 결과를 dp[i](=total)에 저장
                Set<Integer> a = dp.get(j);
                Set<Integer> b = dp.get(i-j);

                // 숫자를 더하거나 뺴는 연산을 적용하여 가능한 숫자들 생성
                for(int x : a){
                    for(int y : b){
                        total.add(x+y);
                        total.add(x-y);
                        total.add(x*y);
                        if(x!=0 && y!=0)
                            total.add(x/y);
                    }
                }
                // N을 i번 사용하여 숫자 생성 -> total에 추가
                total.add(Integer.parseInt(String.valueOf(N).repeat(i)));
            }
            // number가 가능한 숫자들 중에 포함되는지 확인
            // number가 포함된다면 i 리턴
            if(total.contains(number)) return i;
        }
        // 최소값 8 이상이면 -1 리턴
        return -1;
    }
}
