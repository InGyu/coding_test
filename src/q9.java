import java.util.ArrayDeque;
import java.util.Stack;

public class q9 {
    public static String solution(int num) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while(num > 0) {
            int remainder = num % 2;
            stack.push(remainder);
            num /= 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
