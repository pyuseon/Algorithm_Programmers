//파일 이름 왼쪽 하단 모서리에 ‘J’가있는 빨간색 원
//http://daplus.net/java-intellij%EC%97%90%EC%84%9C%EC%9D%B4-%EA%B8%B0%ED%98%B8%EB%8A%94-%EB%AC%B4%EC%97%87%EC%9D%84-%EC%9D%98%EB%AF%B8%ED%95%A9%EB%8B%88%EA%B9%8C-%ED%8C%8C%EC%9D%BC-%EC%9D%B4%EB%A6%84-%EC%99%BC/
//인텔리제이 git에의한 파일 색상 구분법
//https://otrodevym.tistory.com/entry/intellij-%EC%9D%B8%ED%85%94%EB%A6%AC%EC%A0%9C%EC%9D%B4%EC%97%90%EC%84%9C-git%EC%97%90-%EC%9D%98%ED%95%9C-%ED%8C%8C%EC%9D%BC-%EC%83%89%EC%83%81-%EA%B5%AC%EB%B6%84-%EB%B0%A9%EB%B2%95
//문자열이 숫자인지 확인하기
//https://www.delftstack.com/ko/howto/java/how-to-check-if-a-string-is-a-number-in-java/#java%EC%97%90%EC%84%9C-double-%ED%81%B4%EB%9E%98%EC%8A%A4%EB%A5%BC-%EC%82%AC%EC%9A%A9%ED%95%98%EC%97%AC-%EB%AC%B8%EC%9E%90%EC%97%B4%EC%9D%B4-%EC%88%AB%EC%9E%90%EC%9D%B8%EC%A7%80-%ED%99%95%EC%9D%B8
// try, catch 구문
//https://coding-factory.tistory.com/280


public class Q17 {
    static class Solution {
        public static boolean solution(String s) {
            boolean answer = true;
            for (int i =0; i < s.length(); i++){
                if (!Character.isDigit(s.charAt(i))) {
                    answer = false;
                }
            }
            if(s.length() != 4 & s.length() !=6) answer = false;
            return answer;
        }
    }

//    class Solution {
//        public boolean solution(String s) {
//            if(s.length() == 4 || s.length() == 6){
//                try{
//                    int x = Integer.parseInt(s);
//                    return true;
//                } catch(NumberFormatException e){
//                    return false;
//                }
//            }
//            else return false;
//        }
//    }

    public static void main(String[] args) {
        String str= "234";
        System.out.println(Q17.Solution.solution(str));
    }
}
