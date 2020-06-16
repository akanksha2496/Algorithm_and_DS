/*You are required to complete this method */
//pass str as a string
class GfG
{
    int atoi(String str)
    {
	// Your code here
	int ans=0,sign=1;
	  for(int i=0;i<str.length();i++)
	  {
	      int x=(int)str.charAt(i);
	      if(str.charAt(i)=='-')
	         sign=-1;
	      else if(x>=48 && x<=57)
	      {
	         ans=ans*10+(str.charAt(i)-'0');
	      }
	      else
	      return -1;
	    
	  }
	  
	  return ans*sign;
    }
}
