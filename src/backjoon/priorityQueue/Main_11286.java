package backjoon.priorityQueue;

// 절댓값
import java.io.*;
import java.util.*;

public class Main_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) > Math.abs(o2)){ // 절댓값 기준으로 o1이 더 크다면 자리를 바꿔준다.
                    return Math.abs(o1) - Math.abs(o2);

                }else if(Math.abs(o1) == Math.abs(o2)){ // 절댓값 기준으로 두 값이 같다면 음수를 앞으로 보내준다.
                    return o1 - o2;
                }else{
                    return -1;
                }
            }
        });
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
