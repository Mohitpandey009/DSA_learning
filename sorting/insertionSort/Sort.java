package sorting.insertionSort;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,1,4,3,3};
        // int arr[] = {1,2,3,4,5,6,7,8};
        int size = arr.length;
        sort(arr, size);
        // System.out.println(size);

        for (int i : arr) {
            System.out.println(i);
        }
    }
            // {9,8,7,6,5,4,3,3}
    static void sort(int arr[],int size){
        for(int i=1;i<size;i++){
            // System.out.println(i);
            int j = i;
            while (j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}