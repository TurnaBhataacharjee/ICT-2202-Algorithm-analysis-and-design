#include<iostream>
using namespace std;
void swap(int *a,int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
void maxheapify(int a[],int n,int i)
{
    int largest=i;
    int left=2*i;
    int right=(2*i+1);
    while(left<=n && a[left]>a[largest]){
        largest=left;
    }
    while(right<=n && a[right]>a[largest]){
        largest=right;
    }
    if(largest!=i){
        swap(&a[largest],&a[i]);
        maxheapify(a,n,largest);

    }

}
void Heapsort(int a[],int n){
    for(int i=n/2;i>=1;i--){
        maxheapify(a,n,i);
    }
    for(int i=n;i>=1;i--)
    {
        swap(&a[1],&a[i]);
        maxheapify(a,i-1,1);
    }
}

int main(){
    int n;
    cout<<"How many data to be sorted: ";
    cin>>n;
    int a[n];
    cout<<"Enter the elements: ";
    for(int i=1;i<=n;i++){
        cin>>a[i];
    }
    Heapsort(a,n);
    cout<<"Sorted array is: ";
    for(int i=1;i<=n;i++){
        cout<<a[i]<<" ";
    }
}