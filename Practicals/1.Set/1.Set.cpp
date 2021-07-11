/*Write a Program to create a SET A and determine the cardinality of SET for an input array of
elements (repetition allowed) and perform the following operations on the SET:
a) ismember (a, A): check whether an element belongs to set or not and return value as
true/false.
b) powerset(A): list all the elements of power set of A.*/


#include <iostream>
#include <set>
#include<math.h>
using namespace std;

int isMember(multiset<int> A){
    cout<<"\nEnter an element to find in the set\n";
    int c;
    cin>>c;
    if(A.count(c))
        cout<<"Element present\n";
    else
        cout<<"Sorry no such element present\n";
}
int powerSet(multiset<int> A){
    for(int counter = 0; counter < pow(2,A.size()); counter++)
    {
    for(int j = 0; j < A.size(); j++)
    {
        if(counter & (1 << j)){
            auto first = A.begin();
            std::advance(first, j);
            cout << *first;
        }
    }
    cout << endl;
    }
}
int dispSet(multiset<int> A){
    cout<<"Entered set is:-\n";
    for (auto it = A.begin(); it != A.end(); ++it)
        cout <<" "<< *it;
    cout<<endl;
    cout<<"Cardinality of entered set is:";
    cout<<A.size();
    return 0;
}
int inputSet(multiset<int> A){
    int c=1;
    cout<<"Enter the elements in the set-:\n";
    while(c){
        int n;
        cin>>n;
        A.insert(n);
        cout<<"do you want to enter more?<0/1>\n";
        cin>>c;
    }
    dispSet(A);
    isMember(A);
    powerSet(A);
    return 0;
}
int main(){
    multiset<int> A;
    inputSet(A);
    return 0;
}
