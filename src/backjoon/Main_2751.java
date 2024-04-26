package backjoon;

import java.util.*;

public class Main_2751 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n=sc.nextInt();
        // int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        // Arrays.sort(arr); -> Arrays.sort()는 시간초과가 생김
        Collections.sort(list);
        for(int v : list){
            sb.append(v).append('\n');
        }
        System.out.println(sb);
    }
}
