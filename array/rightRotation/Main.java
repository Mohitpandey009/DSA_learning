package array.rightRotation;
public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int counter = 0;
        int cycle = 0;
        int val = arr[0];
        int len = arr.length;
        int currentInd = 0;
        int k = 3;
        while (counter<len) {
            int nextInd = (currentInd+k)%len;
            int temp = val;
            val = arr[nextInd];
            arr[nextInd] = temp;
            currentInd = nextInd;
            if (currentInd==cycle) {
                currentInd++;
                val = arr[currentInd];
                cycle = currentInd;
            }
            counter++;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}