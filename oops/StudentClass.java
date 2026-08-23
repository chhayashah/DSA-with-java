public class StudentClass {

    public static class Student {
        String name;
        int rno;
        double percent;
    }
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "chhaya";
        x.rno = 76;
        x.percent = 92.5;
        System.out.println(x.name);
        System.out.println(x.rno);
        System.out.println(x.percent);

        Student y = new Student();
        y.name = "kiran";
        y.rno = 34;
        y.percent = 45.5;
        System.out.println(y.name);
        System.out.println(y.rno);
        System.out.println(y.percent);
    }
}