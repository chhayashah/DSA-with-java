public class PrintHello {
    public static void main(String[] args) {
        printHello(5);
    }

    public static void printHello(int n) {
        if (n == 0) {
            return ;
        }
        System.out.println("Hello");
        printHello(n - 1);
    }
}
