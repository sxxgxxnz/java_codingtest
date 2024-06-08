package practice;

public class Solution_greedy01 {
    public static void main(String[] args) {
        String name = "JEROEN";
        //String name = "JAN";

        System.out.println(solution(name));
    }
        static int solution(String name) {
            int answer = 0;
            int len = name.length();
            int move = name.length() - 1;

            for(int i=0;i<len;i++){
                char ch = name.charAt(i);
                answer += Math.min(ch - 'A', 26 - (ch - 'A')); // 상, 하
                if(i < len - 1 && name.charAt(i+1)=='A'){
                    // 연속된 'A'가 끝나는 지점 찾기
                    int endA = i+1;
                    while(endA < len && name.charAt(endA) == 'A'){
                        endA++;
                    }
                    move = Math.min(move, i*2 + (len - endA));
                    move = Math.min(move,i+(len - endA) * 2);
                }
            }
            answer += move;
            return answer;
        }

}
