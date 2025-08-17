package patterns.crossPattern;

public class Main {
    public static void main(String[] args) {
        cross();
    }

    static void cross(){
        int m = 3;
        for(int i=0;i<m;i++){
            //space 
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int k=0;k<(2*m-2*i-1);k++){
                if (k==0||k==(2*m-2*i-1)-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                // System.out.print((2*m-2*i-1));
            }
            System.out.println();

        }
        int l = 2;
        for(int i=0;i<l;i++){
            //space
            for(int j=0;j<(l-i-1);j++){
                System.out.print(" ");
            }
            //star
            for(int k=0;k<=(l+2*i+1);k++){
                if (k==0||k==(l+2*i)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
