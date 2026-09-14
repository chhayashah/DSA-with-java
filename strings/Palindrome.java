public class Palindrome{
    public static void main(String[] args) {

        String str = "madam";
        // String ch = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        //  ch=ch+str.charAt(i);
        // }
        // if (ch.equals(str)) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("not Palindrome");
        // }

        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
   
   
    }
}