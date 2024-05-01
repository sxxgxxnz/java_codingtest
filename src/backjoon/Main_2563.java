package backjoon;

//2차배열
import java.io.*;
import java.util.*;

public class Main_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] a = new int[N][M];
        int[][] b = new int[N][M];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] ans = new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                ans[i][j] = a[i][j]+b[i][j];
                sb.append(ans[i][j]+" ");
                if(j==M-1){
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);

    }
}
