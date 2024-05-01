package backjoon;

//백트래킹
import java.io.*;
import java.util.*;

public class Main_15651 {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(0);
        System.out.println(sb);
    }
    private static void dfs(int depth){
        if(depth == M){
            for(int val : arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1;i<=N;i++){
                arr[depth] = i;
                dfs(depth+1);
            }
        }

}
