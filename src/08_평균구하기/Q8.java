import java.util.Arrays;

public class Q8 {
    class Solution {
        public static double solution(int[] arr) {
            double answer = 0;
            for (int i = 0; i < arr.length; i++){
                answer += arr[i];
            }
            answer = answer/arr.length;
            return answer;
        }
    }
    public static void main(String[] args) {
        int[] range = {11,12,11};
        System.out.println(Q8.Solution.solution(range));
    }
}
