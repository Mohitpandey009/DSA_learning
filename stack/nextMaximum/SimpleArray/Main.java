package stack.nextMaximum.SimpleArray;
import java.util.Arrays;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        int arr[] = {2,33,1,10,2,8,9,10,11};
        int n = arr.length;
        int []result = new int[n];
        Arrays.fill(result,-1);
       
        for(int i=0;i<n;i++){
            int num = arr[i];
            while (!stack.empty() && num>arr[stack.peek()]) {
                int index = stack.pop();
                result[index] = num;
            }
            stack.push(i);
        }


        
        for (int i : result) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
