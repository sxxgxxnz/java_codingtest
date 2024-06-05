package backjoon.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] cnt = new int[M];
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            int num = Integer.parseInt(st.nextToken());
            // 누적합하여 M으로 나눈 나머지를 인덱스 값
            // M으로 나누어 떨어지면 인덱스값이 0인 데이터 +1이 됨
            sum = (sum + num) % M;
            cnt[sum]++;
        }

        long count = cnt[0];
        for(int i=0;i<cnt.length;i++){
            // 조합으로 나머지가 0이 나오는 경우
            count+=(long)cnt[i] * (cnt[i]-1)/2;
        }
        System.out.println(count);
    }
}
