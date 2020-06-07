package find_max_occuring_character_using_BST_of_string;

class Node
{
	Character s;
	Node left,right;
	int count;
	Node(Character s,int count)
	{
		this.s=s;
		this.count=count;
		left=null;
		right=null;
	}
	}
public class BST_string {
	static int max_count=0;
	static char c='\0';
    public static void main(String ar[])
    {
    	String a="PACKAGE 25 LAKH";
    	int i=1;
    	Node root=new Node(a.charAt(0),1);
    	max_count=1;
    	c=a.charAt(0);
    	while(i<a.length())
    	{
    	    search_and_insert(a.charAt(i),root);
    	    i++;
    	}
    	traverse(root);
    	System.out.println("maximum character: "+c);
    }

	private static void traverse(Node root) {
		// TODO Auto-generated method stub
		if(root!=null)
		{
			traverse(root.left);
			System.out.print(root.s+" ");
			traverse(root.right);
		}
			
		
	}

	private static void search_and_insert(char charAt, Node root) {
		// TODO Auto-generated method stub
		int data=(int) root.s;
		int key=(int)charAt;
		if(data==key)
		{
			root.count=root.count+1;
			if(root.count>=max_count)
			{
				max_count=root.count;
				c=charAt;
			}
		}
		else if(data<key)
		{
			if(root.right!=null)
			{
				search_and_insert(charAt,root.right);
			}
			else
			{
			    Node n=new Node(charAt,1);
			    root.right=n;
			}
		}
		else if(data>key)
		{
			if(root.left!=null)
			{
				search_and_insert(charAt,root.left);
			}
			else
			{
				Node n=new Node(charAt,1);
			    root.left=n;
			}
		}
		
		
	}
}
