import java.util.Scanner;
public class CheckNo {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a>0){
        System.out.println("positive no.");
    }
    else{
        System.out.println("negative no.");
    }
    }
}