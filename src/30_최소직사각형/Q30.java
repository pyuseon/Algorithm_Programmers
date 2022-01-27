//ArrayList 최대 최소값 구하기
//https://hianna.tistory.com/571
//ArrayList 사용하기
//https://sin0824.tistory.com/12

import java.util.ArrayList;
import java.util.Collections;

public class Q30 {
    public static int solution(int[][] sizes) {
        int answer = 0;
        ArrayList<Integer> longer = new ArrayList<Integer>() ;
        ArrayList<Integer> shorter = new ArrayList<Integer>();

        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                longer.add(sizes[i][0]);
                shorter.add(sizes[i][1]);
            }else{
                longer.add(sizes[i][1]);
                shorter.add(sizes[i][0]);
            }
        }
        int longmax = Collections.max(longer);
        int shortmax = Collections.max(shorter);

        return longmax*shortmax;
    }


    public static void main(String[] args) {
        int [][] test = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(Q30.solution(test));
    }
}
