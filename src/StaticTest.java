public class Student {

    private static int serialNum = 1000; //static 변수

    public String name; //이름
    public int id; //학번
    public int address; //주소

    public Student(String name) {
        this.id = serialNum;
        this.name = name;
        serialNum++;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public void showInfo() {
        System.out.println("학번: " + id);
        System.out.println("이름: " + name);
    }
}


class StudentTest {
    public static void main(String[] args) {

        Student studentPark = new Student("Park");
        Student studentLee = new Student("Lee");

        studentPark.showInfo();
        studentLee.showInfo();
    }
}