package practice;

//프로그래머스 - 해시 (전화번호 목록)
import java.util.*;

public class Solution_hash02 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }
    static boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i< phone_book.length;i++){
            map.put(phone_book[i],i);
        }
        for(int i=0;i< phone_book.length;i++){
            for(int j=0;j<phone_book[i].length();j++){
                if(map.containsKey(phone_book[i].substring(0, j))){
                    answer = false;
                }
            }
        }
        return answer;
    }
}
