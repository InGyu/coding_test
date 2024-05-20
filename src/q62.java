import java.util.*;
public class q62 {
    public static int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int t : topping) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int t : topping) {
            set.add(t);
            map.put(t, map.get(t) - 1);
            if (map.get(t) == 0)
                map.remove(t);
            if (set.size() == map.size())
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,1,3,1,4,1,2}));
    }
}
