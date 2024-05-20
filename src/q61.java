import java.util.Arrays;

public class q61 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endRow; i++) {
                answer[startRow][i] = num++;
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                answer[i][endCol] = num++;
            }
            endCol--;
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    answer[endRow][i] = num++;
                }
            }
            endRow--;

            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    answer[i][startCol] = num++;
                }
            }
            startCol++;
        }
        return answer;

    }

    public static void main(String[] args) {
        int[][] arr = solution(3);
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
