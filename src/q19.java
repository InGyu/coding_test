import java.util.*;
public class q19 {

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str : completion) {
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        }

        for (String str : participant) {
            if (hashMap.getOrDefault(str, 0) == 0)
                return str;
            hashMap.put(str, hashMap.get(str) - 1);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    }
}
