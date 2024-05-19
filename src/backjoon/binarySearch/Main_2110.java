package backjoon.binarySearch;

//이분탐색 - 공유기설치
import java.io.*;
import java.util.*;

public class Main_2110 {
    static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int lo = 1; // 최소 거리가 가질 수 있는 최솟값
        int hi = arr[N-1] - arr[0] + 1; //최소 거리가 가질 수 있는 최댓값

        while(lo < hi){ // upper bound
            int mid = (lo + hi) /2;
            /*
            mid 거리에 대해 설치 가능한 공유기 개수가 C에 못 미치면
            거리를 좁혀야 하기 때문에 hi 값을 줄인다.
             */
            if(installable(mid) < C){
                hi = mid;
            }else{
                /*
                설치 가능한 공유기 갯수가 C보다 크거나 같으면
                거리를 벌리면서 최소 거리가 가질 수 있는 최대 거리를 찾아낸다.
                 */
                lo = mid + 1;
            }
        }
        // upper bound는 탐색 값을 초과하는 첫번째 값을 가리키므로,
        // 1을 빼준 값이 조건식을 만족하는 최댓값이 된다.
        System.out.println(lo - 1);
    }

    static int installable(int dis){
        int cnt = 1;
        int last = arr[0];

        for(int i=1;i<arr.length;i++){
            int locate = arr[i];
            /*
            현재 탐색하는 집의 위치와 직전에 설치했던 집의 위치간 거리가
            최소 거리(dis)보다 크거나 같을 때 공유기 설치 개수를 늘려주고
            마지막 설치 위치를 갱신한다.
             */
            if(locate - last >= dis){
                cnt++;
                last = locate;
            }
        }
        return cnt;
    }

}
