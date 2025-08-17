package stack.sumofSubarrayMax;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2};
        int pmi[] = previousMax(arr);
        int nmi[] = nextMax(arr);
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            int left = i-pmi[i];
            int right = nmi[i]-i;
            sum+=left*right*arr[i];
        }
        System.out.println(sum);
    }

    static int[] previousMax(int arr[]){
        int max[] = new int[4];
        Arrays.fill(max, -1);
        Stack<Integer>stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (!stack.empty() && arr[i]>=arr[stack.peek()]) {
                stack.pop();
            }
            max[i] = stack.empty() ? -1 : stack.peek();
            stack.push(i);
        }
        return max;
    }


    static int[] nextMax(int arr[]){
        int max[] = new int[4];
        Arrays.fill(max, arr.length);
        Stack<Integer>stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (!stack.empty() && arr[i]>=arr[stack.peek()]) {
                max[stack.pop()] = i;
            }
            // max[i] = stack.empty() ? -1 : stack.peek();
            stack.push(i);
        }
        return max;
    }
}
