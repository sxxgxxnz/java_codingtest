package backjoon.dp;

//LIS 구현 - dp
import java.io.*;
import java.util.*;

public class Main_11053 {
    /* top-down
    static Integer[] dp;
    static int[] seq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        seq = new int[n];
        dp = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++){
            lis(i);
        }

        int max = dp[0];
        for(int i=1;i<n;i++){
            max = Math.max(max,dp[i]);
        }

        System.out.println(max);
    }
    static int lis(int n){
        if(dp[n] == null){
            dp[n] = 1;
            for(int i=n-1;i>=0;i--){
                if(seq[i] < seq[n]){
                    dp[n] = Math.max(dp[n],lis(i)+1);
                }
            }
        }
        return dp[n];
    }

     */
    //bottom-up
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] seq = new int[n+1];
        int[] dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            seq[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        int max = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                if(seq[i] > seq[j])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
