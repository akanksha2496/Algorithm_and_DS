package LCA;


import java.util.Stack;

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

public class LCA {
	public static void main(String ar[])
	{
		Node root=new Node(32);
		root.left=new Node(16);
		root.right=new Node(40);
		root.left.left=new Node(14);
		root.left.right=new Node(24);
		root.right.left=new Node(37);
		root.right.right=new Node(51);
		root.left.right.left=new Node(20);
		root.left.right.right=new Node(25);
		root.right.left.left=new Node(34);
		root.right.right.left=new Node(45);
		root.right.right.right=new Node(72);
		System.out.println("iterative method LCA in BST");
		System.out.println(LCA_(14,20,root));
		System.out.println(LCA_(16,25,root));
		System.out.println(LCA_(34,51,root));
		System.out.println(LCA_(20,72,root));
        System.out.println("recursive method LCA in BST:");
		System.out.println((LCA_recursive(14,20,root)).data);
		System.out.println((LCA_recursive(16,25,root)).data);
		System.out.println((LCA_recursive(34,51,root)).data);
		System.out.println((LCA_recursive(20,72,root)).data);
	
		Node root1=new Node(1);
		root1.left=new Node(2);
		root1.right=new Node(3);
		root1.left.left=new Node(4);
		root1.left.right=new Node(5);
		root1.right.left=new Node(6);
		root1.right.right=new Node(7);

		System.out.println("iterative method LCA in BT fail with this approach ");
		System.out.println(LCA_BT(4,5,root1));
		System.out.println(LCA_BT(4,6,root1));
		System.out.println(LCA_BT(6,7,root1));
		System.out.println(LCA_BT(2,5,root1));
        System.out.println("recursive method LCA in BT:");
		System.out.println((LCA_recursive_BT(4,5,root1)).data);
		System.out.println((LCA_recursive_BT(4,6,root1)).data);
		System.out.println((LCA_recursive_BT(6,7,root1)).data);
		System.out.println((LCA_recursive_BT(2,5,root1)).data);
	}
	private static Node LCA_recursive_BT(int i, int j, Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return null;
		if(root.data==i || root.data==j)
			return root;
		Node rootL=LCA_recursive_BT(i,j,root.left);
		Node rootR=LCA_recursive_BT(i,j,root.right);
		if(rootL!= null && rootR!=null)
			return root;
		return (rootL!=null)?rootL:rootR;
	}
	
	private static int LCA_BT(int i, int j, Node root) {
		int[] a=new int[100];
		int[] b=new int[100];
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		Node ptr;
		int x=0,y=0;
		while(stack.isEmpty()==false)
		{
			ptr=stack.pop();
			if(ptr.data==i)
				break;
			
			a[x++]=ptr.data;
//			System.out.println("a[x]-"+a[x-1]);
			if(ptr.right!=null)
			  stack.push(ptr.right);
			if(ptr.left!=null)
			  stack.push(ptr.left);	
		}
		stack.push(root);
		while(stack.isEmpty()==false)
		{
			ptr=stack.pop();
			if(ptr.data==j)
				break;
			
			b[y++]=ptr.data;
//			System.out.println("b[y]-"+b[y-1]);
			if(ptr.right!=null)
			  stack.push(ptr.right);
			if(ptr.left!=null)
			  stack.push(ptr.left);	
		}
		int p=0,q=0,lca=0;
		while(p<x && q<y)
		{
			if(a[p]==b[q])
			{
//				System.out.println("a[p]-"+a[p]+" a[q]-"+a[q]);
				lca=a[p];
				p++;q++;
			}
			else
				break;			
		}
		
		
		
		return lca;
		// TODO Auto-generated method stub
	     
	}
	private static Node LCA_recursive(int i, int j, Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return null;
		if(root.data==i || root.data==j)
			return root;
		else
		{
			if(root.data<i && root.data<j)
				return LCA_recursive(i,j,root.right);
			else if(root.data>i && root.data>j)
				return LCA_recursive(i,j,root.left);
			else 
				return root;
						
		}
	}
	private static int LCA_(int i, int j, Node root) {
		// TODO Auto-generated method stub
		int lca=0;
		while(root!=null)
		{
			if(root.data==i || root.data==j)
			{
				lca=root.data;
				break;
			}
			if(root.data>i && root.data>j)
				root=root.left;
			else if(root.data<i && root.data<j)
				 root=root.right;
			else
				return root.data;
		}       
		
		return lca;
	}

}
