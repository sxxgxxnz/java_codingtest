package practice;

import java.util.Arrays;

// 단어 변환 - dfs
public class Solution_dfs_bfs02 {
    static boolean visited[];
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(solution(begin,target,words));
    }
    static int solution(String begin, String target, String[] words) {
        if(!Arrays.asList(words).contains(target)){
            return 0;
        }
        visited = new boolean[words.length];
        dfs(begin,target,words,0);

        return answer;
    }
    static void dfs(String begin, String target, String[] words, int cnt){
        if(begin.equals(target)){
            answer = cnt;
            return;
        }

        for(int i=0;i<words.length;i++){
            if(visited[i]==true){
                continue;
            }

            String word = words[i];
            int notEqual = 0;

            for(int j=0;j<begin.length();j++){
                if(begin.charAt(j) != word.charAt(j)){
                    notEqual += 1;
                }
            }

            if(notEqual == 1){
                visited[i] = true;
                dfs(word,target,words,cnt+1);
                visited[i] = false;
            }
        }
    }
}
