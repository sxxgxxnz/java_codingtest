package practice;

import java.util.PriorityQueue;

public class Solution_heap02 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        System.out.println(solution(scoville, K));
    }

    static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville) {
            pq.offer(i);
        }
        while (pq.peek() < K) { // K보다 작은 경우
            if(pq.size() == 1) return -1;
            pq.offer(pq.poll() + (pq.poll() * 2));
            answer++;
        }

        return answer;
    }
}
