package practice;

// 해시 - 베스트 앨범
import java.util.*;

public class Solution_hash03 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(solution(genres,plays));
    }
    // map과 list로 풀어보려고 했으나, 생각보다 인덱스(고유번호)를 다루는 부분에서 까다롭다고 느낌
    // 다른 사람 풀이를 참고하여 객체를 만들어서 문제를 풀어봄
    /*
    static int[] solution(String[] genres, int[] plays) {
        int[] answer = new int[genres.length];
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> idxMap = new HashMap<>();
        for(int i=0;i< genres.length;i++){
            map.put(genres[i],plays[i]);
            idxMap.put(genres[i], i);
        }

        for(int i=0;i<map.size();i++){
            Integer max = Collections.max(map.values()); //2500
            for(String key : map.keySet()){
                if(map.get(key).equals(max)){
                    //String gen = key;
                    answer[i] = idxMap.get(key);
                    map.remove(key,map.get(key).equals(max));
                    if(map.containsKey(key)){

                    }
                }
            }
        }


        return answer;
    }
     */
    static class Music{
        String genre;
        int play;
        int idx;
        public Music(String genre,int play, int idx){
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
    // 1. 총 재생 횟수가 가장 많은 장르를 먼저 수록
    // 2. 장르 내 많이 재생된 노래를 먼저 수록
    // 3. 장르 내에서 재생횟수가 같은 노래 중 고유 번호가 낮은 노래부터 수록
    static int[] solution(String[] genres, int[] plays) {

        // 1. 총 재생 횟수가 가장 많은 장르 구하기
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<genres.length;i++){
            // genres가 존재하면 재생횟수 누적 합
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }
        List<String> maxGenre = new ArrayList<>();
        while(!map.isEmpty()){
            int max = -1;
            String max_key = "";
            for(String key : map.keySet()){
                int tmp = map.get(key);
                if(tmp > max){
                    max = tmp;
                    max_key = key;
                }
            }
            maxGenre.add(max_key);
            map.remove(max_key);
        }

        // 2. 장르 내 노래
        List<Music> result = new ArrayList<>();
        for(String gen : maxGenre){
            List<Music> list = new ArrayList<>();
            for(int i=0;i<genres.length;i++){
                if(genres[i].equals(gen)){
                    list.add(new Music(gen,plays[i],i));
                }
            }
            // 내림 차순
            Collections.sort(list,(o1,o2) -> o2.play - o1.play);
            result.add(list.get(0));
            if(list.size() > 1){
                result.add(list.get(1));
            }
        }
        int[] answer = new int[result.size()];
        for(int i=0;i< result.size();i++){
            answer[i] = result.get(i).idx;
            //System.out.println(answer[i]);
        }
        return answer;
    }
}
