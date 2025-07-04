#include <iostream>
using namespace std;

class getbit{
    int count = 0;
    int bit;
     public :
        getbit(int n){
            bit = n;
        }

        int countgetBit(){
            while(bit){
                // cout<<bit<<"  "<<(bit-1);
                bit = bit&(bit-1);
                // cout<<endl<<bit<<endl;
                count++;
            }
            return count;
        }
};

int main() {
    getbit s1(12);
    int no = s1.countgetBit();
    cout << no;
    return 0;
}