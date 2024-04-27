package backjoon;

import java.util.*;

public class Main_25305 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(i,sc.nextInt());
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list.get(k-1));
    }
}
