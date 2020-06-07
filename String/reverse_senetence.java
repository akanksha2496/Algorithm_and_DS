package reverse_the_words_in_a_given_string;

public class reverse_senetence {
	public static void main(String ar[])
	{
		String s="This is a class";
		String ans1="";
		int j=0;
		for(int i=0;i<s.length() && j<s.length();)
		{
			while(j<s.length() && s.charAt(j)!=' ')
			{j++;	
			}
          
			ans1=reverse(s,i,j-1,ans1)+" ";
			j+=1;
			i=j;
						
		}
		System.out.println(ans1+":BEFORE");
		String ans2="";
		System.out.println(reverse(ans1,0,ans1.length()-1,ans2)+" :AFTER");
	}

	private static String reverse(String s, int i, int j,String ans1) {
		// TODO Auto-generated method stub
		for(int i1=j;i1>=i;i1--)
		{
			ans1+=s.charAt(i1);
		}
		return ans1;
		
	}
	

}
