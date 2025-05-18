#include<iostream>
using namespace std;
struct node{
    int data;
    struct node *left;
    struct node *right;
};
void inorder(struct node *root){
    if(root==NULL){
        return;
    }
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}
struct node *create (int data){
    struct node *newnode;
    newnode=new(node);
    newnode->data=data;
    newnode->left=NULL;
    newnode->right=NULL;
    return newnode;
}
struct node *insert(struct node *root,int p){
    if(root==NULL){
        return create(p);
    }
    else if(root->data>=p){
        root->left=insert(root->left,p);
    }
    else if(root->data<=p){
        root->right=insert(root->right,p);
    }
    return root;


}
int main(){
    struct node *root;
    root=NULL;
    int n,data;
    cout<<"How many data to be inserted: ";
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>data;
        root=insert(root,data);
    }
    cout<<"Sorted array is: ";
    inorder(root);


}