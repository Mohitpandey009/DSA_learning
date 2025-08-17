package stack.productOfSubarray;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2};
        long mul = 1L;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    
                    // System.out.print(arr[k]+" ");
                    mul*=arr[k];
                }
            }
        }
        System.out.println(mul);
    }
}
