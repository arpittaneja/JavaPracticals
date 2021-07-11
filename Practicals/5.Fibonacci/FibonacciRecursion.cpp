//5.Write a Program to generate the Fibonacci Series using recursion.


#include <iostream>
using namespace std;

int Fibonacci(int n);
int main()
{
    for (int i =0; i < 10; i++)
    {
        cout<< Fibonacci(i) << ", ";
    }
}

int Fibonacci(int n)
{
    if (n == 0)
    {
        return 0;
    }
    if (n == 1 || n == 2)
    {
        return 1;
    }
    return Fibonacci(n-2) + Fibonacci(n-1);
}
