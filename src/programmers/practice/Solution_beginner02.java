package practice;

// 두 수의 나눗셈
public class Solution_beginner02 {
        public int solution(int num1, int num2) {
            double answer = 0;
            double result = (double) num1 / num2;
            answer = result * 1000;
            return (int)answer;
        }
}
