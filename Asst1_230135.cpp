#include <iostream>
using namespace std;

class Calculator{
    double a, b, result;

    public:
        void add(double a, double b){
            result = a + b;
            cout << result << endl;
        }
        void add(double a, double b, double c){
            result = a + b + c;
            cout << result << endl;
        }
        void add(int a, int b){
            result = a + b;
            cout << result << endl;
        }
};

int main()
{
    Calculator ob;
    ob.add(10.2, 122.4);     
    ob.add(10.2, 122.4, 78); 
    ob.add(10, 20);

    return 0;
}