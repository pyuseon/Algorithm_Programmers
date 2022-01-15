



import java.util.stream.IntStream;
//https://recordsoflife.tistory.com/327

public class Q6 {
    class Solution {
        public static int solution(int[] numbers) {
            int answer = 45;
            int[] range = IntStream.rangeClosed(1, 9).toArray();
            for (int i : range) {
                System.out.println(i);
                for (int j : numbers) {
                    System.out.println(j);
                    if (j == i) {
                        answer -= j;
                        System.out.println("합" + answer);
                        break;
                    }
                }

            }
            return answer;
        }
    }


    public static void main(String[] args) {
        int[] test = {1,2,3};
        System.out.println(Q6.Solution.solution(test));
    }
}
