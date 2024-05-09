package backjoon;

//그리디
// 알고리즘 계산 방식을 더 단순하게 할 수 있음.
import java.io.*;
import java.util.*;

public class Main_11399 {
    public static void main(String[] args) throws IOException {
        /*
        내가 푼 방식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] time = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;

        for(int i=0;i<N;i++){
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);
        int prev = time[0];
        for(int i=1;i<N;i++){
            sum = prev + time[i];
            time[i] = sum;
            prev = sum;
        }
        int result = 0;
        for(int i=0;i<N;i++){
            result += time[i];
        }
        System.out.println(result);

         */
        /*
        Counting sort를 사용한 풀이
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] time = new int[1001];

        /*
        Counting sort -> 시간복잡가 훨씬 효율적임
         */
        while (N-- > 0){
            time[Integer.parseInt(st.nextToken())]++;
        }
        int prev = 0; // 이전까지의 대기 시간 누적
        int sum = 0;    //사람별 대기시간 총합
        for(int i=0;i<1001;i++){
            // i가 0이 될때까지 반복
            while(time[i]-->0){
                //이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다
                sum+=(i+prev);
                //이전까지의 누적합에 현재 걸리는 시간을 더해준다
                prev+=i;
            }
        }
        System.out.println(sum);
    }

}
