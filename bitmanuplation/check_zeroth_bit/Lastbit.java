package bitmanuplation.check_zeroth_bit;

public class Lastbit {
    public static void main(String[] args) {
        int n = 8;
        if ((n&1)==0) {
            
            System.out.println("0th bit is 0");
        }else{
            System.out.println("0th bit is 1");

        }
    }
}

//  its check the 0th bit to perform operation like this 
//  n = 8 => 1000
//  n&1   => 
//     1000     
//   & 0000
// =>  0000 so you got the zeroth bit
