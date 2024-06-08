package practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_greedy02 {
    public static void main(String[] args) {
        String number = "1924";
        int k = 2;
        System.out.println(solution(number,k));
    }
    static String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] arr = number.toCharArray();
        int len = arr.length - k;

        //문자 비교를 시작하는 인덱스를 나타내는 start 변수
        int idx = 0;
        for(int i=0;i<len;i++){
            char max = '0';
            for(int j=idx;j<=i+k;j++){
                // 가장 큰 수를 골라서 그 다음 인덱스를 시작 인덱스로 설정
                if(arr[j] > max){
                    max = arr[j];
                    idx = j+1;
                }
            }
            sb.append(Character.toString(max));
        }
        answer = sb.toString();
        return answer;
    }
}
/*
아래 링크 설명 잘 되어있음
https://hyojun.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%81%B0-%EC%88%98-%EB%A7%8C%EB%93%A4%EA%B8%B0-Java#google_vignette
 */

