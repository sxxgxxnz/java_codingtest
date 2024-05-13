package backjoon;

//이분탐색
import java.io.*;
import java.util.*;

public class Main_10816 {

    /*
    HashMap 풀이
    public static void main(String[] args) throws IOException {
        HashMap<Integer,Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int key = Integer.parseInt(st.nextToken());

            //getOrDefault(key, defaultValue)
            //Key에 대해 map에 저장된 value를 반환,
            //value가 없는 경우 defaultValue값으로 반환

            map.put(key,map.getOrDefault(key,0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int key = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(key,0))
                    .append(" ");
        }
        System.out.println(sb);

    }
        */
    //이분탐색 풀이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(upperBound(arr, key) - lowerBound(arr,key)).append(" ");
        }
        System.out.println(sb);
    }

    private static int lowerBound(int[] arr, int key){
        int start = 0;
        int end = arr.length;

        while(start < end){
            int mid = (start + end) /2;

            if(key <= arr[mid]){
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }
    private static int upperBound(int[] arr, int key){
        int start = 0;
        int end = arr.length;

        while(start < end) {
            int mid = (start + end) / 2;

            if(key < arr[mid]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
