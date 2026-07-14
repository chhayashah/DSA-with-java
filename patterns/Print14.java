import java.util.*;

public class Print14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print2(n);
        sc.close();
    }

    public static void print2(int n) {

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n-i-1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
