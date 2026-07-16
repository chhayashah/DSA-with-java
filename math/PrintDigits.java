package math;

public class PrintDigits {

    public static void main(String[] args) {
        int num=53127;
        printDigit(num);
    }
    
    public static void printDigit(int num){
        while(num!=0){
            int digit=num%10;
            System.out.println(digit);
            num=num/10;
        }
}
}
