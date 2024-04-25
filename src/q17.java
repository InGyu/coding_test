import java.util.*;
public class q17 {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> cardDeque1 = new ArrayDeque<>();
        ArrayDeque<String> cardDeque2 = new ArrayDeque<>();
        ArrayDeque<String> goalDeque = new ArrayDeque<>();

        while (!goalDeque.isEmpty()) {
            if (!cardDeque1.isEmpty() && cardDeque1.peekFirst().equals(goalDeque.peekFirst())) {
                cardDeque1.pollFirst();
                goalDeque.pollFirst();
            }
            else if (!cardDeque1.isEmpty() && cardDeque2.peekFirst().equals(goalDeque.peekFirst())) {
                cardDeque2.pollFirst();
                goalDeque.pollFirst();
            }
            else
                break;
        }
        return goalDeque.isEmpty() ? "Yes" : "No";
    }
}
