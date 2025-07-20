package sorting.bubbleSort;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,3};
        // int arr[] = {1,2,3,4,5,6,7,8};
        int size = arr.length;
        sort(arr, size);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void sort(int arr[],int size){
        for(int i=0;i<size-2;i++){
            // System.out.println(arr[i]);
            int swap = 0;
            for(int j=0;j<size-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = 1;
                }
            }
            if (swap==0) {
                break;
            }
        }
    }
}
