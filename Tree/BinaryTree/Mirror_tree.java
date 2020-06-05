/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Node
{
  int data;
  Node left,right;
  Node(int data)
  {
	  this.data=data;
  }
}
public class Main {
	static int count=0;
	static void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
    static void mirror(Node root)
    {
        if(root!=null)
        {
         mirror(root.left);
         mirror(root.right);
         Node  temp=root.left;
         root.left=root.right;
         root.right=temp;
        }
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
	   System.out.println();
	   mirror(root);
	   System.out.println();
	   inorder(root);
//  number of node in left subtree + right suvbtree +1
   }
}

