package math;

public class checkPerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(6));
    }

    public static boolean checkPerfectNumber(int num) {
        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if(num%i==0){
            int firstFactor = i;
            int secondFactor = num / i;
            sum = sum + firstFactor + secondFactor;
        }
    }if(sum==num){
        return true;
    }else
    {
        return false;
    };
}
