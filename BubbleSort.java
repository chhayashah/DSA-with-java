public class BubbleSort {
    public static void main(String[] args){
        int temp;
        int a[]={12,34,54,65,2,34,54};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
         for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    
}
