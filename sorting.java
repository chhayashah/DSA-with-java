public class sorting {
    
    public static void main(String[] args){
        int min;
        int temp;
        int a[]={12,2,33,43,54,1,22,44};
       for(int i=0;i<a.length;i++){
        min=i;
        for(int j=i+1;j<a.length;j++){
            if(a[j]<a[min]){
                min=j;
            }

        }
        temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    }
    System.out.println(a);

    }
    
}
