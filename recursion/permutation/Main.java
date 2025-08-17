package recursion.permutation;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String str = "ABC";
        ArrayList<String> result = new ArrayList<>();
        System.out.println(permutation(str,0,str.length()-1,result));
        
    }
    public static ArrayList<String> permutation(String str,int left,int right,ArrayList<String>collect){
            if (left==right) {
                collect.add(str);
                return collect;
            }

            for(int i=left;i<=right;i++){
                str = swap(str, left, i);
                permutation(str, left+1, right, collect);
                str = swap(str, left, i);
            }

        return collect;
        }
        public static String swap(String str,int i,int j){
            char[] charArray = str.toCharArray();
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }
}