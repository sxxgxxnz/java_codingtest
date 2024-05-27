package backjoon.binarySearch;

// LIS 구현 - 증가 부분 수열
import java.io.*;
import java.util.*;

public class Main_12015 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] seq = new int[N];
        int[] LIS = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        LIS[0] = seq[0];
        int ans = 1;

        for(int i=1;i<N;i++){
            int num = seq[i];
            if(LIS[ans - 1] < num){
                ans++;
                LIS[ans - 1] = num;
            }else{
                //seq[i]보다 큰 가장 가까운 값을 찾기 위해
                //lower bound
                int lo = 0;
                int hi = ans;
                while(lo < hi){
                    int mid = (lo + hi) / 2;

                    if(LIS[mid] < num){
                        lo = mid + 1;
                    }
                    else{
                        hi = mid;
                    }
                }

                LIS[lo] = num;
            }
        }
        System.out.println(ans);
    }
}
