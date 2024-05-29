package backjoon.stackQueue;

import java.io.*;
import java.util.*;

public class Main_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("1")){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if(cmd.equals("2")){
                if(!stack.isEmpty()){
                    sb.append(stack.lastElement()).append("\n");
                    stack.pop();
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(cmd.equals("3")){
                    sb.append(stack.size()).append("\n");
            }else if(cmd.equals("4")){
                if(stack.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(cmd.equals("5")){
                if(!stack.isEmpty()) {
                    sb.append(stack.lastElement()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }
        }
        br.close();
        System.out.println(sb);
    }
}
