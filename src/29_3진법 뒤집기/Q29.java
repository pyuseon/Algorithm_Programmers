//진법 변환
//https://cornarong.tistory.com/48?category=993289


public class Q29 {
    public static int solution(int n) {
        int answer = 0;
        String base3 = Integer.toString(n,3);
        StringBuffer sb = new StringBuffer(base3);
        String revBase3 = sb.reverse().toString();
        answer = Integer.parseInt(revBase3, 3);
        return answer;
    }


    public static void main(String[] args) {
        long test = 45;
        System.out.println(Q29.solution((int) test));
    }
}
