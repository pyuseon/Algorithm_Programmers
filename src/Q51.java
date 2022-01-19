import java.util.Arrays;

public class Q51 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        String[][] base2 = new String [2][n];
        String s = "0";
        for(int i = 0; i < n; i++){
            if(Integer.toString(arr1[i],2).length() != n){
                int repNum = n - Integer.toString(arr1[i],2).length();
                base2[0][i] = s.repeat(repNum) +Integer.toString(arr1[i],2);
            }else{
                base2[0][i] = Integer.toString(arr1[i],2);
            }
            if(Integer.toString(arr2[i],2).length() != n){
                int repNum = n - Integer.toString(arr2[i],2).length();
                base2[1][i] = s.repeat(repNum) +Integer.toString(arr2[i],2);
            }else{
                base2[1][i] = Integer.toString(arr2[i],2);
            }

        };
//        for(int i = 0; i < n; i++){
//
//                base2[0][i] = String.format("%5s",Integer.toString(arr1[i],2));
//
//                base2[1][i] = Integer.toString(arr2[i],2);
//
//
//        };

        System.out.println(Arrays.deepToString(base2));

        for(int targetStr = 0; targetStr <n; targetStr ++){
            String map = "";
            for(int strIdx = 0; strIdx < n; strIdx ++){
                String firstStr = base2[0][targetStr];
                String secondStr = base2[1][targetStr];
                String char1 = firstStr.substring(strIdx, strIdx+1);
                String char2 = secondStr.substring(strIdx, strIdx+1);
                map += (char1.equals("1") || char2.equals("1"))? "#": " ";
            }
            answer[targetStr] = map;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int arr1[] = {9, 20, 28, 18, 11};
        int arr2[] = {30, 1, 21, 17, 28};
        System.out.println(Arrays.deepToString(Q51.solution(n, arr1, arr2)));
    }
}
