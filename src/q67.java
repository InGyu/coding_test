public class q67 {

    public static int solution(String str1, String str2) {
        int[][] memo = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    memo[i][j] = memo[i - 1][j - 1] + 1;
                else
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
            }
        }
        return memo[str1.length()][str2.length()];
    }

    public static void main(String[] args) {
        System.out.println(solution("ABCBDAB", "BDCAB"));
    }
}
