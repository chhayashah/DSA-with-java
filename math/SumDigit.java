package math;

public class SumDigit {


    public static void main(String[] args) {
        int num=53127;
        int sum = sumDigit(num);
        System.out.println(sum);
    }
    
    public static int sumDigit(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
}
}

