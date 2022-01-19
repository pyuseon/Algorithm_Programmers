//문제 설명
//        임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//        n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//
//        제한 사항
//        n은 1이상, 50000000000000 이하인 양의 정수입니다.


// double 정수 판별법
// http://daplus.net/java-double%EC%9D%B4-%EC%A0%95%EC%88%98%EC%9D%B8%EC%A7%80-%ED%85%8C%EC%8A%A4%ED%8A%B8%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95/
// java 제곱근 구하기
// https://doompok.tistory.com/7
// java round/ceil/floor/ab
//https://itdar.tistory.com/entry/Java-%EC%9E%90%EB%B0%94-Math-class-roundceilfloorabs-%EB%B0%98%EC%98%AC%EB%A6%BC%EC%98%AC%EB%A6%BC%EB%82%B4%EB%A6%BC%EC%A0%88%EB%8C%80%EA%B0%92
// 비트 연산자와 논리 연산자
//https://tomining.tistory.com/150
//25번 문제
//https://programmers.co.kr/learn/courses/30/lessons/12934

public class Q25 {

        public static long solution(long n) {
            long answer = 0;
//           n의 제곱근 구하기
            double sqrtN = Math.sqrt(n);
//            Math.floor : 소수점 아래 자리 수를 버림
//            double.isInfinite : 무한대인지 아닌지를 판별한다.
//            n의 제곱근의 값과 n의 제곱근의 소수점 자리를 버린 값이 같고 n이 무한대가 아니면 제곱근이다.
            if ((sqrtN == Math.floor(sqrtN)) && !Double.isInfinite(sqrtN)) {
                long temp = (long) Math.floor(sqrtN);
                answer = (long) Math.pow(temp+1, 2);
            }else{
                answer = -1;
            }

            return answer;
        }



    public static void main(String[] args) {
        int test = 121;
        System.out.println(Q25.solution(test));
    }


}
