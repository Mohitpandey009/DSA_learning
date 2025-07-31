package stack.rainWaterTrap.optimalApproch;

public class Main {
    public static void main(String[] args) {
        // int arr[] = {4,2,0,8,0,2};
        int arr[] = {4,2,0,8,8,2};
        int len = arr.length;
        int total = 0;    
        int f = 0,r = len-1;
        int leftmax = 0;
        int rightmax = 0;
        while (f<r) {
            leftmax = Math.max(leftmax, arr[f]);
            rightmax = Math.max(rightmax,arr[r]);
            if (leftmax>rightmax) {
                total+=rightmax-arr[r]; 
                r--;
            }else{
                total+=leftmax-arr[f];
                f++;
            }
        }
        System.out.println(total);
    }
}
