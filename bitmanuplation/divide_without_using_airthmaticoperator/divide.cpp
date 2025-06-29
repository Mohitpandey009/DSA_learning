#include <iostream>
using namespace std;

class BitDivide{
    int divided;
    int divisor;
    int quotient;
    public :

    BitDivide(int divided,int divisor){
        this->divided=divided;
        this->divisor=divisor;
        this->quotient = getQuotient();
    }

    int getQuotient(){
        if (divisor == 0) {
            throw invalid_argument("Divisor cannot be zero.");
        }
        int result = 0;
        while(divided>=divisor){
            int temp = divisor;
            int multiple = 1;
            while(divided>=(temp<<1)){
                temp<<=1;
                multiple<<=1;
            }
            divided-=temp;
            result+=multiple;
        }
        return result;
    }
    friend void PrintData(BitDivide *b1);
};

    void PrintData(BitDivide *b1){
       cout<<"the quotient  "<<b1->quotient;
    }

int main() {

    try{
         BitDivide b2(50,0);
         PrintData(&b2);
    }catch(invalid_argument& e) {
        cout << "Error: " << e.what() << endl;
    }
    

    return 0;
}