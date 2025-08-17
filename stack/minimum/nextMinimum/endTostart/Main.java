package stack.minimum.nextMinimum.endTostart;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        int arr[] = {7,3,2,8,1,4};
        int ans[] = new int[6];

        for(int i=arr.length-1;i>=0;i--){
            if (stack.empty()) {
                stack.push(arr[i]);
            }else{
                while (!stack.empty() && arr[i]<stack.peek()) {
                    stack.pop();
                }
                ans[i]=stack.empty() ? -1 : stack.peek();
                stack.push(arr[i]);
            }
        }
            for (int i : ans) {
                System.out.print(i+" ");
            }
    }
}
