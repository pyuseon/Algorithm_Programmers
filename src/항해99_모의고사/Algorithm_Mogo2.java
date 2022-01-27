//성륜이는 오늘 항해99를 시작했다. 성격이 급한 성륜이는 항해 1일 차부터 언제 수료를 하게될 지 궁금하다.
//
//항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.

// 1 ≤ month ≤ 12
// 1 ≤ day ≤ 31 (2월은 28일로 고정합니다, 즉 윤일은 고려하지 않습니다.)

// 11	27	“3월 5일”
// 6	22	“9월 28일”

// 지정입력값
// 1    18  "4월 26일"

public class Algorithm_Test2 {
    public static String solution(int month, int day)  {
//        월을 일자로 다 변환하기 위해서  totalDate 변수를 만들어줌
        int totalDate = 0;
        int addDate = 98;
//       월별 일자의 수 어레이로 추가함.
        int monthdays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//       월별 일자를 totalDate에 더해서 총 일수를 계산함.
        for(int i = 0; i < (month - 1); i++){
            totalDate += monthdays[i];
        }

//        해당 월의 일수는 따로 추가해줌
        totalDate += day;

        int targetDate = totalDate + addDate;
        int idx = 0;

        while (true) {
            if (targetDate < (monthdays[(idx % 12)] + 1)) {
                idx += 1;
                break;
            } else {
                targetDate -= monthdays[(idx % 12)];
                idx += 1;
            }
        }
        return (idx%12) + "월 " + targetDate + "일";
    }
        public static void main(String[] args)  {
            Algorithm_Test2 method = new Algorithm_Test2();
            System.out.println(solution(11, 27));
        }
}
