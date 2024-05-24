package practice;

// 프로그래머스 - 이중우선순위큐(힙)
import java.util.*;

public class Solution_heap01 {
    public static void main(String[] args) {
        // 테스트 1
        //String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};

        //테스트2
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(solution(operations).toString());
    }
    static int[] solution(String[] operations) {
        int[] answer = new int[2];
        // 오름차순 (최솟값 우선)
        PriorityQueue<Integer> min = new PriorityQueue<>();
        // 내림차순 (최댓값 우선)
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<operations.length;i++){
            String str = operations[i];
            String cmd = str.substring(0,1);
            String num = str.substring(2);
            if(cmd.equals("I")){
                min.add(Integer.parseInt(num));
                max.add(Integer.parseInt(num));
            }
            else if(cmd.equals("D") && !max.isEmpty()){
                if(num.equals("1")){
                    int tmp = max.poll();
                    min.remove(tmp);
                }
                if(num.equals("-1")){
                    int tmp = min.poll();
                    max.remove(tmp);
                }
            }
        }
        if(max.isEmpty()){
            return new int[] {0,0};
        }

        return new int[] {max.peek(), min.peek()};
    }
}
