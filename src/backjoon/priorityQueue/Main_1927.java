package backjoon.priorityQueue;

// 오름차옴
import java.io.*;
import java.util.*;

public class Main_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
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
