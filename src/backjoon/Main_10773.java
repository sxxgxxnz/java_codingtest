package backjoon;

import java.io.*;
import java.util.Stack;

public class Main_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i=0;i<N;i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                stack.pop();
            }else{
                stack.add(input);
            }
        }

        for(int i=0;i<stack.size();i++){
            sum+=stack.get(i);
        }
        System.out.println(sum);
    }
}
