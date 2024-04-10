// 혼자서 해결함
import java.util.*;
public class q13 {
    public static int soultion(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
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

        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));
        System.out.println(Arrays.toString(board[3]));
        System.out.println(Arrays.toString(board[4]));
        return answer;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] b = new int[]{1,5,3,5,1,2,1,4};
        System.out.println(soultion(a,b));
    }
}

