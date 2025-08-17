package stack.minStack;

import java.util.ArrayList;

   class MinStack{
        ArrayList<int[]>stack;
        
        // int pointer = -1;
        MinStack(){
            stack = new ArrayList<>();
        }
        void push(int val){
            int size = stack.size();
            if (size==0) {
                stack.add(new int[]{val,val});
            }else{
                int min = Math.min(val,stack.get(size-1)[1]);
                stack.add(new int[]{val,min});
            }
        }

        int pop(){
            int size = stack.size();
            if (stack.isEmpty()) {
                return -1;
            }
            int element = stack.get(size-1)[0];
            stack.remove(size-1);
            return element;
        }
        
        int minElement(){
            int size = stack.size();
             if (stack.isEmpty()) {
                return -1;
            }
            int element = stack.get(size-1)[1];
            return element;
        }

        int peek(){
            int size = stack.size();
            if (stack.isEmpty()) {
                return -1;
            }
            int element = stack.get(size-1)[0];
            return element;
        }
        
    }

public class Main {
      public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(10);
        stack.push(20);
        stack.push(0);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.minElement());
        System.out.println(stack.pop());

    }
}
