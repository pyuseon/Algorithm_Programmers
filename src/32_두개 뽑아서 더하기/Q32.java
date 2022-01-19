// 조합 만들기
//https://bcp0109.tistory.com/15


import java.util.ArrayList;
import java.util.Collections;

public class Q32 {
    public static ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<Integer>() ;

//         두개씩 뽑아서 더하기 for loop 
//         i가 0 일 때 기준 [2,1,3,4,1]에서 2,1 / 2,3 / 2,4 / 2,3 을 뽑아 각각 더해준다. 
//         i가 1 일 때는 이미 2는 제외하고 1,3 /1,4 /1,1 을 뽑아 더해준다 .
//         위의 시행을 numbers의 마지막 변수 전까지 반복한다. (이미 마지막변수는 마지막 이전에 더하기가 완료되었다.)
//         두개씩 뽑아서 더해진 값들을 result에 추가한다. 
        for(int i = 0; i < (numbers.length -1);i++){
            for(int j = (i+1); j < numbers.length; j++){
                result.add(numbers[i] +numbers[j]);
            }
        }

        Collections.sort(result);
//      반복되는 값을 제거한다. 
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
