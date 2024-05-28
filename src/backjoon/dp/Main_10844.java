package backjoon.dp;

import java.io.*;

public class Main_10844 {
    static Long[][] dp;
    static int n;
    final static long MOD = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new Long[n+1][10];

        //초기 값 설정
        //길이가 1일때의 계단수의 개수만 설정
        for(int i=0;i<10;i++){
            dp[1][i] = 1L;
        }

        for(int i=2;i<=n;i++){
            // 0으로 시작하는 수의 개수
            dp[i][0] = dp[i-1][1];
            for(int j=1;j<=9;j++){
                // 9일 경우는 이전 자릿수의 8로 시작하는 수의 개수와 동일
                if(j==9)
                    dp[i][9] = dp[i-1][8] % MOD;
                //나머지 수들은 이전 숫자의 j-1로 시작하는 수의 개수와 j+1로 시작하는 수의 개수를 더한 값이다.
                else
                    dp[i][j] = (dp[i-1][j-1] % MOD + dp[i-1][j+1] % MOD) % MOD;
            }
        }
        long result = 0;

        for(int i=1;i<=9;i++){
            result = (result + dp[n][i]) % MOD;
        }
        System.out.println(result);

    }

}
