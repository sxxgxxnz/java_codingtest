package practice;

public class Solution_beginner10 {
    public static void main(String[] args) {
        String my_string = "bus";
        System.out.println(solution(my_string));
    }
    static String solution(String my_string){
            String answer = "";
            String gather = "aeiou";
            String[] str = my_string.split("");

            for(int i=0;i<str.length;i++){
                if(!gather.contains(str[i])){
                    answer+=str[i];
                }

            }
            return answer;
        }

}
