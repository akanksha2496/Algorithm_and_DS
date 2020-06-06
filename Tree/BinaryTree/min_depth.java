package Find_minimum_depth_of_BT;
public class min_depth {
	public static void main(String[] args)
	{
		
//       BT creation
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);
		root.right.left.right.left = new Node(9);
		root.right.left.right.right = new Node(10);
//
		printVertical(root);
	}
}
