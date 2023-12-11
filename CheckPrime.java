public class CheckPrime {
    public static void main(String[] args){
        int a=9;
        int temp=0;
        for(int i=2;i<=a-1;i++){
            if(a%i==0){
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println(a+"no is prime no.");
        }
        else{
            System.out.println(a+"no is not prime no;");
        }
    }
}
