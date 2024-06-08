package practice;

import java.util.*;
import java.io.*;

public class Solution_beginner07 {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        System.out.println(solution(letter));
    }
        static String solution(String letter) {
            String answer = "";
            String[] arr = letter.split(" ");

            String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

            for(int i=0;i<arr.length;i++){
                String str = arr[i];
                for(int j=0;j<morse.length;j++){
                    if(morse[j].equals(str)){
                        char ch = (char) (j+97);
                        answer+=ch;
                    }
                }
            }

            return answer;
        }

}
