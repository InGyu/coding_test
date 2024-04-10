import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {




            public static int[] solution(int[] arr) {
                Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
                Set<Integer> set = new HashSet<>(Arrays.asList(temp));



                return set.stream().mapToInt(Integer::intValue).toArray();
            }





    public static void main(String[] args) {
            int[] a = new int[]{1,3,4,6,3};
            System.out.println(Arrays.toString(solution(a)));


    }
}
