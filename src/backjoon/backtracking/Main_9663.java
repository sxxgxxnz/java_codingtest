package backjoon.backtracking;

//동적계획법 - N-Queen
import java.io.*;
import java.util.*;

public class Main_9663 {
    static int[] arr;
    static int N;
    static int cnt=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        nQueen(0);
        System.out.println(cnt);

    }
    public static void nQueen(int depth){
        if(depth == N){
            cnt++;
            return;
        }
        for(int i=0;i<N;i++){
            arr[depth] = i;
            // possibility() : 해당 열에서 i번째 행에 놓을 수 있는지 검사하는 함수
            if(possibility(depth)){
                //System.out.println(depth +"열에서 "+i+"번째 행에 놓을 수 있음: "+Arrays.toString(arr));
                nQueen(depth+1);
            }
        }
    }
    // 놓을 위치가 다른 퀸으로부터 위협받는지를 검사하는 조건문
    public static boolean possibility(int col){
        for(int i=0;i<col;i++){
            if(arr[col] == arr[i]){ // 같은 행에 존재할경우
                System.out.println("같은 행에 존재할 경우 : "+ Arrays.toString(arr));
                return false;
            }
            //대각선상에 놓여있는 경우
            else if(Math.abs(col - i) == Math.abs(arr[col]-arr[i])){
                return false;
            }
        }
        return true;
    }
}
