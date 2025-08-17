package stack.minimum.nextMinimum.startToend;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        int arr[] = {7,3,2,8,1,4};
        int ans[] = new int[6];

        for(int i=0;i<arr.length;i++){
            if (stack.empty()) {
                stack.push(i);
            }else{
                while (!stack.empty() && arr[i]<arr[stack.peek()]) {
                    ans[stack.pop()] = arr[i];
                }
                stack.push(i);
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
