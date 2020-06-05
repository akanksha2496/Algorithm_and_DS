package tree1;
class Node
{
  int data;
  Node left,right;
  Node(int data)
  {
	  this.data=data;
  }
}
public class number_of_nodes {
	static int count=0;
	static void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			++count;
			inorder(root.right);
		}
	}
	static int count(Node root)
	{
		if(root==null)
			return 0;
	    return 1+count(root.left)+count(root.right);
	}
	
   public static void main(String ar[])
   {
	   Node root=new Node(10);
	   root.left=new Node(20);
	   root.right=new Node(30);
	   root.left.left=new Node(40);
	   root.left.right=new Node(50);
	   root.right.left=new Node(60);
	   root.right.right=new Node(70);
//	   by trvaersaal
	   inorder(root);
	   System.out.println(count);
	   System.out.println(count(root));
//  number of node in left subtree + right suvbtree +1
   }
}
