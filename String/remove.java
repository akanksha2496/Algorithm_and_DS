package remove_duplicate_character;

import java.util.HashMap;

public class remove {
	public static void main(String ar[])
	{
		String s="Akanaksha";
		HashMap<Character,Integer> h=new HashMap<>();
		String ans="";
		int i=0;
		while(i<s.length())
		{
			if(!h.containsKey(s.charAt(i)))
			{
				ans+=s.charAt(i)+"";
				h.put(s.charAt(i), 1);
			}
			i++;
			
		}
		System.out.println(ans);
	}

	

}
