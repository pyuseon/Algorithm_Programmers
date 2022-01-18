import java.util.Arrays;
import java.util.LinkedList;

public class Q34 {
    class Solution {
        public static Object[] solution(int[] answers) {
            int[] answer = new int[3];

            int[] supoja1 = { 1, 2, 3, 4, 5};
            int[] supoja2 = { 2, 1, 2, 3, 2, 4, 2, 5};
            int[] supoja3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int len = answers.length;

            for (int i =0; i < answers.length; i++){
                int supoja1Idx = i%supoja1.length;
                int supoja2Idx = i%supoja2.length;
                int supoja3Idx = i%supoja3.length;
                if (answers[i] == supoja1[supoja1Idx]){
                    answer[0] +=1;
                }
                if (answers[i] == supoja2[supoja2Idx]){
                    answer[1] +=1;
                }
                if (answers[i] == supoja3[supoja3Idx]){
                    answer[2] +=1;
                }
            }

            System.out.println(Arrays.toString(answer));
            LinkedList<Integer> output = new LinkedList<Integer>();
            int max = Arrays.stream(answer).max().getAsInt();
            for (int i = 0 ; i < answer.length; i++){
                if(answer[i] == max){
                    output.add(i+1);
                }
            }

            return output.toArray();
        }
    }
    public static void main(String[] args) {
        int[] range = { 2, 2, 2, 4, 5, 5, 4, 4, 2,1,1,1,1};
        System.out.println(Arrays.toString(Q34.Solution.solution(range)));
    }
}
