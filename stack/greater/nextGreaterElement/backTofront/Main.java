package stack.greater.nextGreaterElement.backTofront;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int arr[] = {7,2,8,9,4,4,0};
        int ans[] = new int[7];
        Stack<Integer>stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if (stack.empty()) {
                ans[i] = -1;
                stack.push(arr[i]);
            }else{
               while (!stack.empty() && arr[i]>=stack.peek()) {
                    stack.pop();
               }
                ans[i] = stack.empty() ? -1 : stack.peek();
                stack.push(arr[i]);
            }
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
