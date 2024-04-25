import java.util.*;
public class q18 {
    public static boolean solution(int[] arr, int target) { // 시간복잡도 n^2
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                set.add(arr[i] + arr[j]);
            }
        }
        return set.contains(target);
    }

    public static boolean solution2(int[] arr, int target) { // 시간복잡도 n
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : arr) {
            if (hashSet.contains(target - 1)) {
                return true;
            }
            hashSet.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = new int[]{2,3,5,9};
        System.out.println(solution(a, 10));
    }
}
