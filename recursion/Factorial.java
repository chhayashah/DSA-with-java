

public class Factorial {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        long ans = factorial(5);
        System.out.println(ans);
    }
    
    public static long factorial(int num) {
        if (num == 0) {
            return 1;
        }
        long ans = num * factorial(num - 1);
        return ans;
    }
}