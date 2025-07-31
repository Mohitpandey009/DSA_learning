package queue.implementation;

    import java.util.ArrayList;

    class Queue {
        ArrayList<Integer> q;
        int front;
        int rear;

        Queue() {
            q = new ArrayList<>();
            front = -1;
            rear = -1;
        }

        void Enqueue(int ele) {
            q.add(ele);
            rear++;
            if (front == -1) {
                front = 0;
            }
        }

        int Dequeue() {
            if (front==-1 || front>rear) {
                System.out.println("Queue empty");
                return -1;
            }
            int element = q.get(front);
            front++;

            if (front > rear) {
                front = -1;
                rear = -1;
                q.clear();
            }
            return element;
        }

        int get_first_element() {
            if (front==-1 || front>rear) {
                System.out.println("Queue empty");
                return -1;
            }
            return q.get(front);
        }

    }

    public class Main {
        public static void main(String[] args) {
            Queue q = new Queue();
            q.Enqueue(10);
            q.Enqueue(20);
            System.out.println(q.Dequeue());  
            System.out.println(q.get_first_element()); 
            System.out.println(q.Dequeue());   
        }
    }
