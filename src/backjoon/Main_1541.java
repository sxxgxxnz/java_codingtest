package backjoon;

//그리디
import java.io.*;
import java.util.*;

public class Main_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 뺄셈 기준으로 토큰 분리
        StringTokenizer sub = new StringTokenizer(br.readLine(),"-");
        int sum = Integer.MAX_VALUE; // 초기 값 확인 여부를 위한 값으로 입력

        while(sub.hasMoreTokens()){
            int tmp = 0;
            // 뺄셈으로 나뉜 토큰을 덧셈으로 나누기 위해 분리
            StringTokenizer add = new StringTokenizer(sub.nextToken(),"+");

            // 덧셈
            while(add.hasMoreTokens()){
                tmp += Integer.parseInt(add.nextToken());
            }

            // 토큰이 첫번째인경우 tmp값을
            if(sum == Integer.MAX_VALUE){
                sum = tmp;
            }else{
                sum -= tmp;
            }
        }
        System.out.println(sum);

    }
}
