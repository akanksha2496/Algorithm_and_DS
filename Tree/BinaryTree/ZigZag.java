//Question: https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1
//https://www.youtube.com/watch?v=YsLko6sSKh8


class Spiral
{
      void printSpiral(Node node) 
      {
           // Your code here
           if(node==null)
           return;
           Stack<Node> s1=new Stack<>();
           Stack<Node> s2=new Stack<>();
           s1.push(node);
           while(s1.size()>0 || s2.size()>0)
           {
               while(s1.size()>0)
               {
                   Node temp=s1.pop();
                   System.out.print(temp.data+" ");
                   if(temp.right!=null)
                   s2.push(temp.right);
                   if(temp.left!=null)
                   s2.push(temp.left);
               }
              while(s2.size()>0)
                   {
                       Node temp=s2.pop();
                       System.out.print(temp.data+" ");
                       if(temp.left!=null)
                       s1.push(temp.left);
                       if(temp.right!=null)
                       s1.push(temp.right);
                  }
           }
      }
}
