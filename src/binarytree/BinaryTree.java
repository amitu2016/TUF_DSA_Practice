package binarytree;

import java.util.*;

class Node {

	Node left;
	Node right;

	int data;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}

public class BinaryTree {

	public static Scanner sc = new Scanner(System.in);

	// create binary tree using recursion
	public static Node createTree() {

		Node root = null;

		System.out.println("Enter the data: ");

		int data = sc.nextInt();

		if (data == -1)
			return null;

		root = new Node(data);

		System.out.println("Enter left data for : " + data);
		root.left = createTree();

		System.out.println("Enter right data for : " + data);
		root.right = createTree();

		return root;
	}

	public static void inOrder(Node root) {

		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);

	}

	public static void preOrder(Node root) {

		if (root == null)
			return;

		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);

	}

	public static void postOrder(Node root) {

		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ " ");

	}
	
	
	public static int hightOftree(Node root) {
		if(root == null) return 0;
		
		return Math.max(hightOftree(root.left), hightOftree(root.right)) + 1;
	}
	
	public static int countNoOfNodes(Node root) {
		if(root == null) return 0;
		
		return countNoOfNodes(root.left) + countNoOfNodes(root.right) + 1;
	}
	
	public static int findMax(Node root) {
		if(root == null) return Integer.MIN_VALUE;
		
		int maxSubproblem = Math.max(findMax(root.left), findMax(root.right));
		
		return Math.max(maxSubproblem, root.data);
	}
	

	public static void main(String[] args) {
		Node root = createTree();
		
		System.out.println("Inorder : ");
		inOrder(root);
		System.out.println();
		
		System.out.println("Preorder : ");
		preOrder(root);
		System.out.println();
		
		System.out.println("Postorder : ");
		postOrder(root);
		System.out.println();
		
		System.out.println("Hight of tree : "+hightOftree(root));
		
	}

}
