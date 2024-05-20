import java.util.*;
public class q31 {
    public static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int k = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return Math.min(k, set.size());
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,3,3,2,2,4}));
    }
}
