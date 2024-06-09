package practice;

public class Solution_beginner09 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
    static int solution(int n) {
        int answer = 0;
        for(int i=4;i<=n;i++){
            for(int j=2;j<i;j++){
                if(i % j == 0){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

}
