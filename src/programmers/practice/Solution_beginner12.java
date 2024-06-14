package practice;

import java.util.Arrays;

public class Solution_beginner12 {
    public static void main(String[] args) {
        int[] numbers = {1,2,-3,4,-5};
        System.out.println(solution(numbers));
    }

    static int solution(int[] numbers) {
        Arrays.sort(numbers);
        int x = numbers[0] * numbers[1];
        int y = numbers[numbers.length-1] * numbers[numbers.length-2];
        return Math.max(x,y);
    }

}
