import java.util.Arrays;

public class q60 {
    public static int[][] solution(int[][] matrix1, int[][] matrix2) {
        int[][] answer = new int[3][3];
        int[][] temp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    temp[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                answer[i][j] = temp[j][i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = solution(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}, new int[][]{{9,8,7},{6,5,4},{3,2,1}});
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
