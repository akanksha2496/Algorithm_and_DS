package level_order_traversal;
import java.util.Queue;
import java.util.LinkedList;
class Node
{
	int data;
	Node right,left;
	Node(int data)
	{
		this.data=data;
		right=left=null;
	}
}
public class level_order_traversal {
	
	public static void main(String ar[])
	{
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		root.right.left=new Node(60);
		root.right.right=new Node(70);
		levelOrder(root);
	}

	private static void levelOrder(Node root) {
		// TODO Auto-generated method stub
		if(root!=null)
		{
			Queue<Node> q=new LinkedList<Node>();
			q.add(root);
			Node temp;
			while(q.isEmpty()!=true)
			{
				temp =q.remove();
				System.out.print(temp.data+" ");
				if(temp.left!=null)
					q.add(temp.left);
			    if(temp.right!=null)
			    	q.add(temp.right);
			}
		}
	}

}
