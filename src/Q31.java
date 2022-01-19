import java.util.ArrayList;

public class Q31 {
    public static ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        for(int i = 0; i < arr.length-1; i++){
          if ((arr[i] != arr[i + 1])){
                answerList.add(arr[i]);
            }
        }
        answerList.add(arr[arr.length-1]);
        return answerList;
    }


    public static void main(String[] args) {
        int [] test = {1,1,3,3,0,1,1};
        System.out.println(Q31.solution(test));
    }
}
