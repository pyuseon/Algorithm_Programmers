import java.util.Arrays;
import java.util.LinkedList;

public class Q11 {

    public static long[] solution(int x, int n) {
//        long[] answer = new long [n];
//        for (int i = 0; i < n; i++){
//            answer[i] = x*(i+1);
//        }
//        return answer;
//    }

//        long과 int의 차이 찾아보기

        long[] answer = new long[n];
        long temp = x;

        for (int i = 0; i < n; i++) {
            answer[i] = temp * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Q11.solution(-10000000,1000 )));
    }

}
