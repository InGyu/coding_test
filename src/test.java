import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {


        public static int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;
            int limit = 0;
            int temp = 0;
            ArrayDeque<Integer> before_bridgeQ = new ArrayDeque<>();
            ArrayDeque<Integer> across_bridgeQ = new ArrayDeque<>();
            ArrayDeque<Integer> after_bridgeQ = new ArrayDeque<>();
            for (int i = 0; i < truck_weights.length; i++) {
                before_bridgeQ.addLast(truck_weights[i]);
            }
            for (int i = 0; i < bridge_length; i++) {
                across_bridgeQ.addLast(0);
            }

            while (!before_bridgeQ.isEmpty() || !across_bridgeQ.isEmpty()) {
                if (before_bridgeQ.peekFirst() != null) {
                    across_bridgeQ.addLast(before_bridgeQ.peekFirst());
                    limit += before_bridgeQ.pollFirst();
                }
                if (across_bridgeQ.size() > bridge_length) {
                    after_bridgeQ.addLast(across_bridgeQ.peekFirst());
                    limit -= across_bridgeQ.pollFirst();
                }
                if (limit > weight) {
                    after_bridgeQ.addLast(across_bridgeQ.peekFirst());
                    limit -= across_bridgeQ.pollFirst();
                }
                answer++;
            }
            return answer;
        }



    public static void main(String[] args) {
            int[] a = new int[]{7,4,5,6};
            System.out.println(solution(2, 10, a));


    }
}
