package practice;

import java.util.*;
// 별찍기
public class Solution_beginner05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i= 1; i<= n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        String str = "hello";
        String answer = "";
        for(int i=0;i<str.length();i++){
            char cr = str.charAt(i);
            for(int j=0;j<n;j++){
                answer += cr;
            }
        }
        System.out.println(answer);

        //System.out.println(n);
    }
}
