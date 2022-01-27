public class StaticTest {

    public static void main(String[] args) {

        Static.all_sumf(); // 객체 생성 없이 호출이 가능
        Static.all_sumf(); // 객체 생성 없이 호출이 가능

        Static st1 = new Static();
        st1.each_sumf();
        st1.all_sumf();

        Static st2 = new Static();
        st2.each_sumf();
        st2.all_sumf();
    }
}

class Static {
    private static int all_sum = 0;
    private int each_sum = 0;

    public static void all_sumf () {
        all_sum = all_sum + 1;
        System.out.println("all_sum " + all_sum);
    }

    public void each_sumf () {
        each_sum = each_sum + 1;
        System.out.println("each_sum " + each_sum);
    }
}