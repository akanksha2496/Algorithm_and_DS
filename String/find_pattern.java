package match;
public class find_pattern {
	public static void main(String ar[])
	{
		String str1="AABCAACNDFGAAGHJKAABNMKLLAAPOAA";
		String str2="AA";
		int count=findAlltheCount(str1,str2);
		System.out.print(count);
	}

	private static int findAlltheCount(String str1, String str2) {
		// TODO Auto-generated method stub
		int count=0;
		int index=0;
		while(true)
		{
			index=str1.indexOf(str2,index);
			System.out.println("index : "+index);
			if(index==-1)
			{
				return count;
			}			
			else
			{
				count++;
				index+=str2.length();
			}
		}
	}

}
