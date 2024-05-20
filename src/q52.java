import java.util.*;
public class q52 {

    public static String[] solution(String[] strings, int n) {
        char[][] str = new char[strings.length][];
        for (int i = 0; i < strings.length; i++) {
            str[i] = strings[i].toCharArray();
        }
        Arrays.sort(strings, ((o1, o2) -> o1.charAt(n) == o2.charAt(n) ? o1.compareTo(o2) : Character.compare(o1.charAt(n), o2.charAt(n))));
        return strings;
    }
}
