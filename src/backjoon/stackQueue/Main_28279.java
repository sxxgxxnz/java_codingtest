package backjoon.stackQueue;

import java.io.*;
import java.util.*;

public class Main_28279 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("1")){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }else if(cmd.equals("2")){
                deque.addLast(Integer.parseInt(st.nextToken()));
            }else if(cmd.equals("3")){
                if(!deque.isEmpty()){
                    sb.append(deque.pollFirst()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(cmd.equals("4")){
                if(!deque.isEmpty()){
                    sb.append(deque.pollLast()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(cmd.equals("5")){
                sb.append(deque.size()).append("\n");
            }else if(cmd.equals("6")){
                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(cmd.equals("7")){
                if(!deque.isEmpty()){
                    sb.append(deque.peekFirst()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(cmd.equals("8")){
                if(!deque.isEmpty()){
                    sb.append(deque.peekLast()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }
        }
        br.close();
        System.out.println(sb.toString());

    }
}
