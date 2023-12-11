public class HallowRectangle{
    public static void hallow_rec(int totRow, int totCol){
        // outer loop
        for(int i=1;i<=totRow;i++){
            //inner columns
            for(int j=1;j<=totCol;j++){

                if(i==1 || i==totRow || j==1 || j==totCol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        hallow_rec(4,5);
    }
}