import java.util.*;
public class q26 {

    public static int solution(int N, int A, int B) {
        int answer;
        for (answer = 0; A != B; answer++) {
            A = (A + 1) / 2;
            B = (B + 1) / 2;
        }
        return answer;
    }
}
