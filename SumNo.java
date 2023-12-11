
import java.util.Scanner;
public class SumNo {
    // public static void main(String[] args){
    //     int n=10;
    //     int sum=0;
    //     for(int i=1;i<=n;i++){
    //        sum=sum+i;
    //     }
    //     System.out.println(sum);
    // }
    public static void main(String[] args){
        int sum=0;

        Scanner.sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
