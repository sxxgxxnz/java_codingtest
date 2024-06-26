package backjoon.dp;

//DP
import java.io.*;
import java.util.*;

public class Main_1932 {
    static int[][] arr;
    static Integer[][] dp; // 메모이제이션 배열
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N =Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new Integer[N][N];
        StringTokenizer st;

        for(int i=0;i<N;i++){
           st = new StringTokenizer(br.readLine());
           for(int j=0;j<i+1;j++){
               arr[i][j] = Integer.parseInt(st.nextToken());
           }
        }
        for(int i=0;i<N;i++){
            dp[N-1][i] = arr[N-1][i];
        }
        System.out.println(dp(0,0));
    }
    static int dp(int depth, int idx){
        if(depth == N-1) return dp[depth][idx];

        if(dp[depth][idx] == null){
            dp[depth][idx] = Math.max(dp(depth+1,idx),dp(depth+1,idx+1)) + arr[depth][idx];
            //System.out.println(dp[depth][idx]);
        }
        return dp[depth][idx];
    }
}
