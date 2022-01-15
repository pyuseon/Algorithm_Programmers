import java.util.Arrays;

public class Q7 {
    class Solution {
        public static int solution(int[] absolutes, boolean[] signs) {
            System.out.println(Arrays.toString(absolutes));
            System.out.println(Arrays.toString(signs));

            int answer = 0;

            for (int i = 0; i < absolutes.length; i++){
                answer = signs[i]? answer+absolutes[i] : answer + (absolutes[i]*-1);
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        int[] absolutes = {11,10,11};
        boolean[] signs= {false, true,true};
        System.out.println(Q7.Solution.solution(absolutes,signs));
    }
}
