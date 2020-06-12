
package lucky;
public class lucky_or_not {
	public static void main(String ar[])
	{
		if(isLuckyOrNot(19))
			System.out.println("yes");
		else
			System.out.println("no");
	}

	static int counter=2;
	private static boolean isLuckyOrNot(int i) {
		 
		 System.out.println(i);
		  int nextpos=i;
		  if(i<counter)
			  return true;
		  if(i%counter==0)
			  return false;
		 
		  //shifting of number by its position
		  //i number mean ith number.
		  nextpos-=nextpos/counter;
		  counter++;
		  
		 
			  
		return isLuckyOrNot(nextpos);
	}
}
