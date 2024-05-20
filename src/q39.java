import java.util.*;
public class q39 {
    private static final int[] rx = {0,0,1,-1};
    private static final int[] ry = {1,-1,0,0};

    private static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static char[][] map;
    private static int N, M;
    public static int solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        map = new char[N][M];

        for (int i = 0; i < N; i++) {
            map[i] = maps[i].toCharArray();
        }

        Point start = null, end = null, lever = null;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'S')
                    start = new Point(j, i);
                else if (map[i][j] == 'E')
                    end = new Point(j, i);
                else if (map[i][j] == 'L')
                    lever = new Point(j, i);
            }
        }

        int startLever = bfs(start, lever);
        int leverEnd = bfs(lever, end);

        if (startLever == -1 || leverEnd == -1)
            return -1;
        else
            return startLever + leverEnd;
    }

    private static int bfs(Point start, Point end) {
        int[][] dist = new int[N][M];
        ArrayDeque<Point> q = new ArrayDeque<>();
        dist[start.y][start.x] = 1;
        q.add(start);
        while (!q.isEmpty()) {
            Point now = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = now.x + rx[i];
                int nextY = now.y + ry[i];

                if (nextX < 0 || nextY < 0 || nextX >= M || nextY >= N)
                    continue;
                if (dist[nextY][nextX] > 0)
                    continue;
                if (map[nextY][nextX] == 'X')
                    continue;
                dist[nextY][nextX] = dist[now.y][now.y] + 1;
                q.add(new Point(nextX, nextY));
                if (nextX == end.x && nextY == end.y)
                    return dist[end.y][end.x] - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"LOOXS", "OOOOX", "OOOOO", "OOOOO", "EOOOO"}));
    }
}

/*S O O O L
* X X X X O
* O O O O O
* O X X X X
* O O O O E*/
