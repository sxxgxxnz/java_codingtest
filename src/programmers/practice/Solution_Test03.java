package practice;

import java.sql.SQLOutput;
import java.util.Arrays;

// 프로그래머스 - 행렬의 곱셈
public class Solution_Test03 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        System.out.println(solution(arr1, arr2));
    }
    // 내가 푼 풀이 -> 런타임 에러가 남
    static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2.length];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                int tmp = 0;
                for(int k=0;k<arr2.length;k++){
                    tmp += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = tmp;
            }
        }


        return answer;
    }
    // 계산하는 반복문 크기를 arr1의 길이로 변경
    // answer 초기화 하는 부분에서 Arr2의 행의 크기와 arr1의 열의 크기를 동일하게 선언해줌
    static int[][] solution2(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                //int tmp = 0;
                for(int k=0;k<arr1[0].length;k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
                //answer[i][j] = tmp;
            }
        }


        return answer;
    }
}
