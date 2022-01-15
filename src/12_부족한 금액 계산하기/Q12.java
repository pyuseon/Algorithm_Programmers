import java.util.Arrays;

public class Q12 {
    class Solution {
        public static long solution(int price, int money, int count) {
            long answer = -1;
            long price2 = price, money2 = money, count2 = count;
            long total = (count2*(price2+price2*count2))/2;
            answer = total > money? total-money: 0;
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Q12.Solution.solution(2500,1000000000,2500));
    }
}
//1000000000
//2140000000 int가 커버하는 최대 숫자