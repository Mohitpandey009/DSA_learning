package sorting.selectionSort;

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
        for(int i=0;i<size;i++){
            int min = i;
            for(int j=i;j<size;j++){
                if (arr[min]>arr[j]) {
                    min = j;
                }
            }
            if(min!=i){
                int temp = arr[i];
                arr[i]  = arr[min];
                arr[min] = temp;
            }
        }
    }
}
