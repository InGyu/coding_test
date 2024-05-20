import java.util.*;
public class q45 {
    private static int answer;
    private static int[][] Dungeons;
    private static boolean[] visited;

    public static void backTrack(int k, int cnt) {
        for (int i = 0; i < Dungeons.length; i++) {
            if (!visited[i] && k >= Dungeons[i][0]) {
                visited[i] = true;
                backTrack(k - Dungeons[i][1], cnt + 1);
                answer = Math.max(answer, cnt + 1);
                visited[i] = false;
            }
        }
    }
    public static int solution(int k, int[][] dungeons) {
        answer = 0;
        Dungeons = dungeons;
        visited = new boolean[dungeons.length];
        backTrack(k, 0);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(80, new int[][]{{80,20}, {50,40}, {30,10}}));
    }
}
