/*8. Write a Program to implement Bubble Sort. Find the number of comparisons during each
pass and display the intermediate result. Use the observed values to plot a graph to analyze
the complexity of algorithm.*/

#include <iostream>
using namespace std;

int main()
{
    int arr[] = {3, 8, 1, 5, 11, 9, 2};
    int n = sizeof(arr)/sizeof(arr[0]);
    int count=0;

    cout<<"Unsorted array is: ";
    for(int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }

    cout<<endl;

    for (int i = 0; i < n-1; i++)
    {
        for (int j = 0 ; j < n-1-i; j++)
        {
            if (arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    cout<< "The sorted array is ";
    for(int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
}
