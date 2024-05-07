package backjoon;

import java.io.*;
import java.math.BigInteger;

public class Main_24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //Math.pow는 실패라고 뜸
        System.out.println(BigInteger.valueOf(1).shiftLeft(N));
    }
}
