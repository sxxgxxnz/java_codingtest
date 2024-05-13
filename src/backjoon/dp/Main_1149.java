package backjoon;

// 동적 계획법 1
import java.io.*;
import java.util.*;

public class Main_1149 {

    static int[][] cost;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        cost = new int[N][3];
        dp = new int[N][3];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                cost[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = cost[0][0]; // 빨강
        dp[0][1] = cost[0][1]; // 초록
        dp[0][2] = cost[0][2]; // 파랑

        System.out.println(Math.min(dp(N-1,0),Math.min(dp(N-1,1), dp(N-1,2))));
    }

    static int dp(int a,int b){
        if(dp[a][b]==0){
            if(b == 0) {// 빨강
                dp[a][0] = Math.min(dp(a-1,1),dp(a-1,2)) + cost[a][0];
            }else if(b == 1){//초록
                dp[a][1] = Math.min(dp(a-1,0),dp(a-1,2)) + cost[a][1];
            }else{ // 파랑
                dp[a][2] = Math.min(dp(a-1,0),dp(a-1,1)) + cost[a][2];
            }
        }
        return dp[a][b];
    }
}
