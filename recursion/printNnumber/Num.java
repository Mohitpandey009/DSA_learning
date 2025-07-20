public class Num {
    public static void Printnum(int n){
        if(n>10){
            return;
        }
        Printnum(n+1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Printnum(1);
    }
}