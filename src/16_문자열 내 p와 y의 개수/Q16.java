import java.util.Arrays;
//== 과 eaquals의 차이
//https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/

public class Q16 {
    static class Solution {
        static boolean solution(String s) {
            boolean answer = true;
            int pcount = 0;
            int ycount = 0;

            for (int i =0; i < s.length(); i++){
                String target = s.substring(i, i+1);
                System.out.println(target);
                if (target.equals("P")|| target.equals("p")){
//                    System.out.println(target.equals("p"));
//                    System.out.println(target == "p");
                    pcount += 1;
                }
//                target == "Y"|| target =="y" 이건 왜 안될까? ㅠㅡㅠ
                if (target.equals("Y")|| target.equals("y")){
                    ycount += 1;
                    System.out.println(target.equals("y"));
                    System.out.println(target == "y");
                }
            }
            answer = pcount == ycount ? true:false;
            int a = 0;
            if(pcount == a & ycount ==a) answer = true;
            return answer;
        }
    }

    public static void main(String[] args) {
        String str= "Pooo";
        System.out.println(Arrays.toString(new boolean[]{Solution.solution(str)}));
    }

}
