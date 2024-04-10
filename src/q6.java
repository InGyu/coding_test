import java.util.HashMap;
import java.util.Map;

public class q6 {
    public static int[] solution(int n, int[] stages) {
        int[] challenger = new int[n + 2];
        for (int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }

        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;

        for (int i = 1; i <= n; i++) {
            if (challenger[i] == 0) {
                fails.put(i, 0.);
            }
            else {
                fails.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }
        return fails.entrySet().stream().sorted((o1,o2) -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }
}
