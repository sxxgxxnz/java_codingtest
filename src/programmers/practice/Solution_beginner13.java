package practice;

import java.util.HashMap;
import java.util.Map;

public class Solution_beginner13 {
    public static void main(String[] args) {
        String polynomial = "3x + 7 + x";
        System.out.println(solution(polynomial));
    }

    static String solution(String polynomial) {
        int x = 0;
        int num = 0;
        for(String s : polynomial.split(" ")){
            if(s.contains("x")){
                x += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x",""));
            }else if(!s.equals("+")){
                num+=Integer.parseInt(s);
            }
        }
        return (x != 0 ? x > 1 ? x + "x" : "x" : "") +
                (num != 0 ? (x != 0 ? " + " : "") +
                 num : x == 0 ? "0" : "");
    }
}
