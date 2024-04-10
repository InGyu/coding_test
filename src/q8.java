import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class q8 {

    private boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        char[] a = s.toCharArray();
        for (char c : a) {
            if (c == '(')
                stack.push(c);

            else {
                if (stack.isEmpty() || stack.pop() == c)
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
