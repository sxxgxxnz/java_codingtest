package practice;

import java.util.PriorityQueue;

public class Solution_test {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(100);
        System.out.println(pq);
        pq.add(10);
        System.out.println(pq);
        pq.offer(1);
        System.out.println(pq);
        pq.add(50);

        System.out.println(pq);
    }
}
