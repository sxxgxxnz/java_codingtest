package backjoon;

import java.io.*;
import java.util.*;
public class Main_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        LinkedList<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push")){
                queue.add(Integer.parseInt(st.nextToken()));
            }else if(cmd.equals("pop")){
                if(!queue.isEmpty()){
                    sb.append(queue.poll()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(cmd.equals("size")){
                sb.append(queue.size()).append("\n");
            }else if(cmd.equals("empty")){
                if(queue.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(cmd.equals("front")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(queue.peek()).append("\n");
                }
            }else if(cmd.equals("back")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(queue.getLast()).append("\n");
                }
            }

        }
        br.close();
        System.out.println(sb.toString());
    }
}
