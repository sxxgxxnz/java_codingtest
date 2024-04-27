package backjoon;

import java.util.*;
public class Main_1427 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String[] num = N.split("");
        int[] arr = new int[num.length];

        for(int i=0;i<num.length;i++){
            arr[i]=Integer.parseInt(num[i]);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
