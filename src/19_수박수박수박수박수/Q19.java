public class Q19 {
    static class Solution {
        public static String solution(int n) {
            String answer = "";
            for( int i = 0; i < n;i++){
                answer = i%2 != 0? answer+"박": answer+"수";
            }
            return answer;
        }


    }
    public static void main(String[] args) {
        System.out.println(Q19.Solution.solution(12));
    }
}
