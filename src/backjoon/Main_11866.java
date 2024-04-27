package backjoon;

import java.util.*;

public class Main_11866 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for(int i=0;i<N;i++){
            queue.offer(i+1);
        }
        while(queue.size()!=1){
            int value = queue.poll();
            cnt++;
            if(cnt%K == 0){
                sb.append(value).append(", ");
            }else{
                queue.add(value);
            }
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
