package queue.Dequeue;

import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer>Dq = new ArrayDeque<>();
        int arr[] = {4,7,1,1,2,-13,-7,17,18,-18,-19};

        // Dq.offer(arr[0]);
        // Dq.offer(arr[1]);
        // System.out.println(Dq.size());
        // System.out.println(Dq.getLast());
        // System.out.println(Dq.removeLast());
        // System.out.println(Dq.isEmpty());

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                Dq.offer(arr[i]);
            }else{
                while (!Dq.isEmpty() && Dq.getLast()>0 && Dq.getLast()<Math.abs(arr[i])) {
                    Dq.removeLast();
                }
                if (Dq.isEmpty() || Dq.getLast()<0) {
                    Dq.offer(arr[i]);
                }else if (!Dq.isEmpty() && Dq.getLast()==Math.abs(arr[i])) {
                    Dq.removeLast();
                }
            }
        }
        System.out.println(Dq);

    }
}
