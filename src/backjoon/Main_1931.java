package backjoon;

//그리디
import java.io.*;
import java.util.*;

public class Main_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int cnt = 0;

        int[][] time = new int[N][2];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken()); //시작시간
            time[i][1] = Integer.parseInt(st.nextToken());  //종료시간
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 종료시간이 같을 경우 시작시간이 빠른 순으로 정렬
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });

        int prev = 0;
        for(int i=0;i<N;i++){
            // 직전 종료시간이 다음 시작시간보다 작으면 업데이트
            if(prev <= time[i][0]){
                prev = time[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
