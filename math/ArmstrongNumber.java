package math;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(152));
    }
    
    public static boolean isArmstrongNumber(int num) {
        int sum = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            int cubeOfDigit = digit * digit * digit;
            sum = sum + cubeOfDigit;
            num = num / 10;
        }
        if (sum == originalNum) {
            return true;
        } else {
            return false;
        }
    }
}
