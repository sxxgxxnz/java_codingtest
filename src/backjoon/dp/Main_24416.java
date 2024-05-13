package backjoon;
//동정계획법 - 피보나치
import java.io.*;

public class Main_24416 {
    static int code1 = 0;
    static int code2 = 0;
    static int[] f;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        f = new int[n];
        br.close();

        fib(n);
        fibonacci(n);

        System.out.println(code1+ " " +code2);
    }
    static int fib(int n){
        if(n == 1 || n == 2){
            code1++;
            return 1;
        }else{
            return (fib(n-1)+fib(n-2));
        }
    }
    static int fibonacci(int n){
        f[0] = 1;
        f[1] = 1;

        for(int i=2;i<n;i++){
            code2++;
            f[i]=f[i-1]+f[i-2];
        }
        return f[n-1];
    }
}
