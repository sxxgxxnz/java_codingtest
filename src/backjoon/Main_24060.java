package backjoon;

import java.io.*;
import java.util.*;

public class Main_24060 {
    static int answer = -1;
    static int K;
    static int cnt = 0; // 저장 횟수 누적카운트
    static int[] tmp;
    //오름차순 정렬
    static void merge_sort(int[] arr, int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            merge_sort(arr,start,mid);
            merge_sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    static void merge(int[] arr, int start, int mid, int end){
        int i = start;
        int j= mid + 1;
        int t = 0;

        while(i<=mid && j <=end){
            if(arr[i] <= arr[j]){
                tmp[t++] = arr[i++];
            }else{
                tmp[t++] = arr[j++];
            }
        }
        while(i<=mid)
            tmp[t++] = arr [i++];
        while(j<=end)
            tmp[t++] = arr[j++];

        i=start;
        t=0;
        while(i<=end){
            cnt++;
            if(cnt==K){
                answer = tmp[t];
                break;
            }
            arr[i++] = tmp[t++];
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        tmp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        merge_sort(arr,0,N-1);

        System.out.println(answer);
    }
}
