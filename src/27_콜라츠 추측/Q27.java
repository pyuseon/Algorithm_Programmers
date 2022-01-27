public class Q27 {
    public static int solution(long num) {
        int answer = 0;
        while (true){
            if(num == 1) break;
            num = ((num % 2) == 0) ? (num / 2) : ((num * 3) + 1);
            answer += 1;
            if(answer > 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        long test = 1;
        System.out.println(Q27.solution(test));
    }
}
