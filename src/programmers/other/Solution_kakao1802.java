package other;

// 카카오 18 - 1차 뉴스 클러스터링

import java.util.ArrayList;

public class Solution_kakao1802 {
    public static void main(String[] args) {
        /* 테스트 1
        //String str1 = "FRANCE";
        //String str2 = "french";
         */
        /* 테스트2
        String str1 = "handshake";
        String str2 = "shake hands";
        */
        // 테스트 3
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";

        /* 테스트 4
        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";
         */

        System.out.println(solution1(str1,str2));
        System.out.println(solution2(str1,str2));
    }
    // 내가 푼 풀이 -> 5개 테스트 케이스를 통과하지 못했음
    // 합집합과 교집합 배열을 구하지 않아 틀린듯
    static int solution1(String str1, String str2) {
        double answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        ArrayList<String> str1List = new ArrayList<>();
        ArrayList<String> str2List = new ArrayList<>();

        for(int i=0;i<str1.length()-1;i++){
            if(checkString(str1.substring(i,i+2))){
                str1List.add(str1.substring(i,i+2));
            }

        }
        for(int i=0;i<str2.length()-1;i++){
            if(checkString(str2.substring(i,i+2))) {
                str2List.add(str2.substring(i, i + 2));
            }
        }

        int cnt = 0;
        double similar = 0.0;
        if(str1List.isEmpty() && str2List.isEmpty()){
            similar = 1.0;
        }else{
            for(int i=0;i<str1List.size();i++){
                if(str2List.contains(str1List.get(i))){
                    cnt++;
                }
            }
            similar = (double) cnt / (str1List.size() + str2List.size() - cnt) ;
        }

        //int jakard = 65536;
        answer = similar * 65536;

        System.out.println("str1List : "+str1List);
        System.out.println("str2List : "+str2List);
        return (int)answer;
    }
    static boolean checkString(String str){
        //if(str.matches("^[\\\\s][\\\\d]*$"))
        return str.matches("^[a-z|A-Z]*$");
    }

    static int solution2(String str1, String str2){
        int answer;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        ArrayList<String> str1List = new ArrayList<>();
        ArrayList<String> str2List = new ArrayList<>();

        ArrayList<String> union = new ArrayList<>(); // 합집합
        ArrayList<String> intersact = new ArrayList<>(); // 교집합

        for(int i=0;i<str1.length()-1;i++){
            if(checkString(str1.substring(i,i+2))){
                str1List.add(str1.substring(i,i+2));
            }

        }
        for(int i=0;i<str2.length()-1;i++){
            if(checkString(str2.substring(i,i+2))) {
                str2List.add(str2.substring(i, i + 2));
            }
        }
        for(String s : str1List){
            if(str2List.remove(s)){ // 집합1에 집합2가 포함된다면 삭제후, 교집합에 추가
                intersact.add(s);
            }
            union.add(s);
        }
        union.addAll(str2List);

        double tmp = (double) intersact.size() / (double) union.size();
        tmp *= 65536;
        if(union.isEmpty()){
            return 65536;
        }
        System.out.println("union : "+union);
        System.out.println("intersact : "+intersact);
         System.out.println("str1List : "+str1List);
        System.out.println("str2List : "+str2List);
        answer = (int) tmp;
        return answer;
    }
}
