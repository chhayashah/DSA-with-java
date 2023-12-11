//  class ParameterziedConstructor {
//     ParameterziedConstructor(int a){
//         System.out.println("parameterized constructor " + a);
//     }

//     public static void main(String[] args){
//         ParameterziedConstructor t= new ParameterziedConstructor(10);
//     }
    
// }

class Employee{


    int a;
    String s;
    Employee(int a, String s)
    {
        this.a=a;
        this.s=s;
    }

    public static void main(String[] args){
        Employee e1=new Employee(11,"ki");
        Employee e2=new Employee(12,"chh");
        System.out.println(e1.a+" "+e1.s);
        System.out.println(e2.a+" "+e2.s);

    }
}
