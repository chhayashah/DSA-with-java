import java.util.Scanner;
public class AverageOfThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double result = average(x,y,z);
        System.out.println(result);
    }
    public static double average(double x, double y, double z){
        return (x+y+z)/3;
    }
}