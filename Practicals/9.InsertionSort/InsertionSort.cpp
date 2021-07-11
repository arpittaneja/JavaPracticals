/*9. Write a Program to implement Insertion Sort. Find the number of comparisons during each
pass and display the intermediate result. Use the observed values to plot a graph to analyze
the complexity of algorithm.*/

#include <iostream>
using namespace std;

int main()
{
    int arr[] = {3, 8, 1, 5, 11, 9, 2,};
    int n = sizeof(arr)/sizeof(arr[0]);
    int count=0;
    int j;
    cout<<"Unsorted array is: ";
    for(int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }

    cout<<"\n";

    for (int i = 0; i < n; i++)
    {
        int current = arr[i];
        int j = i-1;

        while(j>=0 && current < arr[j])
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current;
    }
    cout<<"Sorted array is: ";
    for(int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
}


