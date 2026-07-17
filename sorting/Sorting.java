package sorting;


public class Sorting {
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

   public static void selectionSort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        int minIndex=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[minIndex]){
                minIndex=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
   }

   public static void insertionSort(int arr[]) {
       int n = arr.length;
       for (int i = 1; i < n; i++) {
           int curr = i;
           int prev = i - 1;
           int currvalue = arr[i];
           while (prev >= 0 && currvalue < arr[prev]) {
               arr[prev + 1] = arr[prev];
               prev--;
           }
           arr[prev + 1] = currvalue;
       }
   }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 1, 3 };

        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        System.out.println("Printing the array:");
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }
}
