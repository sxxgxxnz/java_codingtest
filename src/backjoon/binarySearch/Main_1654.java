package backjoon.binarySearch;

// 이분탐색 - 랜선자르기
import java.io.*;
import java.util.*;

public class Main_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long min = 0;
        long max = 0;

        int[] lan = new int[K];
        for(int i=0;i<K;i++){
            lan[i] = Integer.parseInt(br.readLine());

            if(max < lan[i]){
                max = lan[i];
            }
        }
        max++;
        while(min < max){
            long mid = (min + max) / 2;
            long cnt = 0;

            for(int i=0;i<lan.length;i++){
                cnt += (lan[i] / mid );
            }

            if(cnt < N){
                max = mid;
            }else{
                min = mid + 1;
            }

        }
        System.out.println(min -1);
    }
}
