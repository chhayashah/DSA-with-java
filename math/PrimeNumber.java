package math;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 12;
        
        System.out.println(isPrimeOrNot(num));
    }

    public static boolean isPrimeOrNot(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
