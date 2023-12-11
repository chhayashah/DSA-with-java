import java.util.Scanner;
public class SumOFEvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int even=0;
        int odd=0;
        for(int i=0;i<=a;i++){
            if(a%2==0){
                even=even+i;
                
            }
            else{
               odd=odd+i;
            }
        }
        System.out.println(even );
        System.out.println(odd);
    }
}

