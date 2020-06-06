package finding_level_of_a_given_node;

//TC is O(n) and space complexity dpeneds on height of the tree bcs 0f recursion
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
public class level_of_key {
	static void traversal(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			traversal(root.left);
			traversal(root.right);
		}
	}
	public static void main(String ar[])
	{
		Node root=new Node(32);
		root.left=new Node(12);
		root.right=new Node(60);
		root.left.left=new Node(45);
		root.left.right=new Node(65);
		root.left.left.left=new Node(451);
		root.left.left.left.left=new Node(165);
//		assume that root started at 1;
//		do start with height 0 if u want to start level of height from 0;
        System.out.println(find_key_level(root,0,165));
	}
	private static int find_key_level(Node root,int height,int key) {
		if(root==null)
		 return 0;
		else if(root.data==key)
			return height;
		else
		{
			int Left=find_key_level(root.left,height+1,key);
			int Right=find_key_level(root.right,height+1,key);
			return Left!=0?Left:Right;
		}
		// TODO Auto-generated method stub
		
	}

}
