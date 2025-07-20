package recursion.Multiplication;

public class Main {
    static void table(int n,int number){
        if (n<1) return ;
        
        table(n-1, number);
        System.out.println(number+"*"+n+" = "+number*n); 
    }

    public static void main(String[] args) {
        table(10, 5);
    }
}
