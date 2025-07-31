package stack.areaOfHistogram.bruteForce;

public class Main {
    public static void main(String[] args) {
        int histogram[] = {1,2,0,2,6,8};
        // int histogram[] = {1,2,0,2,6,0};
        for(int i=0;i<histogram.length;i++){
            int element = histogram[i];
            int leftmin = -1;
            int rightmin = histogram.length;
            for(int l=i-1;l>=0;l--){
                if (element>histogram[l]) {
                    leftmin = (l);
                    break;
                }
            }
            for(int r=i+1;r<histogram.length;r++){
                if (element>histogram[r]) {
                    rightmin = r;
                    break;
                }
            }
            int area = histogram[i]*(rightmin-leftmin-1);
            System.out.println(histogram[i]+"  "+rightmin+"  "+ leftmin +"  "+area);
        }

    }
}
