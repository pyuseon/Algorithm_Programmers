// 조합 만들기
//https://bcp0109.tistory.com/15


import java.util.ArrayList;
import java.util.Collections;

public class Q32 {
    public static ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<Integer>() ;

        for(int i = 0; i < (numbers.length -1);i++){
            for(int j = (i+1); j < numbers.length; j++){
                result.add(numbers[i] +numbers[j]);
            }
        }

        Collections.sort(result);

        ArrayList<Integer> answer = new ArrayList<Integer>() ;
        for(int i = 0; i < result.size()-1;i++) {
            if (result.get(i).intValue() != result.get(i+1).intValue()) {
                answer.add(result.get(i));
            }
        }
        answer.add(result.get(result.size()-1));

//        HashSet<Integer> answer = new HashSet<Integer>();
//        for(int i = 0; i < result.size();i++) {
//                answer.add(result.get(i));
//        }

        return answer;
    }


    public static void main(String[] args) {
        int [] test = {2,1,3,4,1};
        System.out.println(Q32.solution(test));
    }
}
