#include<iostream>
using namespace std;
void swap(int *a,int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
int main(){
    int n;
    cout<<"How many numbers to be sorted: ";
    cin>>n;
    int a[n];
    cout<<"Enter the elements: ";
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(a[min]>a[j]){
                min=j;
            }

        }
        if(min!=i){
            swap(&a[i],&a[min]);
        }

    }
    cout<<"Sorted array is: ";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }

    


}
