//CS 스터디 팀장이 된 지용이는 팀원들의 연락처를 수집하여 정리하는 도중 문제 하나를 발견했다.
//지용이는 팀원들에게 전화번호를 ‘010-1234-4567’ 양식으로 제출하기를 부탁했지만 ‘01012345678’과 같이 ‘-’ 구분 없이 붙여서 제출한 사람들의 전화번호가 엑셀에서 앞에 0이 사라진 ‘1012345678’로 보이는 것이다.
//꼼꼼한 성격의 지용이는 ‘1012345678’로 저장된 전화번호를 다시 ‘010-1234-5678’ 형식으로 바꾸려고 한다.
//지용이를 도와줄 수 있는 알고리즘을 만들어 보자
//제한 조건
//phone은 length는 10으로 고정됩니다.
//입출력 예
//“1012345678”
//“010-1234-5678”
//지정 입력값
// “1062509911”
// “010-6250-9911”


public class Algorithm_Test1 {
    public static String solution(String phone) {
        return "0" + phone.substring(0, 2) + "-" + phone.substring(2, 6) + "-" + phone.substring(6, 10);
    }

    public static void main(String[] args) {
        Algorithm_Test1 method = new Algorithm_Test1();
        System.out.println(method.solution("1062509911"));
    }
}

