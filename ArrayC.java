
import java.util.*;
public class ArrayC {
    public static void main(String[] args){
        int marks[]=new int[100];// empty size hai our ye zero value leta hai initial me
        // int number[]={1,2,3};//size 3

        Scanner sc=new Scanner(System.in);

        System.out.println(marks.length);

        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//math

        System.out.println("phy " + marks[0]);
        System.out.println("chem " + marks[1]);
        System.out.println("math " + marks[2]);

        // updation
        marks[2]=100;
        System.out.println("math " + marks[2]);

        int percentage = ((marks[0]+marks[1]+marks[2])/3);
        System.out.println("percentage = " + percentage + "%");

    }
}
