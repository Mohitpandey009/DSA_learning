package stack.rainWaterTrap.bruteForce;

public class Main {
    public static void main(String[] args) {
        // brute force method 

        // int arr[] = {4,2,0,8,0,2};
        int arr[] = {4,2,5,8,10,8};
        int len = arr.length;
        int total = 0;
        for(int i=0;i<len;i++){
            int leftmax = 0;
            int rightmax = 0;
            for(int j=i-1;j>=0;j--){
                if(leftmax<arr[j]){
                    leftmax = arr[j];
                }
            }

            for(int k=i+1;k<len;k++){
                if(rightmax<arr[k]){
                    rightmax = arr[k];
                }
            }

            int min = Math.min(rightmax, leftmax);
            if (min-arr[i]>0) {
                total+=min-arr[i];
            }
        }
        System.out.println(total);
    }
}
