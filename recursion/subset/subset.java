package recursion.subset;
import java.util.*;

public class subset {

    public static void findSubsequences(int[] arr, List<Integer> output, int index) {
        if (index == arr.length) {
            System.out.println(output);
            return;
        }

        output.add(arr[index]);
        findSubsequences(arr, output, index + 1);

        output.remove(output.size() - 1);
        findSubsequences(arr, output, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        findSubsequences(nums, new ArrayList<>(), 0);
    }
}
