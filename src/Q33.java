import java.util.Arrays;

public class Q33 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int cnt0 = 0;
        int cntmatch = 0;
        for(int lottoNum : lottos){
            if(lottoNum == 0){
                cnt0 += 1;
            }else{
                for(int winNum : win_nums){
                    if(lottoNum == winNum){
                     cntmatch += 1;
                    }
                }
            }
        }
        System.out.println(cnt0);
        System.out.println(cntmatch);

        answer[0] = ((cntmatch == 0) & (cnt0 == 0)) ? 6 : (((cntmatch + cnt0) - 7) * -1);
        answer[1] = (cntmatch == 0)? 6:(cntmatch-7)*-1;
        return answer;
    }


    public static void main(String[] args) {
        int [] test1 = {44, 1, 0, 0, 31, 25};
        int [] test2 = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(Q33.solution(test1, test2)));
    }
}
