package stack.sumofSubarrayMin;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int arr[] = {5,0,2,8,7,6};
        int psi[] = previousMin(arr);
        int nsi[] = nextMin(arr);
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            int left = i - psi[i];
            int right = nsi[i] - i;
            sum+=left*right*arr[i];
        }
        System.out.println(sum);
    }

    static int[] previousMin(int arr[]){
        int min[] = new int[6];
        Arrays.fill(min, -1);
        Stack<Integer>stack = new Stack<>();
        for(int i=0;i<6;i++){
            while (!stack.empty() && arr[i]<=arr[stack.peek()]) {
                stack.pop();
            }
            min[i] = stack.empty() ? -1 : stack.peek();
            stack.push(i);
        }
        return min;
    }

    static int[] nextMin(int arr[]){
        int min[] = new int[6];
        Arrays.fill(min, arr.length);
        Stack<Integer>stack = new Stack<>();
        for(int i=0;i<6;i++){
            while (!stack.empty() && arr[i]<=arr[stack.peek()]) {
                min[stack.pop()] = i;
            }
            stack.push(i);
        }
        return min;
    }
}
