package stack.greater.previousGreaterElement.endTofront;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        int arr[] = {10,5,8,7,1,0};
        int ans[] = new int[6];

        for(int i=arr.length-1;i>=0;i--){
            if (stack.empty()) {
                stack.push(i);
            }else{
                while (!stack.empty() && arr[i]>arr[stack.peek()]) {
                    ans[stack.pop()]=arr[i];
                }
                    stack.push(i); 
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
