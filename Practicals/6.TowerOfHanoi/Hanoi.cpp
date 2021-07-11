//6. Write a Program to implement Tower of Hanoi using recursion.


#include <iostream>
using namespace std;

void HanoiTriangle(int n, char start, char ending, char mid)
{
    if (n == 1)
    {
        cout<< n<<":"<<start<<"-->"<<ending<<endl;
    }
    else
    {
        HanoiTriangle(n-1, start, mid, ending);
        cout<<n<<":"<<start<<"-->"<<ending<<endl;
        HanoiTriangle(n-1, mid, ending, start);
    }
}

int main()
{
    HanoiTriangle(4, 'A', 'C', 'B');
}
