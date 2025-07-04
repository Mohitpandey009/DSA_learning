#include <iostream>
using namespace std;

string isPair(int num){
    int pair = num>>1;
    num = num ^ pair; 
    int result = num&(num+1);
    return (result==0 ? "yes" : "no");
}

int main() {
    cout<<isPair(20);
    return 0;
}