import java.util.*;
public class Arr {

    public static void main(String[] args){
        int marks[]=new int[100];

        System.out.println(marks.length);

        Scanner sc=new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();



        System.out.println("math mark" + "=" + marks[0]);
        System.out.println("hindi mark" + "=" + marks[1]);
        System.out.println("english mark" + "=" + marks[2]);
        marks[2]=100;
        System.out.println("english mark" + "=" + marks[2]);

        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("the percentage of three subject" + "=" + percentage +"%");
    }
    // System.out.println("math mark" + "=" + marks[0]);
    // System.out.println("hindi mark" + "=" + marks[1]);
    // System.out.println("english mark" + "=" + marks[2]);
    
}
