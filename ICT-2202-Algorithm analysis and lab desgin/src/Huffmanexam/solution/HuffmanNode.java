package Huffmanexam.solution;

public class HuffmanNode {
	
	char c;
	int data;
	HuffmanNode left;
	HuffmanNode right;
	
	//leaf node character
	HuffmanNode(char c,int data){
		this.c=c;
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	//internal node
	HuffmanNode(int data){
		this.c='\0';
		this.data=data;
		this.left=null;
		this.right=null;
	}

}
