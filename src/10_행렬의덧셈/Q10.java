import java.util.Arrays;

public class Q10 {
    class Solution {
        public static int[][] solution(int[][] arr1, int[][] arr2) {
//            행은 arr.length; 열은 arr[i].length;
            int[][] answer = new int[arr1.length][arr1[0].length];
            for (int row =0;  row < arr1.length; row++){
                for(int col =0; col< arr1[0].length;col++){
                    answer[row][col] = arr1[row][col] + arr2[row][col];
                }
            }

            return answer;
        }

    }
    public static void main(String[] args) {

        int[][] arr1 = {{1,2,3},{3,2,1}};
        int[][] arr2 = {{4,5,6},{7,8,9}};


        System.out.println(Arrays.deepToString(Q10.Solution.solution(arr1,arr2)));
    }
}
