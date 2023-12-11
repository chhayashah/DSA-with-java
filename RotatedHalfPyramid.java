public class RotatedHalfPyramid {
    public static void rotated_pyramid(int n){
        for(int i=0;i<=n;i++){
            // space
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            
       
        // start
        for(int j=1;j<=i;j++){
            System.out.println("*");
        }
        System.out.println();
    }  
 }
 public static void main(String args[]){
    rotated_pyramid(6);
 }
 }
