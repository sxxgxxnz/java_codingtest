package practice;

//프로그래머스 없는 숫자 더하기
public class Solution02 {
    public int solution(int[] numbers){
        int sum = 45; //0~9까지의 합
        for(int i : numbers){ // 배열에서 받은 숫자의 합에서 45를 뺌
            sum-=i;
        }
        return sum;
    }
}
