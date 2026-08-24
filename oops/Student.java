public class Student {
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public static void main(String[] args) {
        // Student s = new Student();
        // s.name = "chhaya";
        // s.age = 24;
        // s.course = "btech";
        Student s = new Student("chhaya", 24, "Btech");

        System.out.println(s.name + " " + s.age + " " + s.course);

        // Student s2 = new Student();
        // s2.name = "kiran";
        // s2.age = 19;
        // s2.course = "bpharma";
        Student s2 = new Student("Kiran", 19, "BPharma");
        System.out.println(s2.name + " " + s2.age + " " + s2.course);
    }
}
