// myself
import java.util.*;
public class q13 {
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        Deque<Integer> stack1 = new ArrayDeque<>();

        int answer = 0;
        int temp = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    temp = board[j][moves[i] - 1];
                    if (!stack.isEmpty() && (temp == stack.peek())) {
                        stack.pop();
                        answer+=2;
                    } else {
                        stack.push(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }

        }
        return answer;
    }
}

