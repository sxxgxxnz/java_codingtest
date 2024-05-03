package backjoon;

//동적계획법1, dp
import java.io.*;

//시간초과 -> 메모제이션 기법(long타입 배열 사용)
public class Main_9461 {
    static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            int k = Integer.parseInt(br.readLine());
            arr=new long[k];
            sb.append(P(k-1)).append("\n");
        }
        System.out.print(sb);
    }
    static long P(int n){
        if(arr[n]!=0) return arr[n];
        if(n<3){
            return arr[n]=1;
        }else
            return arr[n]=P(n-2)+P(n-3);

    }
}
