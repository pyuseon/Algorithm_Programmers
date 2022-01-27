import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q35 {
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");

        String[] targetalpha = new String [strings.length];

        for(int i = 0; i < strings.length; i++){
            targetalpha[i] = strings[i].substring(n, n+1);
        }

        int idx = 0;
        // n번째 알파벳이 같은 것들만 가져옴
        for(String matchAlpha : alphabet){
            ArrayList<String> targetArray = new ArrayList<String>();
            for(int i = 0 ; i < targetalpha.length; i++){
               if(matchAlpha.equals(targetalpha[i])){
//                   n번째 알파벳이 같은 문자열들을 Arraylist에 넣어줌
                   targetArray.add(strings[i]);
               }
            }
//            n번째 알파벳이 같은 문자열이 담긴 Arraylist를 정렬함
            Collections.sort(targetArray);

//            Arraylist의 길이가 값이 0이 아니라면 answer에 넣어줌
            if(targetArray.size() != 0){
               for(int aIdx = 0; aIdx < targetArray.size(); aIdx ++){
                   answer[idx] = targetArray.get(aIdx);
                   idx +=1;
               }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        String [] test1 = {"abce", "abcd", "cdx"};
        System.out.println(Arrays.toString(Q35.solution(test1,2)));
    }

}
