
// one class multiple function
public class FunctionOverloading {
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }


    // by using datatype
        public static int sum(int a,int b){
            return a+b;
        }
        public static float sum(float a,float b){
            return a+b;
        }


    public static void main(String[] args){
        System.out.println(sum(5,4));
        System.out.println(sum(3.2f,4.8f));
    }
}
