// 대문자를 소문자로 소문자를 대문자로 바꾸기
// https://coding-factory.tistory.com/533

// 문자열 슬라이싱 하기
//https://dion-ko.tistory.com/66

// String Builder
//https://onlyfor-me-blog.tistory.com/317

public class Q21 {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        int idx = 0;
        for (int i = 0;i < s.length();i++){
            String targetStr = s.substring(i,i+1);
            if(targetStr.equals(" ")) {
                idx = 0;
                answer.append(" ");
            }
            else{
                answer.append(new StringBuilder((0 == (idx % 2)) ? targetStr.toUpperCase() : targetStr.toLowerCase()));
                idx += 1;
            }
        }
        return answer.toString();
    }

//    public String solution(String s) {
//        String answer = "";
//
////      공백기준 슬라이싱
//        String [] array = s.contains(" ")? s.split(" "): new String[]{s};;
//        int i = 0;
//        for (String target : array){
//            String word ="";
//            for(int j = 0; j<target.length(); j++){
//                word = ((j % 2) == 1) ? (word + target.substring(j, j + 1).toLowerCase()) : (word + (target.substring(j, j + 1).toUpperCase()));
//            }
//            if (i == 0) {
//                answer += word;
//            } else {
//                answer = answer + " " + word;
//            }
//            i +=1;
//        }
//
//        return answer;
//    }


    public static void main(String[] args) {
        String test = "Process finished with  exit code  ";
        System.out.println(Q21.solution(test));
    }
}
