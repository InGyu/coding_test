import java.util.*;
public class q32 {
    public static int[] solution(int n, String[] words) {
        HashSet<String> set = new HashSet<>();
        int[] answer = new int[]{0, 0};
        String[] temp = new String[words.length + 1];
        for (int i = 0; i < words.length; i++) {
            temp[i] = words[i];
        }
        char past = words[0].charAt(0);
        for (int i = 0; i < words.length; i++) {
            int person = (i % n) + 1;
            int round = (i / n) + 1;
            System.out.println(person);

            if (set.contains(temp[i])) {
                answer[0] = person;
                answer[1] = round;
                break;
            }
            if (words[i].charAt(0) != past) {
                answer[0] = person;
                answer[1] = round;
                break;
            }
            past = words[i].charAt(words[i].length() - 1);

            set.add(temp[i]);

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }
}
