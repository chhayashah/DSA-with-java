public class FunctionBinToDec {

    public static void BinaryToDecimal(int n){
        int decimal=0;
        int power=0;

        while(n>0){
            int lastdigit = n % 10;
            decimal=decimal + (lastdigit * (int)Math.pow(2,power));
            power++;
            n=n/10;

        }
    
        System.out.println("decimal of" + n +"=" + decimal);

    }

    public static void main(String[] args){
        BinaryToDecimal(101);
    }
}
