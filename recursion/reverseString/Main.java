package recursion.reverseString;

public class Main {
    public static String reverseStr(String s){
        if(s.length()<=1 || s==null){
            return s;
        }
        return reverseStr(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        String str = "hello";
        
        System.out.println(reverseStr(str));
    }
}