import java.util.stream.IntStream;

//https://knight76.tistory.com/entry/IntStream-LongStream%EC%9D%98-%EB%B2%94%EC%9C%84-range-rangeClose-%EC%B0%A8%EC%9D%B4-%EB%B0%8F-%EC%98%88%EC%A0%9C
public class Q4 {
    public static long solution(int a, int b) {
        long answer = 0;
        if (a < b){
            int[] range = IntStream.rangeClosed(a, b).toArray();
            for (int i = 0; i < range.length; i++) {
                answer += range[i];
            }
            return answer;
            }else if (b < a){
            int[] range = IntStream.rangeClosed(b, a).toArray();
            for (int i = 0; i < range.length; i++) {
                answer += range[i];
            }
            return answer;
        }
        else{ return a;
        }
    }


    public static void main(String[] args) {
        System.out.println(solution(10,-11));
    }
}
