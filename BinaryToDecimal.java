public class BinaryToDecimal {
    public static void BinaryToDecimal(int binNum){
    int myNum = binNum;
    int pow=0;
    int decNum=0;

    while( binNum>0){
        int lastDight =  binNum % 10;
        decNum=decNum + (lastDight = (int)Math.pow(2,pow));

        pow++;
        binNum = binNum/10;


    }
    System.out.println("decimal of" + myNum +"=" + decNum);
}
 public static void main(String[] args){
    BinaryToDecimal(111);
 }
}