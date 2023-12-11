public class ArrStringPara {

    public static int FindString(String a[], String b){
        for(int i=0;i<a.length;i++){
            if(a[i].equals(b)){
                return 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        String a[]={"apple","banana","orange","manogo"};
        String b="dosa";

        int index=FindString(a,b);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found");
        }
    }
}
