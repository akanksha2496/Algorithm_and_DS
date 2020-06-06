package diameter;

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
//PAir class for returning h and d both;
class Pair
{
	int h;
     int d;
}

public class diameter {
	
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
//		traversal(root);
//		WC(nlogn) and BC(n2)--------n*h
		System.out.println(dia(root));
//		optimised Version in which height and diameter coutn without using height ();
		System.out.println(heightdia(root).d);
	}
	private static Pair heightdia(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
		  Pair P=new Pair();
		  P.h=0;
		  P.d=0;
		  return P;
		}
		Pair L=heightdia(root.left);
		Pair R=heightdia(root.right);
		int a=L.d;
		int b=R.d;
		int c=Math.max(L.h,R.h)+1;
		Pair P=new Pair();
		P.h=c;
		P.d=Math.max(c,Math.max(a,b));
		
		
		return P;
	}
	private static int dia(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		int Lheight=height(root.left);
		int Rheight=height(root.right);
		int diameterL=dia(root.left);
		int diameterR=dia(root.right);
		
		return Math.max(Lheight+Rheight, Math.max(diameterL, diameterR));
	}
	private static int height(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		return 1+Math.max(height(root.left),height(root.right));
	}
}
