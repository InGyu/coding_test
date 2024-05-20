import java.util.*;
class q63 {

    public static int solution(int n) {
        return Integer.toBinaryString(n).replace("0", "").length();
    }


    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
