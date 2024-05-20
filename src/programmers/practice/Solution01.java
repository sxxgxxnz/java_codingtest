package practice;

//프로그래머스 문자열 내 p와 y의 개수
public class Solution01 {
   public static boolean solution(String s) {
        boolean answer = true;
        int p=0, y=0;
        String[] arr = s.toLowerCase().split("");

        for(int i=0;i<arr.length;i++){
            if("p".equals(arr[i])){
                p++;
            }else if("y".equals(arr[i])){
                y++;
            }
        }
        if(p != y){
            answer = false;
        }

        return answer;
    }
}
