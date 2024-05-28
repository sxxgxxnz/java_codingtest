package backjoon.dp;

import java.io.*;
/*
1. 정수 x를 입력 받음
2. 메모이제이션 dp 배열 생성
3. 최소 연산 횟수가 나오는 규칙이 없기 때문에 x에서 가능한 모든 연산과정을 수행해야함
--- top-down ---
4. 6으로 나눠 지는 경우(3과 2로 나누어 떨어지는 경우)
  4-1. 3으로 나누는 경우
  4-2. 2로 나누는 경우
  4-3. 1을 빼는 경우
5. 3으로만 나눠지는 경우
  5-1. 3으로 나누는 경우
  5-2. 1을 빼는 경우
6. 2로만 나눠지는 경우
  6-1. 2로 나누는 경우
  6-2. 1을 뺴는 경우
7. 3이나 2로 나눠지지 않는 경우
  7-1. 1을 빼는경우
--- bottom-up ---
*연산 최소 값을 계산과 동시에 갱신하여 값을 도출해냄
N의 첫번째 연산이
1) -1인경우
2) /2인경우
3) /3인 경우
의 값을 구하여 최솟값을 구한다.
ex) N=6일때, 6-1의 값을 1로 만들기 위한 최소연산횟수(dp[5]) + 1 = 4
6/2의 값을 1로 만들기 위한 dp[2] + 1 = 2
6/3의 값을 1로 만들기 위한 dp[3] + 1 = 2
을 구하여 6을 1로 만들기 위한 최소 연산 횟수는 2임을 알 수 있음.
 */
public class Main_1463 {
    /*
    bottom - up
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] dp = new int[x+1];

        for(int i=2;i<=x;i++){
            //-1인 경우
            dp[i] = dp[i-1] + 1;
            //2로 나누어 떨어지는 경우
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i],dp[i/2]+1);
            }
            //3으로 나누어 떨어지는 경우
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i],dp[i/3]+1);
            }
        }
        System.out.println(dp[x]);
    }
    /*
    top-down
     */
    /*
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        dp = new Integer[x+1];
        dp[0] = dp[1] = 0;

        System.out.println(dp(x));

    }

    static int dp(int n) {
        if(dp[n] == null){
            if(n % 6 == 0){
                dp[n] = Math.min(dp(n-1),Math.min(dp(n/3),dp(n/2)));
            }
            else if(n % 3 == 0){
                dp[n] = Math.min(dp(n/3),dp(n-1)) + 1;
            }
            else if(n % 2 == 0){
                dp[n] = Math.min(dp(n/2),dp(n-1)) + 1;
            }
            else{
                dp[n] = dp(n-1) + 1;
            }
        }
        return dp[n];
    }

     */
}