import java.util.*;
public class q53 {
    public static long solution(long n) {
        String[] digits = String.valueOf(n).split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(digits);
        for (String digit : digits)
            sb.append(digit);
        return Long.parseLong(sb.toString());
    }
}
