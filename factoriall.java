public class factoriall {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[]args){
        System.out.println(factorial(6));
    }
}
