
package rem;

import java.util.*;

class rem {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    
	    while(t-->0)
	    {
	    	 Scanner sc=new Scanner(System.in).useDelimiter("\n");
	        String a=sc.next();
	        LinkedHashSet<Character> h = new LinkedHashSet<>(); 
	        int i1=0;
	        while(a.length()>i1)
	        {
	            h.add(a.charAt(i1));
	            i1++;
	  	    }
	        for(Character c:h)
	        {
	            System.out.print(c);
	        }
	        System.out.println();
	    }
		//code
	}
}
