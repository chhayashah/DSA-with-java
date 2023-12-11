import java.util.Scanner;
public class Fact {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fac=1;
        for(int i=1;i<=a;i++){
            fac=fac*i;
        }
        System.out.println(fac);
    }
}
