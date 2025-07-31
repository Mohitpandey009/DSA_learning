// intersection in sorted array

package array.interSection;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int a[] = {1,2,2,2,2,2};
        int b[] = {1,1,2,3,6,8};
        int c[] = new int[b.length];
        int j=0,i=0;
        ArrayList<Integer>intersection = new ArrayList<>();
       while (i<a.length && j<b.length) {
        if (a[i]==b[j] && c[j]!=-1) {
            c[j]=-1;
            intersection.add(a[i]);
            i++;
            j++;
        }else if (a[i]>b[j]) {
            j++;
        }else{
            i++;
        }
       }

       for (Integer in : intersection) {
        System.out.println(in);
       }
    }
}
