package backjoon;

import java.util.*;
public class Main_2587 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int avg=0, mid=0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        IntSummaryStatistics stat = list.stream().mapToInt(num -> num).summaryStatistics();
        System.out.println((int)stat.getAverage());
        System.out.println(list.get(2));
    }
}
