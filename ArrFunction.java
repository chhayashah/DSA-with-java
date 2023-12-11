public class ArrFunction {

    public static void Update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args){
        int marks[]={45,34,56,66};
        Update(marks);
        for(int i=0;i<marks.length;i++){

        System.out.println(marks[i]);
    }
    System.out.println();
}

}
