package practice;

import java.util.Arrays;

public class Solution_beginner06 {
    public static void main(String[] args) {
        String answer = "";
        int age = 23;
        String age962 = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");

        for(int i=0;i<ageArr.length;i++){
            answer+= age962.charAt(Integer.valueOf(ageArr[i]));
        }
        System.out.println(answer);
    }
}
