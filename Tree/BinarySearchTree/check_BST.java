package check_for_BST;

class Node
{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}

public class check_BST {
	
	static boolean BST(Node root,int min,int max)
	{
		if(root==null)
			return true;
	    if(root.data<min || root.data>max)
	    {
	    	return false;
	    }
	   
	    return  BST(root.left,min,root.data) && BST(root.right,root.data,max);
	}
	
	public static void main(String arr[])
	{
		Node root=new Node(10);
		root.left=new Node(10);
		root.left=new Node(-5);
		root.right=new Node(19);
		root.right.left=new Node(17);
		root.right.right=new Node(21);
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		System.out.println(BST(root,min,max));
		
	}

}
