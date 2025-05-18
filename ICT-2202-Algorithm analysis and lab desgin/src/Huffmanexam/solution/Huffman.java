package Huffmanexam.solution;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Huffman {
	static List<HuffmanNode>nodes=new ArrayList<HuffmanNode>();
	public static void calculatefrequencey(String word) {
		
		Map<Character, Integer>frequncies=new HashMap<>();
		
		for(char charvalue:word.toCharArray()) {
			if(!frequncies.containsKey(charvalue)) {
				int fre=0;
				for(char ch:word.toCharArray()) {
					if(ch==charvalue) {
						fre++;
					}
					
				}
				frequncies.put(charvalue, fre);
				nodes.add(new HuffmanNode(charvalue,fre));
			}
			
		}
	}
	
	public static HuffmanNode buildinghuffmantree() {
		while(nodes.size()>1) {
			nodes.sort((a,b)-> a.data-b.data);
			HuffmanNode left=nodes.remove(0);
			HuffmanNode right=nodes.remove(0);
			
			HuffmanNode merged=new HuffmanNode(left.data + right.data);
			merged.left=left;
			merged.right=right;
			
			nodes.add(merged);
			
		}
		return nodes.get(0);
		
	}
	public static void generatecode(HuffmanNode root,String string, Map<Character, String>codes) {
		if(root==null) {
			return ;
		}
		if(root.c!='\0') {
			codes.put(root.c, string);
			
		}
		generatecode(root.left, string +'0',codes);
		generatecode(root.right, string +'1', codes);
	}
	
	public static Map<Character, String>huffman(String word){
		nodes.clear();
		calculatefrequencey(word);
		HuffmanNode root=buildinghuffmantree();
		Map<Character,String>codes=new HashMap<>();
		generatecode(root,"",codes);
		return codes;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Algorithm analysis";
		Map<Character, String>codes=huffman(word);
		System.out.println(codes);
		

	}

}
