package practice;
import java.util.*;

public class Solution_beginner08 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int k= 5;
        System.out.println(solution(numbers,k));
    }
        static int solution(int[] numbers, int k) {
            int result = 0;
            Queue<Integer> queue = new LinkedList<>();
            for(int i=0;i<numbers.length;i++){
                queue.add(numbers[i]);
            }
            //첫 번째
            result = queue.poll();

            for(int i=1;i<k;i++){
                queue.add(result);
                queue.add(queue.poll());
                result = queue.poll();
            }
            return result;
        }

}
