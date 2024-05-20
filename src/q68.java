import java.util.Arrays;

public class q68 {
    public static int solution(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j])
                    memo[i] = Math.max(memo[i], memo[j] + 1);
            }
        }
        return Arrays.stream(memo).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,4,2,3,1,5,7,3}));
    }
}
