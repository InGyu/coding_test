class test {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (n % j == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}