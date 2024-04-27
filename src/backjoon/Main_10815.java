package backjoon;

import java.util.*;
import java.io.*;

public class Main_10815 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        HashMap<String,Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N,M;
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            map.put(st.nextToken(),0); //key값만 사용하므로 value는 0
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            if(map.get(st.nextToken())!=null){
                sb.append("1").append(" ");
            }else{
                sb.append("0").append(" ");
            }
        }
        System.out.println(sb.toString());

    }
}
