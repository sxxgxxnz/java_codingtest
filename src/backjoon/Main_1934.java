package backjoon;

//최소공배수 - 유클리드 호제, 최대공약수를 활용
import java.io.*;
import java.util.*;

public class Main_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int d = gcd(a,b);
            sb.append(a*b/d).append("\n");
        }
        System.out.println(sb);
    }
    //최대공약수
    static int gcd(int a, int b){
        while(b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
