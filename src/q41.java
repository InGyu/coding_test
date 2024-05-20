import java.util.*;
public class q41 {
    private static final int[] X = {0,-1, 0, 1};
    private static final int[] Y = {-1, 0, 1, 0};

    private static class Point {
        int x, y, direction, cost;
        public Point(int x, int y, int direction, int cost) {
            this.x = x;
            this.y = y;
            this.direction = direction;
            this.cost = cost;
        }
    }

    private static int N;
    private static int[][][] visited;

    private static boolean isValid(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }

    private static int calculateCost(int direction, int prevDirection, int cost) {
        if (prevDirection == -1 || (prevDirection - direction) % 2 == 0)
            return cost + 100;
        return cost + 600;
    }

    private static boolean isBlocked(int[][] board, int x, int y) {
        return (x == 0 && y == 0) || !isValid(x, y) || board[x][y] == 1;
    }
    private static boolean isShouldUpdate(int x, int y, int direction, int newCost) {
        return visited[x][y][direction] == 0 || visited[x][y][direction] > newCost;
    }
    public static int solution(int[][] board) {
        ArrayDeque<Point> q = new ArrayDeque<>();
        q.add(new Point(0, 0, -1, 0));
        N = board.length;
        visited = new int[N][N][4];

        int answer = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            Point now = q.poll();
            for (int i = 0; i < 4; i++) {
                int new_x = now.x + X[i];
                int new_y = now.y + Y[i];

                if(isBlocked(board, new_x, new_y))
                    continue;

                int new_cost = calculateCost(i, now.direction, now.cost);
                if (new_x == N-1 && new_y == N-1) {
                    answer = Math.min(answer, new_cost);
                }
                else if (isShouldUpdate(new_x, new_y, i, new_cost)) {
                    q.add(new Point(new_x, new_y, i, new_cost));
                    visited[new_x][new_y][i] = new_cost;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}));
    }

}
