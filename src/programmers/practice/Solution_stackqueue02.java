package practice;

import java.util.*;

public class Solution_stackqueue02 {
    public static void main(String[] args) {
        /*int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};*/
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        System.out.println(solution(bridge_length,weight,truck_weights));
    }
    /* // 이 풀이는 무한 루프때문에 시간초과가 나와 다른 풀이로 작성함
        다리에 트럭이 추가되는 경우
     1. 큐가 비어 있고, 무게가 초과 되지 않아 트럭이 추가된 경우
     2. 큐가 다리 길이보다 적고,
        2-1. 다음 트럭과 현재 다리에 있는 트럭의 합의 무게가 초과 되지 않는 경우
        2-2. 다음 트럭과 현재 다리에 있는 트럭의 합의 무게가 초과 되어 현재 다리에 있는 트럭은 건너고, 새 트럭이 추가된 경우
     3. 큐가 가득 찬 경우
        3-1. 가장 먼저 들어온 트럭이 나가고, 다음 트럭
     */
    /*
    static int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = bridge_length;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int truck : truck_weights){
            while(true){
                if(queue.isEmpty()){// 1. 큐가 비어있는 경우
                    if(truck < weight){
                        queue.add(truck);
                        time++;
                        sum += truck;
                        break;
                    }
                }else if(queue.size() < bridge_length){ // 2. 큐가 아직 가득 차지 않은 경우
                    if(truck + sum < weight){
                        queue.add(truck);
                        time++;
                        sum+=truck;
                        break;
                    }else if(truck + sum > weight){
                        queue.add(0);
                        time++;
                        break;
                    }
                }else if(queue.size() == bridge_length){ // 3. 큐가 가득 찬 경우
                    sum-=queue.poll();
                }
            }

        }
        return time;
    }

     */
    static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> trucks = new LinkedList<>();
        Queue<int[]> bridge = new LinkedList<>();
        for(int truck : truck_weights){
            trucks.add(truck);
        }

        int sum = 0;
        int time = 0;
        while(!trucks.isEmpty() || ! bridge.isEmpty()){
            if(!bridge.isEmpty() && bridge.peek()[0] <= time){
                int[] tmp = bridge.poll();
                sum -=tmp[1];
            }

            if(!trucks.isEmpty() && bridge.size() + 1 <= bridge_length && sum + trucks.peek() <= weight){
                int truck = trucks.poll();
                sum += truck;
                bridge.add(new int[] { time + bridge_length, truck});
            }

            time++;
        }
        return time;
    }
}
