package Test;

class Node 
{ 
	int key; 
	Node left, right; 
	

	public Node(int item) 
	{ 
		key = item; 
		left = right = null; 
	} 
}

class BinaryTree 
{ 

	static Node root; 

	BinaryTree() 
	{ 
		root = null; 
	} 

	void printPostorder(Node node) 
	{ 
		if (node == null) 
			return; 

		printPostorder(node.left); 

		printPostorder(node.right); 

		System.out.print(node.key + " "); 
	} 

	void printInorder(Node node) 
	{ 
		if (node == null) 
			return; 

		printInorder(node.left); 

		System.out.print(node.key + " "); 

		printInorder(node.right); 
	} 

	void printPreorder(Node node) 
	{ 
		if (node == null) 
			return; 

		System.out.print(node.key + " "); 

		printPreorder(node.left); 

		printPreorder(node.right); 
	} 
	
	static boolean ifNodeExists( Node node, int key) 
	{ 
	    if (node == null) 
	        return false; 
	 
	    if (node.key == key) 
	        return true; 
	 
	    boolean res1 = ifNodeExists(node.left, key); 
	   
	    if(res1) return true; 
	 
	    boolean res2 = ifNodeExists(node.right, key); 
	 
	    return res2; 
	} 

	void printPostorder() {	 printPostorder(root); } 
	void printInorder() {	 printInorder(root); } 
	void printPreorder() {	 printPreorder(root); } 

	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 
		BinaryTree.root = new Node(1); 
		BinaryTree.root.left = new Node(2); 
		BinaryTree.root.right = new Node(3); 
		BinaryTree.root.left.left = new Node(4); 
		BinaryTree.root.left.right = new Node(5); 

		System.out.println("Preorder traversal of binary tree is "); 
		tree.printPreorder(); 

		System.out.println("\nInorder traversal of binary tree is "); 
		tree.printInorder(); 

		System.out.println("\nPostorder traversal of binary tree is "); 
		tree.printPostorder(); 
		
	    int key = 3; 
	    
	    if (ifNodeExists(root, key)) 
	        System.out.println("\n" + key + " was found"); 
	    else
	        System.out.println("\n" + key + " was not found"); 
	} 
} 

