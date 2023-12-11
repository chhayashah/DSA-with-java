import java.util.Scanner;
public class palindromee {
    public static void main(String[] args){
        int rem;
        int rev=0;
        Scanner sc=new Scanner(System.in);
        int palindrome=sc.nextInt();

        if(isPalindrome(palindrome)){
           System.out.println("number:"+ palindrome + "is a palindrome");
        }else{
             System.out.println("number:"+ palindrome + "is not a palindrome");
        }
    }
    public static boolean isPalindrome(int number){
        int palindrome=number;
        int rev=0;

        while(palindrome!=0){
            int rem=palindrome % 10;
            rev= rev * 10 + rem;
            palindrome= palindrome / 10;
        }
        if(number==rev){
            return true;
        }
        return false;
    }
}
