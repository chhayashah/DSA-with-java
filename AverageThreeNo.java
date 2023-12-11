public class AverageThreeNo {
    // int a,b,c;
    public static int average(int a,int b, int c){
        int aver=(a+b+c)/3;
        return aver;
    }
    public static void main(String[] args){
        int e=9;
        int f=8;
        int j=6;
        int aver=average(e, f, j);
        System.out.println(aver);
    }
}
