public class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public int calculateAnnualSalary() {
        return salary * 12;
    }
    
    public static void main(String[] args) {

        Employee e1 = new Employee("chhaya", 101, 50000);
        // System.out.println(e1.name + " " + e1.id + " " + e1.salary);

        e1.displayDetails();
        System.out.println("Annual salary: " + e1.calculateAnnualSalary());

        Employee e2 = new Employee("kiran", 102, 45000);
        // System.out.println(e2.name + " " + e2.id + " " + e2.salary);

        e2.displayDetails();
        System.out.println("Annual salary: " + e2.calculateAnnualSalary());
    }
}
