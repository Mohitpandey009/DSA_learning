package stack.rainWaterTrap.better;

public class Main {
    public static void main(String[] args) {
        int arr[] = {4,2,0,0,0,2};
        int len = arr.length;
        int total = 0;
        int leftmax[] = new int[len];
        int rightmax[] = new int[len];
        leftmax[0] = arr[0];
        for(int i=1;i<len;i++){
            leftmax[i] = Math.max(leftmax[i-1],arr[i]);
        }
        rightmax[len-1] = arr[len-1];
        for(int i=len-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],arr[i]);
        }

        for(int i=0;i<len;i++){
            int min = Math.min(rightmax[i],leftmax[i]);
            total+=min-arr[i];
        }
        System.out.println(total);
    }
}