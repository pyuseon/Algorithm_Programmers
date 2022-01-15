import java.time.LocalDate;
import java.util.Arrays;

public class Q13 {
    class Solution {
        public static String solution(int a, int b) {
//            1월 1일이 금요일이므로 금요일 부터 시작
            String weekdays [] ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
            int daysum = 0;
            int monthdays[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

//            달에 따라 총 일자를 계산함
            for (int i = 0; i< a-1 ;i++){
                daysum += monthdays[i];
            }
            daysum += b-1;
//            7일의 패턴에 따라 요일을 배정함.
            return weekdays[(daysum%7)];
        }
    }

//    답안 2
//    class Solution {
//        public static String solution(int a, int b) {
////            System.out.println(LocalDate.of(2016, a, b));
////            System.out.println(LocalDate.of(2016, a, b).getDayOfWeek());
//            return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
//        }
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new String[]{Solution.solution(11, 11)}));
    }
}
