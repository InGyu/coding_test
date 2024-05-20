import java.util.*;
public class q38 {

    private static boolean[] visit;
    private static int[][] computer;

    private static void dfs(int now) {
        visit[now] = true;
        for (int i = 0; i < computer[now].length; i++) {
            if (computer[now][i] == 1 && !visit[now])
                dfs(i);
        }
    }
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        computer = computers;
        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                dfs(i);
                answer++;
            }
        }
        return answer;
    }

    /* 1 1 0  1 - 1 1- 2 2 - 1 2 - 2 3 -3
    *  1 1 0
    *  0 0 1
    *
    * 1 1 0 1 - 1 1 - 2 2 - 1 2 - 2 2 - 3 3 - 2 3 -3
    * 1 1 1
    * 0 1 1*/
}
