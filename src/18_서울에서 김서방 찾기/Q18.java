public class Q18 {
    private static Q18 Solution;

    static public String solution(String[] seoul) {
        String answer = "";
        int i = 0;
        for(String target: seoul){
            if(target.equals("Kim")) answer = String.valueOf(i);
            i+=1;
        }

        return "김서방은 "+answer + "에 있다";
    }


//    public String  Q18 Solution(String[] seoul){
//        //x에 김서방의 위치를 저장하세요.
//        return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim") + "에 있다";
//    }


    public static void main(String[] args) {
        String [] ex = {"Jane", "Kim"};
        System.out.println(Q18.Solution.solution(ex));
    }
}
