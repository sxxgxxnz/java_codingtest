package backjoon;

import java.io.*;

public class Main_1436 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // n번째 영화

        int number = 666;
        int cnt = 1;

        while(cnt < n){
            number++; // 667, 668, 669,,,1666
            System.out.println(number);
            if(String.valueOf(number).contains("666")){
                cnt++;
            }
            System.out.println(cnt);
        }
        System.out.println(number);
    }
}
