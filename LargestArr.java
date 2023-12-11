import java.util.*;
public class LargestArr {

    public static int Largest(int numbers[]){
        
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            
        }
        return largest;
    }
    

    public static void main(String[] args){
        int numbers[]={1,3,4,65,7,7,8};
        System.out.println(Largest(numbers));
    }
}
