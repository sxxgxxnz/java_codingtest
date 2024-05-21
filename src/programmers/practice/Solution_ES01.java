package practice;

// 프로그래머스 - 피로도(완전 탐색)
// 백트래킹 풀이
import java.util.*;

public class Solution_ES01 {
    static boolean[] visited;
    static int cnt = 0;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        System.out.println(solution(k,dungeons));
    }
    static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0,k,dungeons);
        return cnt;
    }
    static void dfs(int depth, int k,int[][] dungeons){
        for(int i=0;i<dungeons.length;i++){
            if(visited[i] || dungeons[i][0] > k){
                continue;
            }
            visited[i] = true; // 방문
            dfs(depth+1,k - dungeons[i][1],dungeons); // 다음 던전 탐험 재귀
            visited[i] = false; // 방문 X
        }
        cnt = Math.max(cnt,depth);
    }
}
