package backjoon.priorityQueue;

// 우선순위 큐 - 내림차순은 Collections.reverseOrder()를 불러옴
// 자바에서 제공하는 Queue 인터페이스의 구현 클래스를 사용한다.
import java.io.*;
import java.util.*;

public class Main_11279 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                pq.add(num);
            }else{
                if(pq.isEmpty()){
                    sb.append("0").append("\n");
                }else{
                    sb.append(pq.poll()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
