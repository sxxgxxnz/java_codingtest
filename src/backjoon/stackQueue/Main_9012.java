package backjoon.stackQueue;

import java.io.*;
import java.util.*;

public class Main_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            String tmp = br.readLine();
            Stack<Character> stack = new Stack<>();

            for(int j=0;j<tmp.length();j++){
                if(tmp.charAt(j)=='(') stack.push(tmp.charAt(j));
                else{
                    if(stack.isEmpty()){
                        stack.push(tmp.charAt(j));
                        break;
                    }else stack.pop();
                }
            }
            if(stack.empty()) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
/* test
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(
 */