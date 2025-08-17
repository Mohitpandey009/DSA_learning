package stack.greater.nextGreaterElement.frontToback;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int arr[] = {4,2,1,9,7,0};
        int ans[] = new int[6];

        Stack<Integer>stack = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if (stack.empty()) {
                stack.push(i);
            }else{
                while (!stack.empty() && arr[i]>arr[stack.peek()]) {
                    ans[stack.peek()] = stack.empty() ? -1 : arr[i];
                    stack.pop();
                }
                stack.push(i);
            }
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}