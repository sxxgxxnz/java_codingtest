package backjoon;

// 조합론
import java.io.*;

public class Main_15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(N * (N-1));
    }
}
