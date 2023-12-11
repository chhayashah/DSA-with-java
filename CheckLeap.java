import java.util.Scanner;
public class CheckLeap {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
            int year=sc.nextInt();
            boolean x=(year %  4) == 0;
            boolean y=(year % 100) !=0;
            boolean z=((year % 100 == 0) && (year % 400 == 0));
            if (x && (y || z )){
                System.out.println("leap year");
            }
            else{
                System.out.println("not a leap year");
            }













            // if(year%4==0){
            //     if(year%100==0){
            //         if(year%400==0){
            //             System.out.println(" leap year");
            //         }
            //         else{
            //             System.out.println("not a leap year");
            //         }
            //     }else{
            //        System.out.println(" leap year"); 
            //     }
            // }else{
            //     System.out.println("not a leap year");
            // }
        }
    }

