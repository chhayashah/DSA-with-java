package math;

public class reverseNumber {
    public static void main(String[] args) {
        int num = 53127;
        int rev = rev(num);
        System.out.println(rev);
    }

    public static int rev(int num) {
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }
        return revNum;
    }
}
