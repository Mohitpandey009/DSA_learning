package sorting.mergeSort;
import java.util.ArrayList;

public class Sorting {
    public static void main(String[] args) {
        int [] arr = {10,3,7,8,-2,22,1};
        int size = arr.length;
        divideMerge(arr,0,size-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void divideMerge(int arr[],int start,int end){
         if (start>=end) return;

        int mid = (start+end)/2;
        divideMerge(arr,start,mid);
        divideMerge(arr,mid+1,end);
        sort(arr, start, end, mid);
    }

    static void sort(int arr[],int start,int end,int mid){
        ArrayList<Integer>temp = new ArrayList<>();
        int left = start;
        int rigth = mid+1;

        while (left<=mid && rigth<=end) {
            if (arr[left]<=arr[rigth]) {
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[rigth]);
                rigth++;
            }
        }
        while (left<=mid) {
            temp.add(arr[left]);
            left++;
        }
        while (rigth<=end) {
            temp.add(arr[rigth]);
            rigth++;
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[start + i] = temp.get(i);
        }
    }
}
