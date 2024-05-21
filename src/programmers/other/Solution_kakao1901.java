package other;

// 카카오 2019 - 튜플
import java.lang.reflect.Array;
import java.util.*;

public class Solution_kakao1901 {
    public static void main(String[] args) {
        //String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        System.out.println(solution(s));
        System.out.println(otherSolution(s));
        System.out.println(solution2(s).toString());
    }
    // StringTokenizer를 이용한 나의 풀이
    // 횟수 기준 정렬이 되어있지 않아 테스트 탈락
    static ArrayList<Integer> solution(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s,"{},",true);

        while(st.hasMoreTokens()){
            String str = st.nextToken();
           // System.out.println(str);
            if(str.chars().allMatch(Character::isDigit)){
                //System.out.println(str);
                if(!list.contains(Integer.parseInt(str))){
                    list.add(Integer.parseInt(str));
                }

            }
        }
        return list;
    }
    // 다른 사람 풀이
    static ArrayList<Integer> otherSolution(String s){
        ArrayList<Integer> answer = new ArrayList<>();
        // 맨 앞 {{ 제거
        s = s.substring(2,s.length());
        // 맨 뒤 }} 제거 한 다음, },{ 형태의 문자열을 - 로 변경
        s = s.substring(0,s.length() - 2).replace("},{","-");
        //바뀐 문자열을 split
        String[] str = s.split("-");
        //나눠진 문자열 배열을 길이에 따라 다시 정렬
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        // 각 문자열을 탐색
        for(String x : str){
            String[] tmp = x.split(",");
            for(int i=0;i<tmp.length;i++){
                int n = Integer.parseInt(tmp[i]);
                if(!answer.contains(n))
                    answer.add(n);
            }
        }
        return answer;
    }

    // 위 풀이를 참고하여 수정한 나의 풀이
    // StringTokenizer를 굳이 사용하지 않고 substring
    static int[] solution2(String s) {

        StringTokenizer st = new StringTokenizer(s,"{},",true);

        Map<Integer,Integer> map = new HashMap<>();
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            // System.out.println(str);
            if(str.chars().allMatch(Character::isDigit)) {
                int num = Integer.parseInt(str);
                map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(v1,v2) -> (map.get(v2) - map.get(v1)));

        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        //System.out.println(answer.toString());
        return answer;
    }
}
