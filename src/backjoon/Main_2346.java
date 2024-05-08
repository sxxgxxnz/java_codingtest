package backjoon;

import java.io.*;
import java.util.*;

public class Main_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<int[]> dq = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 각 N번 풍선에 종이숫자 arr배열에 입력
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("1 "); // 첫번째 풍선부터 시작
        int num = arr[0]; // 첫번째 풍선안에 있는 종이 숫자

        // 덱에 풍선 idx와 종이숫자를 배열 형식으로 add
        for(int i=1;i<N;i++){
            dq.add(new int[] {(i+1),arr[i]}); // {풍선 idx, 종이숫자}
        }

        //num = 종이숫자
        while(!dq.isEmpty()){
            //종이 숫자 양수
            if(num > 0){
                for(int i=1;i<num;i++){
                    dq.add(dq.poll());
                }

                int[] next = dq.poll();
                num = next[1];
                sb.append(next[0]+" ");
            }else{ // 음수
                for(int i=1;i<-num;i++){
                    dq.addFirst(dq.pollLast());
                }

                int[] next = dq.pollLast();
                num = next[1];
                sb.append(next[0]+" ");

            }
        }

        System.out.println(sb);
    }
}
