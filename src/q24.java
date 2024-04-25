import java.util.*;
public class q24 {
    public static String[] solution(String[] orders, int[] course) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < orders.length; i++) {
            for (int j = 0; j < orders[i].length(); j++) {
                map.put(orders[i].charAt(j), map.getOrDefault(orders[i].charAt(j), 0) + 1);
            }
        }

        String[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};
        System.out.println(Arrays.toString(solution(orders, course)));
    }
}
