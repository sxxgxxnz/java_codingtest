package backjoon;

// 동적계획법으로 푼 이항계수 -> 팩토리얼 성질로 풀어도됨
import java.io.*;
import java.util.StringTokenizer;

public class Main_11050 {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new int[N+1][K+1];
        System.out.println(bc(N,K));
    }
    static int bc(int n, int k){
        if(dp[n][k]>0){
            return dp[n][k];
        }
        if(n == k || k < 1){
            return 1;
        }
        return bc(n-1, k-1) + bc(n-1,k);
    }
}
