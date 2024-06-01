package practice;

// 분수의 덧셈
public class Solution_beginner01 {
    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;

        int denom = denom1 * denom2;
        int numer = numer1 * denom2 + numer2 * denom1;

        int max = 1;
        for(int i=1;i<=numer && i<=denom;i++){
            if(denom % i == 0 && numer % i == 0){
                max = i;
            }
        }
        numer /= max;
        denom /= max;

        int[] answer = {numer, denom};
        System.out.println(answer[0]+", "+answer[1]);
    }
}
