package array.unionArray;
import java.util.HashMap;
// import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int a[] = {1,2,2,4,5};
        int b[] = {2,3,3,6,5,7};

        // ArrayList<Integer> union = new ArrayList<>();

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i : a){
            if (map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 0);
            }
        }
        for(int key : b){
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            }else{
                map.put(key, 0);
            }
        }

       for (int keys : map.keySet()) {
        System.out.println(keys);
       }
    }
}
