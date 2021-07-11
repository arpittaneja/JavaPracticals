//7. Write a Program to implement binary search using recursion.


#include <iostream>
using namespace std;

int BinarySearch(int list[], int high, int low, int element)
{
    int mid = (high+low)/2;
    while(high >= low)
    {
      //int mid = (high+low)/2;
        if (list[mid] == element)
        {
            return mid;
        }
        else if(element > list[mid])
        {
            return BinarySearch(list, high, mid+1,element);
        }
        else if(element < list[mid])
        {
            return BinarySearch(list, mid-1, low, element);
        }
        else
        {
            return -1;
        }
    }
}

int main()
{
    int array[] = {1, 3, 5, 7, 9, 10};
    cout<<"The element is found at interval: "<<BinarySearch(array, (sizeof(array)/sizeof(array[0]))-1, 0, 10);

}
