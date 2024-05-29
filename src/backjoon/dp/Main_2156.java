package backjoon.dp;

import java.io.*;

public class Main_2156 {
    //top-down
    static Integer[] dp;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        dp = new Integer[n+1];

        // 포도주의 양 배열로 초기화
        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = arr[0];
        dp[1] = arr[1];

        //N이 1이 입력될 수 있기 때문에 예외처리를 해준다.
        if(n>1){
            dp[2] = arr[1] + arr[2];
        }
        System.out.println(recur(n));
    }
    static int recur(int n){
        // 계단오르기 문제(2579)와 다르게 마지막 노드를 무조건 방문해야 한다는 조건이 없음
        // 그래서 n-1번째의 누적합과의 비교를 통해 max값을 갱신하는 방식이 추가됨
        if(dp[n] == null){
            dp[n] = Math.max(Math.max(recur(n-2),recur(n-3)+arr[n-1]) + arr[n], recur(n-1));
        }
        return dp[n];
    }

    /* bottom-up
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        if(n>1){
            dp[2] = arr[1] + arr[2];
        }

        for(int i=3;i<=n;i++){
            dp[i] = Math.max(dp[i-1],Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
        }

        System.out.println(dp[n]);

    }

     */
}
