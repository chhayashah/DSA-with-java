import java.util.*;

public class Print12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print2(n);
        sc.close();
    }

    public static void print2(int n) {
        int num = 1;
        for (int i = 0; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(num+ " ");
                num = num+1;
            }
            System.out.println();
        }
    }
}
