package bit_multiplication;

public class Bitmultiple {

    public static void main(String[] args) {
        int a = 10;
        int b = -2;
        boolean negative = false;
        int result = 0;

        if (a<0) {
            a=-a;
            negative=!negative;
        }
        if (b<0) {
            b=-b;
          negative=!negative;  
        }

        while (b>0) {

            if ((b&1)==1) {
                result+= a;  
            }
            a<<=1;
            b>>=1;
        }

        if (negative) {
            result=-result;
        }
        System.out.println(result);

    }
}