public class Isprime {
    // public static boolean isPrime(int n){
    //     // corner cases
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    // optimized solution
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i =0;i<=Math.sqrt(n);i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPrime(7));
    }
}
