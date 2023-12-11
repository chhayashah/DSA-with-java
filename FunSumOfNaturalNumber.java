public class FunSumOfNaturalNumber {

    public static int SumOfNaturalNumber(int n){
        int sum=0;

        while (n>0){
            int lastDigit=n%10;
            sum=sum+lastDigit;
            n=n/10;
            //  System.out.println(sum);
        }
        
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args){
        SumOfNaturalNumber(5);
    }
}
