package practice;

//직사각형 넓이 구하기
public class Solution_beginner11 {
    public static void main(String[] args) {
        int[][] dots = {{1,1},{2,1},{2,2},{1,2}};
        System.out.println(solution(dots));
    }
    static int solution(int[][] dots){
        int width = 0;
        int height = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        for(int i=1;i<dots.length;i++){
            if(x != dots[i][0]){
                width = Math.abs(x - dots[i][0]);
            }
            if(y != dots[i][1]){
                height = Math.abs(y - dots[i][1]);
            }
        }
        return width * height;
    }
}
