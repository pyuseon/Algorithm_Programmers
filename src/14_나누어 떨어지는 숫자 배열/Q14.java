import java.util.Arrays;

public class Q14 {

//    https://crazykim2.tistory.com/462 오름차순 내림 차순
//    https://hianna.tistory.com/564 특정값 삭제
//    https://ldelight.tistory.com/74 for 문 사용법 두가지
//    https://ilovejinwon.tistory.com/54  array를 list로 바꾸기
    class Solution {
        public static int[] solution(int[] arr, int divisor) {
            int count = 0;
            for(int j = 0; j <arr.length;j++){
                if(arr[j] % divisor == 0){
                    count += 1;
                }
            }
            System.out.println(count);

            int[] answer = count==0? new int [1] : new int[count];
            if(count == 0) answer[0] = -1;

            System.out.println(Arrays.toString(answer));

            int idx = 0;
            for (int i = 0 ; i <arr.length;i++){
                if (arr[i] % divisor == 0){
                    System.out.println(arr[i]);
                    answer[idx] = arr[i];
                    idx += 1;
                }
//                answer[i] = arr[i] % divisor == 0? arr[i]:0;
            }
            Arrays.sort(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        int [] arr = { 9, 7};
        int divisor = 5;
        System.out.println(Arrays.toString(Q14.Solution.solution(arr, divisor)));
    }

}
