package backjoon;
// 백트래킹
import java.io.*;
import java.util.*;

public class Main_15649 {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static boolean[] visit;
    static int[] arr;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visit = new boolean[N];
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

        for(int i=0;i<N;i++){
            // 해당 노드에 방문하지 않았을 경우
            if(!visit[i]){
                visit[i]=true;
                arr[depth] = i+1; // 깊이를 인덱스로 하여 i+1값 저장
                dfs(depth+1); // 다음 자식 노드 방문을 위해 +1 하여 재귀 호출
                visit[i] = false;
            }
        }
    }
}
