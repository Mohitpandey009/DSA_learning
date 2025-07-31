package string_operation.minimumPalindrom;

public class Main {
    public static void main(String[] args) {
        // String str = "abcbagfg";
        String str = "abcdefg";
        // String str = "aa";
        int j = 0;
        int len = str.length();

        while (j<len-1) {
            int palindrome=0;
            int mid = (len-1-j)/2;
            for(int i=0;i<mid;i++){
                // System.out.println(j);
                if (str.charAt(i)!=str.charAt(len-1-i-j)) {
                    palindrome = 1;
                    break;
                }
                // System.out.println(j);
            }
            if (palindrome==0) {
                break;
            }
            j++;
        }
        System.out.println(j+1);
    }
}
