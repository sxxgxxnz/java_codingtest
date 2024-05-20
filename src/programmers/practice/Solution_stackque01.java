package practice;

// 스택/큐 - 프로세스
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution_stackque01 {
    static int solution(int[] priorities, int location) {
        int answer = 0;
        // 우선순위 큐 내림차순
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        //우선 순위 큐에 우선순위 요소 추가
        for(int i=0;i<priorities.length;i++){

            queue.offer(priorities[i]);
        }

        //System.out.println(queue);
        while (!queue.isEmpty()){
            // 기존 우선순위 배열 순회
            for(int i=0;i<priorities.length;i++){
                // 현재 작업 위치 찾기
                //System.out.println("queue.peek(): "+queue.peek());
                if(queue.peek() == priorities[i]){
                    queue.poll();
                    answer++;

                    if(location == i){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        int[] priorities = {2,1,3,2};
        int location = 2;

        System.out.println(solution(priorities,location));
    }
}
