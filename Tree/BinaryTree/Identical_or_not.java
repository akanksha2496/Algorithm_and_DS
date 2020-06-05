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
public class Identical_or_not {
	static boolean check(Node root1,Node root2)
	{
		if(root1==null && root2==null)
			return true;
		if(root1!=null && root2!=null)
		{
			return  root1.data==root2.data && check(root1.left,root2.left) && check(root1.right,root2.right);
		}
		return false;
		
	}
	
   public static void main(String ar[])
   {
//	  make tree initially root1 root2 
	   Node root1=new Node(10);
	   root1.left=new Node(20);
	   root1.right=new Node(30);
	   root1.left.left=new Node(40);
	   root1.left.right=new Node(50);
	 
       
	   Node root2=new Node(10);
	   root2.left=new Node(20);
	   root2.right=new Node(30);
	   root2.left.left=new Node(40);
	   root2.left.right=new Node(50);
	   root2.right.left=new Node(60);
	   root2.right.right=new Node(70);
	   
	   System.out.println(check(root1,root2));
         
   }
}
