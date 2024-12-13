package binarysearchtree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor to initialize the TreeNode with a value and null children
    public TreeNode(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class BST {

    /**
     * Inserts a value into the Binary Search Tree (BST).
     * If the root is null, a new TreeNode is created.
     * Otherwise, it recursively finds the correct position in the tree
     * to maintain the BST property (left < root < right).
     *
     * @param root The root of the BST.
     * @param val The value to be inserted.
     * @return The root of the updated BST.
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) // Base case: If the tree is empty, create a new node.
            return new TreeNode(val);

        if (val > root.data) { // If the value is greater, insert into the right subtree.
            root.right = insertIntoBST(root.right, val);
        } else if (val < root.data) { // If the value is smaller, insert into the left subtree.
            root.left = insertIntoBST(root.left, val);
        }

        return root; // Return the unchanged root node.
    }

    /**
     * Deletes a node with the given key from the BST.
     * Recursively finds the node to be deleted and adjusts the tree to maintain the BST property.
     *
     * @param root The root of the BST.
     * @param key The value of the node to be deleted.
     * @return The root of the updated BST.
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) // Base case: If the tree is empty, return null.
            return root;

        if (key < root.data) { // If the key is smaller, search in the left subtree.
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) { // If the key is greater, search in the right subtree.
            root.right = deleteNode(root.right, key);
        } else { // Node to be deleted is found.

            // Case 1: Node has no left child.
            if (root.left == null) {
                return root.right;
            }

            // Case 2: Node has no right child.
            else if (root.right == null) {
                return root.left;
            }

            // Case 3: Node has two children.
            // Replace the node's value with the minimum value in the right subtree.
            root.data = minValue(root.right);

            // Delete the inorder successor from the right subtree.
            root.right = deleteNode(root.right, root.data);
        }
        return root; // Return the updated root.
    }

    /**
     * Finds the minimum value in a subtree.
     * This is used to find the inorder successor when deleting a node with two children.
     *
     * @param node The root of the subtree.
     * @return The minimum value in the subtree.
     */
    private int minValue(TreeNode node) {
        int minVal = node.data; // Start with the root's value.

        // Traverse to the leftmost node to find the minimum value.
        while (node.left != null) {
            minVal = node.left.data; // Update the minimum value.
            node = node.left; // Move to the left child.
        }

        return minVal; // Return the smallest value in the subtree.
    }
    
    
    /**
     * Searches for a value in the Binary Search Tree (BST).
     *
     * @param root The root of the BST.
     * @param val The value to search for.
     * @return The TreeNode containing the value, or null if not found.
     */
    public TreeNode searchBST(TreeNode root, int val) {
        // Base case: If the tree is empty or the value matches the root, return the root.
        if (root == null || root.data == val)
            return root;

        // If the value is less than the current node's data, search in the left subtree.
        if (val < root.data) 
            return searchBST(root.left, val);

        // If the value is greater than the current node's data, search in the right subtree.
        return searchBST(root.right, val);
    }
}
