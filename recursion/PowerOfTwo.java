public class PowerOfTwo {

        public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);

            int ans = PowerOfTwo(5);
            System.out.println(ans);
        }

        public static int PowerOfTwo(int num) {
            if (num == 0) {
                return 1;
            }
            int ans = 2 * PowerOfTwo(num - 1);
            return ans;
        
    }
}
