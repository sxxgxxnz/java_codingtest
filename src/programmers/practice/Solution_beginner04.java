package practice;

public class Solution_beginner04 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        System.out.println(solution(num_list));
    }
    static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=0;i<num_list.length;i++){
            answer[i] = num_list[num_list.length-i-1];
        }

        return answer;
    }

}
