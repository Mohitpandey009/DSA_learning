package bitmanuplation.set_kth_bit;

public class Setbit {
    public static void main(String[] args) {
        int num = 8; //this is the original number 
        int k = 1;    // the position where set this bit 
        int setbit = 1; 
        setbit<<=k;   // here i am creating new number after  setting the bit 

        num|=setbit;   // now here i am setting the bit with the help of or(|)
        System.out.println(num);  //this is the number after performing the or operation
    }
}
