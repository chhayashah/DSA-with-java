import java.util.*;

public class Print5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print2(n);
        sc.close();
    }

    public static void print2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
