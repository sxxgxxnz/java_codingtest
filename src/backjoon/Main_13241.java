package backjoon;

import java.io.*;
import java.util.*;

public class Main_13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long d = gcd(a,b);
        System.out.println(a*b/d);
    }
    //최대공약수
    static long gcd(long a, long b){
        while(b!=0){
            long r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
