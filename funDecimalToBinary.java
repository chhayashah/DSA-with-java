public class funDecimalToBinary {

    public static void DecToBin(int n){
        int mynum=n;
        int bin=0;
        int power=0;

        while(n>0){
            int rem = n%2;
            bin=bin+(rem*(int)Math.pow(10,power));
            power++;
            n=n/2;
        }
        System.out.println("decimal number of " + mynum + " = " + bin);

    }
    public static void main(String[] args){
        DecToBin(7);
    }
}
