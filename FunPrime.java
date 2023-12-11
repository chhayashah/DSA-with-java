public class FunPrime {

    // public static boolean isPrime(int n){


    //     if(n==2){
    //         return true;
    //     }

    //     for(int i=2; i<=n-1;i++){
    //         if(n % i==2){
                
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    // optimized code

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPrime(12));
    }
    
}
