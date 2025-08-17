package stack.minimum.previousMinimum.Endtostart;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        int arr[] = {7,3,2,8,1,4};
        int ans[] = new int[6];

        for(int i=arr.length-1;i>=0;i--){
            if(stack.empty()){
                stack.push(i);
            }else{
                while (!stack.empty() && arr[i]<arr[stack.peek()]) {
                    ans[stack.peek()] = arr[i];
                    stack.pop();
                }
                stack.push(i);
            }
        }

        for (int i : ans) {
           System.out.print(i + " "); 
        }
        
    }
}
