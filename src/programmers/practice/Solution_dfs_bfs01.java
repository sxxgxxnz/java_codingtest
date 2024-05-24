package practice;

//프로그래머스 - dfs/bfs (게임 맵 최단거리)
import java.util.*;

public class Solution_dfs_bfs01 {
    // 좌 우
    static int[] mrow = {0,1,-1,0};
    // 상 하
    static int[] mcol = {1,0,0,-1};

    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int[][] test2 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        System.out.println(solution(maps));
        System.out.println(solution(test2));
    }
    static int solution(int[][] maps) {
        int[][] visited = new int[maps.length][maps[0].length];
        bfs(maps, visited);
        int answer = visited[maps.length-1][maps[0].length-1];

        // 상대팀 진영에 도착할 수 없는 경우 -1 리턴
        if(answer == 0){
            answer = -1;
        }
        return answer;
    }
    static void bfs(int[][] maps, int[][] visited){
        // 현재 위치의 좌표를 찾기 위해 배열 큐를 생성
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visited[0][0] = 1; // 현재 위치

        while(!queue.isEmpty()){
            // 현재 좌표 추출 (정점 뽑기)
            int cur[] = queue.poll();

            int x = cur[0];
            int y = cur[1];
            //System.out.println("x : "+x+" y : "+y);

            //상하좌우 검사
            for(int i=0;i<4;i++){
                int cx = x + mrow[i];
                int cy = y + mcol[i];

                //좌표가 maps에서 벗어나면 다음 for문으로 이동
                if(cx < 0 || cx > maps.length -1 || cy < 0 || cy > maps[0].length - 1) continue;

                // 방문하지 않았고, 1인 경우
                if(visited[cx][cy] == 0 && maps[cx][cy] > 0){
                    //거리 계산
                    visited[cx][cy] = visited[x][y] + 1;
                    queue.add(new int[]{cx,cy});
                }
            }
        }

    }
}
