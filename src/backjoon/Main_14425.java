package backjoon;

import java.util.*;
import java.io.*;

public class Main_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<N;i++){
            map.put(br.readLine(),0);
        }
        for(int i=0;i<M;i++){
            if(map.containsKey(br.readLine()))
                cnt++;
        }
        System.out.println(cnt);
    }
}
