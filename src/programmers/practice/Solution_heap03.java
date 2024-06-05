package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_heap03 {
    public static void main(String[] args) {
        int[][] jobs = {{0,3},{1,9},{2,6}};
        System.out.println(solution(jobs));
    }
    static int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        // 1. 요청 시간 기준 정렬
        Arrays.sort(jobs, Comparator.comparing(o1 -> o1[0]));

        int idx = 0; // 배열 인덱스
        int cnt = 0; // 요청 수행 횟수
        int time = 0; // 총 소요시간
        int end = 0; // 소요 시간

        while(cnt < jobs.length){
            // 2. 현재 시간보다 작거나 같은 요청을 pq에 추가
            while(idx < jobs.length && jobs[idx][0] <= end){
                pq.add(jobs[idx++]);
            }

            // 3. 큐에 작업이 없다면 요청 시간이 가장 빠른 job추가
            if(pq.isEmpty()){
                end = jobs[idx][0];
            }
            // 4. 작업이 있다면 작업 소요 시간이 가장 빠른 작업 수행
            else{
                int[] cur = pq.poll();
                time += cur[1] + end - cur[0];
                end += cur[1];
                cnt++;
            }
        }
        answer = time / jobs.length;
        return answer;
    }
}
