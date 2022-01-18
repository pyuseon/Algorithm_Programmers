import java.util.Arrays;

public class Q24 {
    public static long solution(long n) {
        String answer = "";
        String strN = Long.toString(n);
        long [] arr = new long [strN.length()];
        for (int i =0;i < strN.length();i++) {
            arr[i] = Long.parseLong(String.valueOf(strN.charAt(i)));
            System.out.println(String.valueOf(strN.charAt(i)));
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            answer += Long.toString(arr[arr.length-(i+1)]);
        }
        long l = Long.parseLong(answer);
        return l;
    }


    public static void main(String[] args) {
        long test = 118372;
        System.out.println(Q24.solution(test));
    }
}
