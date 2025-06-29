#include <iostream>
using namespace std;

class Setbit{
    int count = 0;
    int bit;
     public :
        Setbit(int n){
            bit = n;
        }

        int countSetBit(){
            while(bit){
                bit = bit&(bit-1);
                count++;
            }
            return count;
        }
};

int main() {
    Setbit s1(7);
    int no = s1.countSetBit();
    cout << no;
    return 0;
}