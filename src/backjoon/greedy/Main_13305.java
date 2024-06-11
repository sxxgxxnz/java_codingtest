package backjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main_13305 {
    // 58점
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] city = new int[N];
        int[] road = new int[N-1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<road.length;i++){
            road[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<city.length;i++){
            city[i] = Integer.parseInt(st.nextToken());
        }

        int min = city[0];
        int sum = city[0] * road[0];

        for(int i=1;i<city.length - 1;i++){
            if(city[i] < min){
                min = city[i];
                sum+= (min * road[i]);
            }else{
                sum += min * road[i];
            }

        }
        System.out.println(sum);
    }

     */
    // 100점
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigInteger[] road = new BigInteger[N-1];
        BigInteger[] city = new BigInteger[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<road.length;i++){
            road[i] = new BigInteger(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<city.length;i++){
            city[i] = new BigInteger(st.nextToken());
        }

        BigInteger sum = city[0].multiply(road[0]);
        BigInteger min = city[0];

        for(int i=1;i<city.length-1;i++){
            if(city[i].compareTo(min) < 0){
                sum = sum.add(city[i].multiply(road[i]));
                min = city[i];
            }else{
                sum = sum.add(min.multiply(road[i]));
            }
        }
        System.out.println(sum);
    }
}
