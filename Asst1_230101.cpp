#include <iostream>
using namespace std;

class Lab3{
    double x, y, result;
    public:
        void sub(double x, double y){
            result = x - y;
            cout <<"result-1 = "<< result << endl;
        }
        void sub(double x, double y, double z){
            result = x - y - z;
            cout << "result-2 = " << result << endl;
        }

        void sub(int x, int y){
            result = x - y;
            cout << "result-3 = " << result << endl;
        }
};

int main(){
    Lab3 ob;
    ob.sub(4.5,5.5);     
    ob.sub(6.7, 8.9, 9.9); 
    ob.sub(43, 34);

    return 0;
}
