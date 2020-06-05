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
public class Construct_tree_from_post_inOrder {
	
   static void display(Node n)
   {
	   if(n!=null)
	   {
		   
		   display(n.left);
		  
		   display(n.right);
		   System.out.print(n.data+" ");
	   }
   }	
   public static void main(String ar[])
   {
//	  make tree initially root1 root2 
	 int[] postorder= {3,2,1,4};
	 int[] inorder= {1,2,3,4};
	 int l=0,r=inorder.length-1;
	 while(l<r)
	 {
		 int temp=postorder[l];
		 postorder[l]=postorder[r];
		 postorder[r]=temp;
		 l++;
		 r--;
	 }
	 Node n=build_Tree(inorder,postorder);
     display(n);     
   }
   
   static Node buildHelper(int[] inorder,int[] postorder,int inS,int inE,int preS,int preE)
   {
//	   base case is imp:
	  if(inS>inE)
	  {
//		  System.out.println(postorder[preS]);
		  return null;   
	  }
		 
	   
	  int rootpre=preS;
	  int rootin=0;
	  for(int i=inS;i<=inE;i++)
	  {
		   if(postorder[preS]==inorder[i])
			   {rootin=i;break;}
	  }
	  int inLs=inS;
	  int inLe=rootin-1;
	  int inRs=rootin+1;
	  int inRe=inE;
	  int preLs=preS+1;
	  int preLe=inLe-inLs+preLs;
	  int preRs=preLe+1;
	  int preRe=preE;
	  System.out.println("preLs-"+preLs+" preLe-"+preLe+" preRs-"+preRs+" preRe-"+preRe+" inLs-"+inLs+" inLe-"+inLe+" inRs-"+inRs+" inRe-"+inRe);
	  
	  Node n=new Node(inorder[rootin]);
	  n.left=buildHelper(inorder,postorder,inLs,inLe,preLs,preLe);
	  n.right=buildHelper(inorder,postorder,inRs,inRe,preRs,preRe);
	  
	  return n;
   }

private static Node build_Tree(int[] inorder, int[] postorder) {
	// TODO Auto-generated method stub
	return buildHelper(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
}


}