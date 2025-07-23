package sorting.quickSort;

public class Main {
    public static void main(String[] args) {
        int [] arr = {22,-3,4,4,9,1,-5};
        QuickSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

     static void QuickSort(int arr[],int start,int end){
        if (start<end) {
            int pivoteInd = Partition( arr, start, end);
            QuickSort(arr,start,pivoteInd-1);
            QuickSort(arr,pivoteInd+1,end);
        }
    } 

    static int Partition(int arr[],int start,int end){
        int i = start-1;
        int pivot = arr[end];

        for(int j=start;j<end;j++){
            if (arr[j]<=pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp  = arr[end];
        arr[end] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }

}
