package backjoon.dp;

//DP
import java.io.*;
import java.util.*;

public class Main_2579 {
    /* top-down 재귀
    static int[] arr;
    static Integer[] dp;
    static int dp(int N){
        if(dp[N] == null)
        {
            dp[N] = Math.max(dp(N-2),dp(N-3) + arr[N-1]) + arr[N];
        }
        return dp[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N+1];
        dp = new Integer[N+1];

        for(int i=1;i<=N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 재귀 dp는 int[] 배열이 아닌 Integer[] 객체 배열을 쓸 것이다.
        dp[0]=arr[0];
        dp[1]=arr[1];

        //N이 1이 입력될 수 있기 때문에 예외처리를 해준다.
        if(N>=2){
            dp[2] = arr[1] + arr[2];
        }
        System.out.println(dp(N));
        }
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

         //bottom-up 반복문

        int[] DP = new int[N+1];
        int[] arr = new int[N+1];

        for(int i=1;i<=N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        // index = 0은 시작점이다.
        DP[0]=arr[0];
        DP[1]=arr[1];

        //N이 1일수도 있기 때문에 예외처리
        if(N>1){
            DP[2] = arr[1] + arr[2];
        }
        for(int i=3;i<=N;i++){
            DP[i] = Math.max(DP[i-2],DP[i-3]+arr[i-1])+arr[i];
        }
        System.out.println(DP[N]);


    }


}
