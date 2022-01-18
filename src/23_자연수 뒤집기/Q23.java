import java.util.Arrays;

//java long to string
//https://everlikemorning.tistory.com/entry/JAVA-long%ED%98%95%EC%9D%84-String%EC%9C%BC%EB%A1%9C-%ED%98%95%EB%B3%80%ED%99%98
//java charAt
//https://colossus-java-practice.tistory.com/31
//java 문자열 뒤집기
//https://yangbox.tistory.com/59
// string Buffer 자료형
//https://wikidocs.net/276

public class Q23 {
    public static int[] solution(long n) {
        String s = Long.toString(n);
        int[] answer = new int [s.length()];

        StringBuffer sb = new StringBuffer(s);
        String revStr = sb.reverse().toString();

        for (int i = 0;i < revStr.length();i++){
//           위의 변수선언 부분에서 answer를 int로 선언해 주었기 때문에 자료형 변환이 필요하다.
            answer[i] = Integer.parseInt(revStr.substring(i, i+1));
        }
        return answer;
    }

    public static void main(String[] args) {
        long test = 12345;
        System.out.println(Arrays.toString(Q23.solution(test)));
    }
}
