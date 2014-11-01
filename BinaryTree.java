
public class BinaryTree {

	private static class Node {

		Node left;
		Node right;
		int data;
		Node (int data) { 
			this.data = data;
			left = null;
			right = null;
		}

	}

	public Node root;
	public int counter ;

	public void BinaryTree() { 
		root = null; 
	}
	// returns true if tree contains element data
	public boolean lookup(int data) {
		return lookup(this.root,data);

	}

	private boolean lookup(Node root,int data) {

		if (root == null){
			return false;
		}
		System.out.println("Currently at " + root.data + " Looking for " + data);
		if (root.data == data) { 
			return true ; 
		} 
		else if (root.data < data) {
			return lookup(root.left,data) ;
		}
		else  { 
			return lookup(root.right,data) ; 
		}

	}


	public void insert (int data) { 

		root = insert(this.root,data);

	}

	private Node insert (Node node, int data) { 
		if (node == null) { 
			node = new Node(data);
			this.counter++;

		}
		else { 
			if (data <= node.data) { 
				node.left = insert(node.left,data);
			}
			else  { 
				node.right = insert(node.right,data);
			}

		}
		return node ;
	}


	public int size(Node node) { 
		if (node == null) { return 0; } 
		else { 
			return  size(node.left) + 1 +  size(node.right);
		}
	}
	public void size () { 
		System.out.println(size(this.root));
	}
	public void maxDepth () { 
		System.out.println(maxDepth(this.root));
	}

	private int maxDepth(Node node) { 
		if (node == null) { return 0 ; } 
		else { 
			return 1 + Math.max(maxDepth(node.left),maxDepth(node.right) );
		}
	}

	public void minValue() { 
		System.out.println(minValue(this.root));
	}

	public int minValue(Node node) { 

		Node iterator = node;
		while (iterator.left != null) { 
			iterator = iterator.left;
		}
		return iterator.data;
	}
	//left , itself , right
	public void inorderPrint(Node node) { 
		if (node == null) return ;
		inorderPrint(node.left);
		System.out.println("Node value: " + node.data);
		inorderPrint(node.right);
	}

	public void postorderPrint(Node node) { 
		if (node == null) return ;
		inorderPrint(node.left);
		inorderPrint(node.right);
		System.out.println("Node value: " + node.data);
	}
	public void preorderPrint(Node node) { 
		if (node == null) return ;
		System.out.println("Node value: " + node.data);
		inorderPrint(node.left);
		inorderPrint(node.right);

	}








	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BinaryTree numbers = new BinaryTree();
		numbers.insert(9);
		numbers.insert(8);
		numbers.insert(1);
		numbers.insert(3);
		numbers.insert(3);
		numbers.maxDepth();
		numbers.size();
		numbers.minValue();
		numbers.inorderPrint(numbers.root);
		numbers.postorderPrint(numbers.root);

	}

}

