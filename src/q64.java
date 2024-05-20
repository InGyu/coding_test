import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class q64 {



    private static int width, height;
    private static boolean isIn(int x, int y, int dx, int dy) {
        return Math.abs(x + dx) <= width && Math.abs(y + dy) <= height;
    }
    public static int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        width = board[0];
        height = board[1];
        HashMap<String, int[]> map = new HashMap<>();
        map.put("up", new int[]{0, 1});
        map.put("down", new int[]{0, -1});
        map.put("left", new int[]{-1, 0});
        map.put("right", new int[]{1, 0});

        for (String s : keyinput) {
            int dx = map.get(s)[0];
            int dy = map.get(s)[1];
            if (isIn(x,y,dx,dy)) {
                x += dx;
                y += dy;
            }
        }
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"down","down", "down", "down", "down", "down"}, new int[]{7,9})));
    }
}
