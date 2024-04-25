// myself

import java.util.*;

public class q16 {
    public static int[] solution(int[] progresses, int[] speeds) {


        LinkedList<Integer> list = new LinkedList<>();
        int[] temp = new int[2];
        int answer = 0;
        ArrayDeque<Integer> progressesQ = new ArrayDeque<>();
        ArrayDeque<Integer> speedsQ = new ArrayDeque<>();
        for (int i = 0; i < progresses.length; i++) {
            progressesQ.addLast(progresses[i]);
            speedsQ.addLast(speeds[i]);
        }
        while (!progressesQ.isEmpty()) {
            int j = progressesQ.size();
            answer = 0;
            for (int i = 0; i < j; i++) {
                temp[0] = progressesQ.pollFirst();
                temp[1] = speedsQ.pollFirst();
                progressesQ.addLast(temp[0] + temp[1]);
                speedsQ.addLast(temp[1]);
            }
            for (int i = 0; i < j; i++) {
                if (!progressesQ.isEmpty() && progressesQ.peekFirst() >= 100) {
                    progressesQ.pollFirst();
                    speedsQ.pollFirst();
                    answer++;
                }
            }
            if (answer != 0)
                list.add(answer);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static int[] solution2(int[] progresses, int[] speeds) {
        Queue<Integer> answer = new ArrayDeque<>();
        int n = progresses.length;

        int[] daysLeft = new int[n];
        for (int i = 0; i < n; i++) {
            daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        int count = 0;
        int maxDay = daysLeft[0];
        for (int i = 0; i < n; i++) {
            if (daysLeft[i] <= maxDay) {
                count++;
            }
            else {
                answer.add(count);
                count = 1;
                maxDay = daysLeft[i];
            }
        }
        answer.add(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds = new int[]{1,1,1,1,1,1};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
        System.out.println(Arrays.toString(solution2(progresses, speeds)));
    }
}
