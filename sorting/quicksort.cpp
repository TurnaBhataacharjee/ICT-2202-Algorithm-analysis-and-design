#include<iostream>
using namespace std;
void swap(int *a,int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
int partion(int a[],int lb,int ub){
    int pivot=a[lb];
    int s=lb;
    int e=ub;
    while(s<e){
    while(a[s]<=pivot){
        s++;
    }
    while(a[e]>pivot){
        e--;
    }
    if(s<e){
        swap(&a[s],&a[e]);
    }
}

    swap(&a[lb],&a[e]);
    return e;
}
void quicksort(int a[],int lb,int ub){
    if(lb<ub){
        int p=partion(a,lb,ub);
        quicksort(a,lb,p-1);
        quicksort(a,p+1,ub);
    }
}
int main(){
    int n;
    cout<<"How many data to be sorted: ";
    cin>>n;
    int a[n];
    cout<<"Enter the elements: ";
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    quicksort(a,0,n-1);

    cout<<"Sorted array is: ";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    
    

}
