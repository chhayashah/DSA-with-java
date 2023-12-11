import java.util.*;
public class LargestNumber {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;//-infinity

        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }



    public static void main(String args[]){
        int numbers[]={2,4,5,6,7,8,9};
        System.out.println("largest value is : " + getLargest(numbers));
    }
    
}
