package recursion.Fabbonaci;

public class Main {
    public static int fab(int term){
        if (term<=1) {
            return term;
        }
        return fab(term-1)+fab(term-2);
    }

   public static void main(String[] args) {
    System.out.println(fab(5));
   } 
}
