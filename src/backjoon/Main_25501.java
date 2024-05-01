package backjoon;

//펠린드롬
import java.io.*;

public class Main_25501 {
    static int cnt;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            String str = br.readLine();
            cnt = 0;
            sb.append(isPalindrome(str)).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb);
    }
    public static int isPalindrome(String str){
        return recursion(str,0,str.length()-1);
    }
    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
}
