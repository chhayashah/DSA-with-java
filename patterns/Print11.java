import java.util.*;

public class Print11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print2(n);
        sc.close();
    }

    
    public static void print2(int n) {
        int start = 1;
        for (int i = 0; i <n; i++) {
            if (i%2==0)
                start = 1;
            else
                start = 0;
            for (int j = 1; j <i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
