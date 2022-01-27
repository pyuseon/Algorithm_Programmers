import java.util.Arrays;

public class Q36 {
    public static String solution(String s) {
        String str = s.toLowerCase();
        String[] splitStr = str.split("");
        Arrays.sort(splitStr);
        String answer = "";
        for(int i = 0; i < (splitStr.length-1); i++){
            if(splitStr[i] == splitStr[i+1]){
                answer += splitStr[i] += splitStr[i+1].toUpperCase();
            }else{
                answer += splitStr[i];
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String test1 = "Zzbcdefg";
        System.out.println(Q36.solution(test1));
    }
}
