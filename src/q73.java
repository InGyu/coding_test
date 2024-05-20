import java.util.Arrays;

public class q73 {

    public static int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {

            for (int j = 0; j < land[i].length; j++) {
                int max = 0;
                for (int k = 0; k < land[i].length; k++) {
                    if (j != k)
                        max = Math.max(max, land[i-1][k]);
                }
                land[i][j] += max;
            }
        }

        return Arrays.stream(land[land.length - 1]).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,2,3,5}, {5,6,7,8}, {4,3,2,1}}));
    }
}
