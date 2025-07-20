package bit_addition;

public class Addition {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1111";
        String result="";
        int sum = 0;
        int carry = 0;
        int i=a.length()-1;
        while (i>=0 || carry!=0) {
           
        sum+=carry;
         if (i>=0) {
             sum+=a.charAt(i)-'0';
              sum+=b.charAt(i)-'0';
         } 
            result=(sum%2)+result;
            carry=sum/2; 
            sum=0;
            i--;
        }
        System.out.println(result);

    }
}
