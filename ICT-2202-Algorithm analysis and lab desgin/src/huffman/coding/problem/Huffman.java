package huffman.coding.problem;

import java.util.PriorityQueue;

public class Huffman {
	public static int printcode(HuffmanNode root,String string) {
		int sum1=0;
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null && Character.isLetter(root.c)) {
			System.out.println(root.c +":"+string);
			int l=string.length();
			sum1+=root.data*l;
			
		
			
		}
		return sum1+printcode(root.left, string+"0")+printcode(root.right, string+"1");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		char[] chararray= {'A','C','E','M','U','Z'};
		int[] charfre= {100,53,133,60,44,8};
		int m,sum=0;
		for(int i=0;i<n;i++) {
			m=charfre[i]*8;
			sum+=m;
			
		}
		PriorityQueue<HuffmanNode>q=new PriorityQueue<HuffmanNode>(n,new MyComparator());
		for(int i=0;i<n;i++) {
			HuffmanNode hn=new HuffmanNode();
			hn.c=chararray[i];
			hn.data=charfre[i];
			
			hn.left=null;
			hn.right=null;
			 
			q.add(hn);
		}
		HuffmanNode root=null;
		while(q.size()>1) {
			HuffmanNode x=q.peek();
			q.poll();
			
			HuffmanNode y=q.peek();
			q.poll();
			
			HuffmanNode f=new HuffmanNode();
			f.data=x.data+y.data;
			
			f.c='-';
			f.left=x;
			f.right=y;
			root=f;
			
			q.add(f);
			
		}
		int k=printcode(root,"");
		double p=((double)k/sum)*100;
		System.out.println("Compressed Effiecency "+p+"%");
		

	}

}
