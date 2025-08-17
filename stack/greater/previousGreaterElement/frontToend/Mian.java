package stack.greater.previousGreaterElement.frontToend;

import java.util.Stack;

public class Mian {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        int arr[] = {7,5,4,2,10,9};
        int ans[] = new int[6];

        for(int i=0;i<arr.length;i++){
            if (stack.empty()) {
                ans[i] = -1;
                stack.push(arr[i]);
            }else{
                while (!stack.empty() && arr[i]>stack.peek()) {
                    stack.pop();
                }
                ans[i] = stack.empty() ? -1 : stack.peek();
                stack.push(arr[i]);
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
