package backjoon;

//이분탐색
import java.io.*;
import java.util.*;

public class Main_1920 {
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        A = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            if(binarySearch(Integer.parseInt(st.nextToken()))>=0){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int key){
        int start = 0;
        int end = A.length-1;

        while(start <= end){
            int mid = (start + end) /2;
            if(key < A[mid]){
                end = mid -1;
            }else if(key > A[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
