package backjoon;

import java.io.*;
import java.util.*;

public class Main_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            aSet.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<b;i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }
        int cnt = 0;
        for(int i : aSet){
            if(!bSet.contains(i)){
                cnt++;
            }
        }
        for(int i : bSet){
            if(!aSet.contains(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
