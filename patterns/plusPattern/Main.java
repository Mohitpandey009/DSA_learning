package patterns.plusPattern;

public class Main {
    public static void main(String[] args) {
        plus();
    }

    static void plus(){
        int n = 5;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if ((n/2)==i||(n/2)==j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
