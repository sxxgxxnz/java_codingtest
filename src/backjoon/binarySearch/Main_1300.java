package backjoon.binarySearch;

//이분 탐색 - K번째 수
import java.io.*;
import java.util.*;

public class Main_1300 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        // x는 lo <= x <= hi 범위에 있음
        long lo = 1;
        long hi = K;

        while(lo < hi) { // lower bound
            long mid = (lo + hi) / 2;
            long cnt = 0;

            for(int i=1;i<=N;i++){
                //System.out.println("mid: "+mid+" mid / "+i+" : " + mid / i+ " Math.min(mid / i,N) : "+Math.min(mid / i,N));
                cnt += Math.min(mid / i,N);
            }

            if(K <= cnt){
                hi = mid;
            }else{
                lo = mid + 1;
            }
        }
        System.out.println(lo);
    }
}
