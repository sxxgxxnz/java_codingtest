package backjoon.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_4949 {
    /* 런타임 에러
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String s = br.readLine();
            if(s.equals(".")) break;

            Stack<Character> stack = new Stack<>();

            for(int i=0;i< s.length();i++){
                char c = s.charAt(i);
                if(c == '(' || c == '[') stack.push(c);
                else if(c == ')') {
                    if (stack.peek()=='(') {
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        stack.push(c);
                        break;
                    }
                    else break;
                }else if(c == ']') {
                    if(stack.peek()=='[') {
                        stack.pop();
                    }
                    if(stack.isEmpty()) {
                        stack.push(c);
                        break;
                    }
                    else break;
                }
            }
            if(stack.empty()) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }

     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true) {
            Stack<Character> st = new Stack<>();
            String ss = br.readLine();

            if(ss.equals(".")) {
                break;
            }

            for(int i=0; i<ss.length(); i++) {

                char c = ss.charAt(i);

                if(c == '[' || c == '(') {
                    st.push(c);
                }

                if(c == ']') {
                    if(st.isEmpty()) {
                        st.push(c);
                        break;
                    }

                    if(st.peek() == '[') {
                        st.pop();
                    }

                    else break;
                }

                if(c == ')') {

                    if(st.isEmpty()) {
                        st.push(c);
                        break;
                    }

                    if(st.peek() == '(') {
                        st.pop();
                    }
                    else break;
                }
            }

            if(st.isEmpty()) {
                sb.append("yes\n");
            }

            else {
                sb.append("no\n");
            }


        }
        System.out.println(sb);

    }
}
