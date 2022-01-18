//해쉬맵
//https://sin0824.tistory.com/13
//해쉬 value만 가져오기
//https://hianna.tistory.com/573

import java.util.HashMap;
import java.util.Map;

public class Q20 {

    //    static class Solution {
//        public static String solution(String[] participant, String[] completion) {
//            Map<Integer, String> pMap = new HashMap<Integer, String>();
//            int i = 0;
//            for (String target : participant) {
//                pMap.put(i, target);
//                i += 1;
//            }
//            Map<Integer, String> cMap = new HashMap<Integer, String>();
//            i = 0;
//            for (String target : completion) {
//                cMap.put(i, target);
//                i += 1;
//            }
//
//            for (int pidx = 0; pidx < participant.length; pidx++) {
//                for (int cidx = 0; cidx < completion.length; cidx++) {
//                    String ptarget = pMap.get(pidx);
//                    String ctarget =  cMap.get(cidx);
//                    if (ptarget.equals(ctarget)) {
//                        cMap.remove(cidx);
//                        pMap.remove(pidx);
//                        break;
//                    }
//                }
//            }
//            Map.Entry<Integer,String> entry = pMap.entrySet().iterator().next();
//            return entry.getValue();
//        }
//    }

    static class Solution {
        public static String solution(String[] participant, String[] completion) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            String answer = "";
            int val = 0;

            for (String player : participant) {
                if (map.get(player) == null) {
                    map.put(player, 1);
                } else {
                    val = map.get(player);
                    map.put(player, val + 1);
                }
            }
            for (String complete : completion) {
                val = map.get(complete) - 1;
                map.put(complete, val);
            }
            for (String key : map.keySet()) {
                if (map.get(key) == 1) answer = key;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        String[] ex1 = {"Jane", "Kim", "Park"};
        String[] ex2 = {"Jane", "Kim"};
        System.out.println(Solution.solution(ex1, ex2));
    }
}
