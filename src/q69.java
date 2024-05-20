import java.util.Arrays;

public class q69 {
    public static int solution(int[][] arr) {
        int flag = 0;
        if (arr[0].length % 2 == 0)
            flag = 1;
        int[] temp = new int[arr[0].length];
        for (int i = 0; i < arr[0].length; i++) {
            if (flag == 0) {
                if (i % 2 == 0) {
                    temp[i] = arr[0][i] + arr[2][i];
                } else
                    temp[i] = arr[1][i];
            }
            else {
                if (i % 2 == 1) {
                    temp[i] = arr[0][i] + arr[2][i];
                } else
                    temp[i] = arr[1][i];
            }
        }
        return Arrays.stream(temp).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,3,3,2}, {2,1,4,1}, {1,5,2,3}}));
        System.out.println(solution(new int[][]{{1,7,13,2,6}, {2,-4,2,5,4}, {5,3,5,-3,1}}));
    }
}
