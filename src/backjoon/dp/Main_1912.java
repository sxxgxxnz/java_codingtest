package backjoon;

//동적계획법1
import java.io.*;
import java.util.*;
public class Main_1912 {
    static int[] arr;
    static Integer[] dp; // 메모이제이션 배열
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dp = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        dp[0] = arr[0];
        max = arr[0];

        dp(N-1);
        System.out.println(max);
    }

    static int dp(int n){
        if(dp[n]==null){
            // 이전 배열의 누적합 + 현재값과 현재값을 비교하여 max값을 dp[n]에 저장
            dp[n] = Math.max(dp(n-1)+arr[n],arr[n]);
            max = Math.max(dp[n],max);
        }
        return dp[n];

    }
}
