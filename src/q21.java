//myself
import java.util.*;

public class q21 {
    public static String[] solution(String[] record) {
        HashMap<String, String> hashMap = new HashMap<>();
        int count = 0;
        for (String string : record) {
            String[] temp;
            temp = string.split(" ");
            if (temp[0].equals("Enter")) {
                hashMap.put(temp[1], temp[2]);
                count++;
            }
            else if (temp[0].equals("Leave")) {
                hashMap.get(temp[1]);
                count++;
            }
            else if (temp[0].equals("Change")) {
                hashMap.put(temp[1], temp[2]);
            }
        }
        String[] answer = new String[count];
        int j = 0;
        for (int i = 0; i < record.length; i++) {
            String[] temp;
            temp = record[i].split(" ");
            if (temp[0].equals("Enter")) {
                answer[j++] = hashMap.get(temp[1]) + "님이 들어왔습니다.";
            }
            else if (temp[0].equals("Leave")) {
                answer[j++] = hashMap.get(temp[1]) + "님이 나갔습니다.";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] str = new String[]{"Enter uid1234 Muzzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(str)));
    }
}
