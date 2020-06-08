package smallest_window_in_a_string_containing_all_character_of_another_string;

import java.util.HashMap;
import java.util.Map;

//for logic:- https://www.youtube.com/watch?v=b9OgfHDFNlo
public class smallest_window {


		public static void main(String ar[])
        {
        	String s1="astringcontaining";
        	String s2="aig";
        	System.out.print(minWindow(s1,s2));
        }

		private static String minWindow(String s, String t) {
			// TODO Auto-generated method stub
			HashMap<Character,Integer> window=new HashMap<>();
			for(int i=0;i<t.length();i++)
			{
				window.put(t.charAt(i),window.getOrDefault(t.charAt(i),0)+1);
			}
			int required=window.size();
			int l=0,r=0,expected=0;
			int[] ans= {-1,0,0};
			HashMap<Character,Integer> minimumwindow=new HashMap<>();
			while(r<s.length())
			{
				minimumwindow.put(s.charAt(r),minimumwindow.getOrDefault(s.charAt(r),0)+1);
				if(window.containsKey(s.charAt(r)) && minimumwindow.get(s.charAt(r))==window.get(s.charAt(r)))
				{expected++;}
				while(expected==required && l<r)
				{
					if(ans[0]==-1 || ans[0]>(r-l+1))
					{
						ans[0]=r-l+1;
						ans[1]=l;
						ans[2]=r;
					}
				    minimumwindow.put(s.charAt(l),minimumwindow.get(s.charAt(l))-1);
					if(window.containsKey(s.charAt(l)) && minimumwindow.get(s.charAt(l))<window.get(s.charAt(l)))
					{
						expected--;
					}
					l++;
				}
				r++;
			}
			return ans[0]==-1?null:s.substring(ans[1],ans[2]+1);
		}

	
}
