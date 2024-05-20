package other;

//2018 카카오 블라인드 채용 - [1차] 캐시
import java.util.ArrayList;

public class Solution_kakao1801 {
    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cacheSize,cities));
    }
    static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        if(cacheSize == 0){
            return cities.length * 5;
        }
        for(int i=0;i<cities.length;i++){
            String city = cities[i].toLowerCase();

            if(list.contains(city)){
                list.remove(city);
                list.add(city);
                answer+=1;
            }else{
                if(list.size()==cacheSize){
                    list.remove(0);
                }
                list.add(city);
                answer+=5;

            }
        }
        return answer;
    }
}
