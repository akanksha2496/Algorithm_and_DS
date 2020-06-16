package rem;

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }

class reve {
    
    public static Node reverse(Node node, int k)
    {
        Node ptr=node;
        while(k-->0)
        {
            ptr=ptr.next;
        }
        Node  prev=ptr,cur=node,next=node.next;
        while(cur!=ptr)
        {
         next=cur.next;
         cur.next=prev;
         prev=cur;
         cur=next;
        }
        node=prev;

       return node;
      }
    public static void main(String ar[])
    {
     //5 9 9 3 5 6 6 2 8 2 	
    	Node root=new Node(5);
    	root.next=new Node(9);
    	root.next.next=new Node(9);
    	root.next.next.next=new Node(3);
    	root.next.next.next.next=new Node(5);
    	root.next.next.next.next.next=new Node(6);
    	root.next.next.next.next.next.next=new Node(6);
    	root.next.next.next.next.next.next.next=new Node(2);
    	root.next.next.next.next.next.next.next.next=new Node(8);
    	root.next.next.next.next.next.next.next.next.next=new Node(2);
    	
    	Node sum=reverse(root,3);
    	while(sum!=null)
    	{
    		System.out.print(sum.data+" ");
    		sum=sum.next;
    	}
    	
    }
    
}
