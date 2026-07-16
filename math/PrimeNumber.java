package math;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 12;
        
        System.out.println(isPrimeOrNot(num));
    }

    public static boolean isPrimeOrNot(int num) {
        // optimise solution
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        // for (int i = 2; i <= num - 1; i++) {
        //     if (num % i == 0) {
        //         return false;
        //     }
        // }
        return true;
    }
}
