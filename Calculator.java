public class Calculator {
    public static void main(String[]args){
        int a=10;
        int b=30;
        int res;
        String symbol="-";
        switch(symbol){
            case "+":
            res=a+b;
            System.out.println(res);
            break;
            case "-":
            res=a-b;
            System.out.println(res);
            break;
            case "*":
            res=a*b;
            System.out.println(res);
            break;
            case "/":
            res=a/b;
            System.out.println(res);
            break;
        }
    }
}
