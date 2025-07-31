package stack.nextMaximum.circularArray;
import java.util.Stack;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2,33,1,10,2,8,9,10,11};
        int len = arr.length;
        int result[] = new int[len];
        Arrays.fill(result, -1);
        Stack<Integer>stack = new Stack<>();
        for(int i=0;i<(2*len);i++){
            int num = arr[i % len]; //cicular array
            while (!stack.empty() && num>arr[stack.peek()]) {
                int index = stack.pop();
                result[index] = num;
            }
            if (i<len) {
                stack.push(i);
            }
        }

        for (int integer : result) {
            System.out.println(integer);
        }
    }
}
