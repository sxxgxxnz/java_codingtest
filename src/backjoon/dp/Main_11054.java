package backjoon.dp;

// 바이토닉 부분 수열
import java.io.*;
import java.util.*;

public class Main_11054 {
    // 바이토닉 수열은 수열이 커졌다가 다시 줄어드는 수열을 말한다.
    // 전체 수열에서 증가 부분 수열 최장 길이 + 감소 부분 수열 최장 길이를 더한 후 중복 숫자를 뺀 값이 바이토닉 부분 수열의 최장 길이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] seq = new int[n + 1];
        // 증가 수열
        int[] dpAsc = new int[n + 1];
        // 감소 수열
        int[] dpDesc = new int[n + 1];

        // 각 배열 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            seq[i] = Integer.parseInt(st.nextToken());
            dpAsc[i] = 1;
            dpDesc[i] = 1;
        }

        //증가 부분 수열의 길이
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                if(seq[i]>seq[j]){
                    dpAsc[i] = Math.max(dpAsc[i],dpAsc[j]+1);
                }
            }
        }

        // 감소 부분 수열의 길이
        // n부터 시작하여 LIS 길이 구하는 방식으로 구하기
        for(int i=n;i>0;i--){
            for(int j=n;j>i;j--){
                if(seq[i] > seq[j]){
                    dpDesc[i] = Math.max(dpDesc[i],dpDesc[j]+1);
                }
            }
        }

        // 각 수열의 최장 길이
        int max = 0;
        for(int i=1;i<=n;i++){
            max = Math.max(max,dpDesc[i] + dpAsc[i]);
        }

        // 중복 숫자(=가장 큰 숫자)를 -1
        System.out.println(max -1);
    }
}
