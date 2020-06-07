package maximum_occur;

import java.util.HashMap;

public class maximum_occur {
 
	public static void main(String ar[])
	{
		
		HashMap<Character,Integer> h=new HashMap<>();
		
		String s="AAVINDR";
		int i=0;
		int max=0;
		Character c='\0';
	    while(i<s.length())
		{
			if(!h.containsKey(s.charAt(i)))
			{
				h.put(s.charAt(i),1);
			}else
			{
				h.put(s.charAt(i),h.get(s.charAt(i))+1);
			}
			if(h.get(s.charAt(i))>max)
			{
			max=h.get(s.charAt(i));
			c=s.charAt(i);
			}
			i++;
		}
	    System.out.println(c);
		
	}
}
