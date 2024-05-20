import java.util.*;
public class q54 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[3];
        for (int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            int k = 0;
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                temp[k++] = array[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}
