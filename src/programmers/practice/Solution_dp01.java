package practice;

// 동적계획법 - 정수 삼각형
public class Solution_dp01 {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        System.out.println(solution(triangle));
    }
    /*
    정확성: 64.3
    효율성: 35.7
     */
    static int solution(int[][] triangle) {
        int answer = 0;
        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];
        // 맨 왼쪽
        for(int i=1;i<triangle.length;i++){
            dp[i][0] = triangle[i][0] + dp[i-1][0];
        }
        //위에서부터 내려가며 최대값 구하기
        for(int i=1;i<triangle.length;i++){
            for(int j=1;j<triangle[i].length;j++){
                //왼쪽, 오른쪽 각각 더하여 구한 다음, 최대값 입력
                dp[i][j] = Math.max(dp[i-1][j-1] + triangle[i][j],dp[i-1][j] + triangle[i][j]);
            }
        }
        //가장 마지막에 저장된 값들 중 가장 큰 값 리턴
        for(int i=0;i<triangle.length;i++){
            answer = Math.max(dp[triangle.length-1][i],answer);
        }
        return answer;
    }
}
