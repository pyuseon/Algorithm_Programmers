public class Q22 {
    public static int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < str.length();i++){
            answer += Integer.parseInt(str.substring(i, i+1));
        }
        return answer;
    }


    public static void main(String[] args) {
        int test = 123;
        System.out.println(Q22.solution(test));
    }
}
