public class FunPalindrome {

    public static void Palindrome(int n){
        int rem;
        int temp=n;
        int rev=0;

        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not a palindrome");
        }
    }
    public static void main(String args[]){
        Palindrome(121);
    }
    
}
