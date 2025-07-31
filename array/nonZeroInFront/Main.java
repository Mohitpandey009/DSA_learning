package array.nonZeroInFront;

public class Main {
    public static void main(String[] args) {
        int [] arr = {2,0,0,5,-1,0};
        int len  = arr.length;
        int i=0;

        while(arr[i]!=0) {
                i++;
        }

        for(int j=i;j<len;j++){
            if (arr[j]!=0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        
        for (int in : arr) {
            System.out.println(in);
        }
       
    }
}