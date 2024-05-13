package backjoon;

//동적계획법 1션, 메모이제이션
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1904 {
    static int N;
    static int[] tile;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        tile = new int[N+1];
        System.out.print(fibonacci(N));

    }
    public static int fibonacci(int N){
        if(tile[N]!=0) return tile[N];

        if(N==1){
            return 1;
        }else if(N==2){
            return 2;
        }else if(N > 2){
            return tile[N] = (fibonacci(N-1)+fibonacci(N-2))%15746;
        }else return N;
    }
}
