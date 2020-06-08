package celebrity_problem;

import java.util.Stack;

public class celebrity {
	static int MATRIX[][] = { { 0, 0, 1, 0 }, 
            { 0, 0, 1, 0 }, 
            { 0, 0, 0, 0 }, 
            { 0, 0, 1, 0 } }; 
	public static void main(String ar[])
	{
		
		//step 1:push every person on the stack;
		Stack<Integer> s=new Stack<>();
		for(int i=0;i<MATRIX.length;i++)
		{
			s.push(i);
		}
       //step 2: while stack is not empty push them on the stack
		//if a know b then b is celebrity drop a
		//if a does't know b then a may be celebrity push a and drop b;
		while(s.size()>1 )
		{
			
			int a=s.pop();
			int b=s.pop();
			if(knows(a,b))
			{
				s.push(b);
			}
			else
			{
				s.push(a);
			}
		}
		int c=s.pop();
		
		int flag=0;
		for(int i=0;i<MATRIX.length;i++)
		{
			if(i!=c && knows(c,i)==true && knows(i,c)==false)
			{
				System.out.print("no celebrity");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print(c);
		}

	}

	private static boolean knows(int a, int b) {
		// TODO Auto-generated method stub
		
		return MATRIX[a][b]==1?true:false; 
	}

}
