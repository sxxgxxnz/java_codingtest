package backjoon.binarySearch;
//이분탐색 - 나무 자르기
import java.io.*;
import java.util.*;

public class Main_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min = 0;
        int max = 0;

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());

            if(max < arr[i]){
                max = arr[i];
            }
        }

        while(min<max){ //upper bound
            //System.out.println(" min : "+ min + " / max : " + max);
            int mid = (min + max) / 2;
            long sum = 0;

            for(int height : arr ){
                if(height - mid > 0){
                    sum += (height - mid);
                }
            }
            if(sum < M ){
                max = mid;
            }else{
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}
