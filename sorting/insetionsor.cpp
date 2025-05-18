#include<iostream>
using namespace std;
int main(){
    int n,temp,j;
    cout<<"Enter the total number to be sorted: ";
    cin>>n;
    int a[n];
    cout<<"Enter the elements: ";
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    for(int i=1;i<n;i++){
        temp=a[i];
        j=i-1;
        while(j>=0 && a[j]>temp){
            a[j+1]=a[j];
            a[j]=temp;
            j--;

        }
        a[j+1]=temp;

    }
    cout<<"Sorted array is: ";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
}