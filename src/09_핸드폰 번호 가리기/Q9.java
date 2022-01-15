public class Q9 {
    class Solution {
        public static String solution(String phone_number) {
            String answer = "";
            String star = "*";
            String repstar = star.repeat(phone_number.length()-4);
            String last4 = phone_number.substring(phone_number.length()-4, phone_number.length());
            answer = repstar+last4;
            return answer;
        }
    }
    public static void main(String[] args) {
        String test = "01092930943";
        System.out.println(Q9.Solution.solution(test));
    }
}
